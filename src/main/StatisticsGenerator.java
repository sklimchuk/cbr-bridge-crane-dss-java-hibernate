package main;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Set;

import model.CBRCase;
import model.DefectsSheet;
import model.Metallware;
import model.Passport;
import model.Resistance;
import model.Visual;

import org.hibernate.SessionFactory;

import config.HibernateDao;
import config.HibernateUtil;
import config.SimilarityUtil;

public class StatisticsGenerator {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		CBRCase cbrcase = new CBRCase();
		cbrcase.setComments("Create");
		//HibernateDao.saveOrUpdate(sf, cbrcase);
		//HibernateDao.deleteAll(sf, CBRCase.class);
		
		//Поиск по первичному ключу
		//cbrcase = (CBRCase) HibernateDao.findByPK(sf, CBRCase.class, 9L);
		//System.out.println(cbrcase.getComments());
		
		//Поиск всех записей
		/*
		List objects = HibernateDao.findAll(sf, CBRCase.class);
		  for (int i=0; i<objects.size(); i++) {
			  cbrcase = (CBRCase) objects.get(i);
			  System.out.println(cbrcase.toString());
		  }
		*/
		
		//Поиск записей по подстроке
		/*
		List objects = HibernateDao.findByString(sf, CBRCase.class, "eat");
		  for (int i=0; i<objects.size(); i++) {
			  cbrcase = (CBRCase) objects.get(i);
			  System.out.println(cbrcase.toString());
		  }
		*/

		//Удаление 1-й записи
		//HibernateDao.delete(sf, HibernateDao.findByPK(sf, CBRCase.class, 4L));
		
		int numberOfRecords = 5;
		GeneratePassport(numberOfRecords);
		GenerateResistance(numberOfRecords);
		GenerateMetallware(numberOfRecords);
		GenerateDefectsSheet(numberOfRecords);
		GenerateVisual(numberOfRecords);
		
		//Этот генератор нужно вызывать последним, т.к. он содержит НЕНУЛЕВЫЕ поля-внешние ключи других таблиц.
		GenerateCBRCase(numberOfRecords);
	
		//Поиск по первичному ключу
		cbrcase = (CBRCase) HibernateDao.findByPK(sf, CBRCase.class, 5L);
		System.out.println(cbrcase);

		for(Field field : cbrcase.getClass().getDeclaredFields()) {
			 System.out.println("Field name = " + field.getName());
	         System.out.println("Field type = " + field.getType().getName());
		}
		//SimilarityUtil s = new SimilarityUtil();
		//s.CaseSimilarity();
				
	}
	//Генерирование тестовых прецедентов
	public static void GenerateCBRCase(int numberOfRecords){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		CBRCase cc = null;
		for (int k=0; k<numberOfRecords; k++){
			cc = new CBRCase();
			// <!-- CaseDescription --> 
			cc.setComments("Тут будут комментарии");
			Calendar cal = Calendar.getInstance(); 
		        cal.add(Calendar.YEAR, -generateRandom(4));
			cc.setAgreement("Договор №"+generateRandom(30)+" от "+cal.getTime());
			cc.setInspectionDate(Calendar.getInstance().getTime());
			cc.setCraneState("В рабочем состоянии");
			cc.setRailDifference(generateRandom(15));
			cc.setInspectionCause("Истек срок службы");
			
			//<!-- FK из подчиненных таблиц -->
			cc.setPassport((Passport) HibernateDao.findByPK(sf, Passport.class, Long.valueOf(k+1)));//+1 для предотвращения передачи нулевого индекса записи
			//System.out.println(cc.getPassport());
			
			cc.setResistance((Resistance) HibernateDao.findByPK(sf, Resistance.class, Long.valueOf(k+1)));
			cc.setMetallware((Metallware) HibernateDao.findByPK(sf, Metallware.class, Long.valueOf(k+1)));
			cc.setVisual((Visual) HibernateDao.findByPK(sf, Visual.class, Long.valueOf(k+1)));
	
			
			//<!-- CaseSolution -->
			cc.setResult("Здесь будет результат обследования");
			cc.setGeneralState("Работоспособное");
			cc.setEliminatedDefects(generateRandom(10));
			cc.setNeedEliminateDefects(generateRandom(10)); //это поле должно рассчитываться на основе к-ва дефектов из всех таблиц.
			cc.setStaticTestPassed(k%7==0? false : true);
			cc.setDynamicTestPassed(k%7==0? false : true);
			cc.setIdleTestPassed(k%7==0? false : true);
			cal.add(Calendar.YEAR, +generateRandom(6));
			cc.setNextInspectionDate(cal.getTime());
			
			HibernateDao.saveOrUpdate(sf, cc);
		}
		
	}
	
	//Все справочные данные о кране
	public static void GeneratePassport(int numberOfRecords) throws ParseException{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Random generator = new Random();
		int mainScale = 2;
		String maker[]	= {"'Подъемник', г. Ташкент", "Александровский завод ПТМ", "Могилевский завод ПТО", "Завод ПТО им. С.М.Кирова", "Харьковский завод ПТО"};
		String purpose[]	= {"Подъемно-транспортные работы", "Монтаж и демонтаж ПТО"};
		String locality[]	= {"ОП 'Шахта Красный партизан'", "ЗАО Луганский трубный завод", "ЗАО Северодонецкое объединение Азот"};
		String placement_location[] = {"На открытом воздухе", "Отапливаемое", "Под навесом", "Не отапливаемое"};
		Passport p = null;
		for (int k=0; k<numberOfRecords; k++)
		{
			//----------------------------------------------Пасп. данные крана
			p = new Passport();
			p.setHoistingCapacityMain(roundDownScale(60 - generateRandom(30), mainScale)); 		//Г/п, т  Мех-ма гл. подъема
			p.setHoistingCapacityAux(roundDownScale(10 - generateRandom(5), mainScale));		//Г/п, т Мех-ма вспом. подъема
			p.setClassGroup("легкий");								//Группа классиф.
			p.setHoistingHeight(roundDownScale(120 - generateRandom(55), mainScale));		//Высота подъема, м
			p.setWidth(roundDownScale(20 - generateRandom(3), mainScale));				//Пролет, м
			p.setBase(roundDownScale(5 - generateRandom(2), mainScale));				//База, м
			p.setLoadLiftingSpeed(roundDownScale(5 - generateRandom(2), mainScale));		//Скорость, м/мин  Подъема груза
			p.setCrabLiftingSpeed(roundDownScale(20 - generateRandom(3), mainScale));		//Скорость, м/мин	Передв. тележки
			p.setCraneLiftingSpeed(roundDownScale(33 - generateRandom(8), mainScale));		//Скорость, м/мин	Передв. крана
			p.setWheelLoad(roundDownScale(30 - generateRandom(10), mainScale));			//Нагрузка на колеса, т
			p.setCraneMass(roundDownScale(50 - generateRandom(20), mainScale));			//Масса крана, т
			p.setAirTemperatureMax(roundDownScale(50 - generateRandom(8), mainScale));		//Темпер. окр. среды, С	Наиб.
			p.setAirTemperatureMin(roundDownScale(0 - generateRandom(5), mainScale));		//Темпер. окр. среды, С	Наим.
			p.setMainBeamMaterial("Сталь: 09Г2 / ГОСТ: 19282-73");					//Сведения о материалах, из котор. главные балки	[Марка: Ст3, ГОСТ: 350-500]
			p.setEndGirderMaterial("Сталь: 17ГC12 / ГОСТ: 19282-73");				//Сведения о материалах, из котор. концевые балки	[Марка: Ст3, ГОСТ: 350-500]
			p.setBogieFrameMaterial("Сталь: 09Г2С / ГОСТ: 19282-73");				//Сведения о материалах, из котор. рама тележки	[Марка: Ст3, ГОСТ: 350-500]
			
			//----------------------------------------------Общие сведения о кране
			p.setType("Мостовой электрический");
			p.setModel("ГОСТ 3332-54");
			p.setMaker(k%3==0? maker[generateRandom(5)] : maker[generateRandom(5)]);
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			int year = generateRandom(50)+1950;
			Date due_date = df.parse(generateRandom(20)+"/"+generateRandom(12)+"/"+year);		// "20/12/2005");
			//Calendar cal = Calendar.getInstance(); 
            		//cal.add(Calendar.YEAR, -generateRandom(40));
            		p.setDueDate(due_date);//cal.getTime());
               		p.setMakerNumber(Integer.toString(generateRandom(10000)));
            		p.setRegNumber(Integer.toString(generateRandom(100000)));
            
		        //дата ввода в эксплуатацию не может быть больше даты изготовления
		        year = year +1;
            		due_date = df.parse(generateRandom(20)+"/"+generateRandom(12)+"/"+year);// "20/12/2005");
            		p.setStartDate(due_date);
			p.setPurpose(k%3==0? purpose[generateRandom(1)] : purpose[generateRandom(2)]);
            		p.setLocality(k%3==0? locality[generateRandom(1)] : locality[generateRandom(3)]);
            		p.setInstallObject("Корпус "+generateRandom(10)+" цех "+generateRandom(5));
            		p.setInspectionsAmount(generateRandom(5));
			
            		//Характер работы+расчет фактич. РР
            		p.setTotalWorkTime(generateRandom(20)); //надо рассчитывать это поле от даты эксплуатации
			p.setLifeTime(12+generateRandom(20));
			p.setHoistingCapacity(generateRandom(15));
			p.setCargoPerDay(generateRandom(10));
			p.setWorkInfo(k%3==0? purpose[generateRandom(1)] : purpose[generateRandom(2)]);
			p.setCycleQuantity(generateRandom(70));
			p.setOperationModeGroup("Рассчет фактического РР");
			p.setWorkTemperaturePassport(-generateRandom(40));
			p.setWorkTemperatureCurrent(0);
			p.setEnvironmentInfo("нормальная");
			p.setPlacementLocation(k%3==0? placement_location[generateRandom(1)] : placement_location[generateRandom(4)]);
			p.setExpertInfo("ФИО эксперта");
			
			HibernateDao.saveOrUpdate(sf, p);
		}
				
	}
	
	//Данные по сопротивлению изоляции и переходных контактов	
	public static void GenerateResistance(int numberOfRecords){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Resistance r = null;
		double v = 0.1;
		for (int k=0; k<numberOfRecords; k++){
					
			r = new Resistance();
			
			//-----------------Протокол измерения сопротивления изоляции электрооборудования
			
			//Силовая цепь
			//от кранового рубильника до главного контактора
			r.setContBreakerMainContactorInsulResistAo(300-generateRandom(50));
			r.setContBreakerMainContactorInsulResistBo(300-generateRandom(50));
			r.setContBreakerMainContactorInsulResistCo(300-generateRandom(50));
			r.setContBreakerMainContactorInsulResistAb(300-generateRandom(50));
			r.setContBreakerMainContactorInsulResistBc(300-generateRandom(50));
			r.setContBreakerMainContactorInsulResistCa(300-generateRandom(50));
			r.setMaxContBreakerMainContactorInsulResist(0.5);
			
			//от главного контактора до электродвиг. мех. главного подъема
			r.setContMainLiftInsulResistAo(100+generateRandom(80));
			r.setContMainLiftInsulResistBo(100+generateRandom(80));
			r.setContMainLiftInsulResistCo(100+generateRandom(80));
			r.setContMainLiftInsulResistAb(100+generateRandom(80));
			r.setContMainLiftInsulResistBc(100+generateRandom(80));
			r.setContMainLiftInsulResistCa(100+generateRandom(80));
			r.setMaxContMainLiftInsulResist(0.5);
		
			//от главного контактора до электродвиг. мех. вспомогательного подъема
			r.setContAuxLiftingInsulResistAo(90+generateRandom(10));
			r.setContAuxLiftingInsulResistBo(90+generateRandom(10));
			r.setContAuxLiftingInsulResistCo(90+generateRandom(10));
			r.setContAuxLiftingInsulResistAb(90+generateRandom(10));
			r.setContAuxLiftingInsulResistBc(90+generateRandom(10));
			r.setContAuxLiftingInsulResistCa(90+generateRandom(10));
			r.setMaxContAuxLiftingInsulResist(0.5);
				
			//от главного контактора до электродвиг. мех. передвижения крана №1
			r.setContFirstCraneMovInsulResistAo(60-generateRandom(15));
			r.setContFirstCraneMovInsulResistBo(60-generateRandom(15));
			r.setContFirstCraneMovInsulResistCo(60-generateRandom(15));
			r.setContFirstCraneMovInsulResistAb(60-generateRandom(15));
			r.setContFirstCraneMovInsulResistBc(60-generateRandom(15));
			r.setContFirstCraneMovInsulResistCa(60-generateRandom(15));
			r.setMaxContFirstCraneMovInsulResist(0.5);
	
			//от главного контактора до электродвиг. мех. передвижения крана №2
			r.setContSecondCraneMovInsulResistAo(20+generateRandom(5));
			r.setContSecondCraneMovInsulResistBo(20+generateRandom(5));
			r.setContSecondCraneMovInsulResistCo(20+generateRandom(5));
			r.setContSecondCraneMovInsulResistAb(20+generateRandom(5));
			r.setContSecondCraneMovInsulResistBc(20+generateRandom(5));
			r.setContSecondCraneMovInsulResistCa(20+generateRandom(5));
			r.setMaxContSecondCraneMovInsulResist(0.5);
			
			//от главного контактора до электродвиг. мех. передвижения тележки
			r.setContCarriageMovInsulResistAo(20+generateRandom(5));
			r.setContCarriageMovInsulResistBo(20+generateRandom(5));
			r.setContCarriageMovInsulResistCo(20+generateRandom(5));
			r.setContCarriageMovInsulResistAb(20+generateRandom(5));
			r.setContCarriageMovInsulResistBc(20+generateRandom(5));
			r.setContCarriageMovInsulResistCa(20+generateRandom(5));
			r.setMaxContCarriageMovInsulResist(0.5);
			
			//--------------------Цепи управления
			r.setControlCircuitInsulResist(25-generateRandom(10));
			r.setMaxControlCircuitInsulResist(0.5);
			
			//--------------------Электродвигатели механизмов
						
			//главного подъема
			r.setMainLiftingStator(10-generateRandom(5));
			r.setMaxMainLiftingStator(0.5);
			r.setMainLiftingRotor(5-generateRandom(2));
			r.setMaxMainLiftingRotor(0.2);
			
			//вспомогательного подъема
			r.setAuxLiftingStator(8-generateRandom(3));
			r.setMaxAuxLiftingStator(0.5);
			r.setAuxLiftingRotor(5-generateRandom(2));
			r.setMaxAuxLiftingRotor(0.2);
			
			//передвижения крана №1
			r.setFirstCraneMovStator(1+generateRandom(3));
			r.setMaxFirstCraneMovStator(0.5);
			r.setFirstCraneMovRotor(5-generateRandom(2));
			r.setMaxFirstCraneMovRotor(0.2);
	
			//передвижения крана №2
			r.setSecondCraneMovStator(2+generateRandom(3));
			r.setMaxSecondCraneMovStator(0.5);
			r.setSecondCraneMovRotor(6-generateRandom(2));
			r.setMaxSecondCraneMovRotor(0.2);
			
			//передвижения тележки
			r.setCarriageMovStator(5-generateRandom(2));
			r.setMaxCarriageMovStator(0.5);
			r.setCarriageMovRotor(5-generateRandom(2));
			r.setMaxCarriageMovRotor(0.2);
			
			//--------------------Гидротолкатели тормозов механизмов
			
			//главного подъема
			r.setMainLiftingInsulBrake(6-generateRandom(2));
			r.setMaxMainLiftingInsulBrake(0.5);
			//вспомогательного подъема
			r.setAuxLiftingInsulBrake(6-generateRandom(2));
			r.setMaxAuxLiftingInsulBrake(0.5);
			//передвижения крана №1
			r.setFirstCraneMovInsulBrake(5-generateRandom(2));
			r.setMaxFirstCraneMovInsulBrake(0.5);
			//передвижения крана №2
			r.setSecondCraneMovInsulBrake(5-generateRandom(2));
			r.setMaxSecondCraneMovInsulBrake(0.5);
			//передвижения тележки
			r.setCarriageMovInsulBrake(4-generateRandom(2));
			r.setMaxCarriageMovInsulBrake(4-generateRandom(2));
			
			//Дополнительная информация
			r.setInsulResistInfo("Тут будут примечания");
			r.setInsulResistMeasuringDevice("Прибор для съема показаний");
			r.setInsulResistExpertInfo("ФИО эксперта");
			
			
			//-----------------------Сопротивление переходных контактов цепи
			//Контроллер
			r.setMainLiftController(v);
			r.setMaxMainLiftController(v);
			r.setAuxLiftController(k%6 == 0 ? 0.09 : v);
			r.setMaxAuxLiftController(v);
			r.setCraneMovController(v);
			r.setMaxCraneMovController(v);
			r.setCarriageMovementController(v);
			r.setMaxCarriageMovementController(v);
			
			//Концевой выключатель	limit switch
			r.setMainLiftLimitLwitch(v);
			r.setMaxMainLiftLimitSwitch(v);
			r.setAuxLiftLimitSwitch(v);
			r.setMaxAuxLiftLimitSwitch(v);
			r.setFirstCraneMovLimitSwitch(v);
			r.setMaxFirstCraneMovLimitSwitch(v);
			r.setSecondCraneMovLimitSwitch(v);
			r.setMaxSecondCraneMovLimitSwitch(v);
			r.setFirstCarriageMovLimitSwitch(v);
			r.setMaxFirstCarriageMovLimitSwitch(v);
			r.setSecondCarriageMovLimitSwitch(v);
			r.setMaxSecondCarriageMovLimitSwitch(v);
			r.setDoorBlockLimitSwitch(v);
			r.setMaxDoorBlockLimitSwitch(v);
			
			//Электродвигатели
			r.setMainLiftElmotor(v);
			r.setMaxMainLiftElmotor(v);
			r.setAuxLiftElmotor(k%6 == 0 ? 0.09 : v);
			r.setMaxAuxLiftElmotor(v);
			r.setFirstCraneMovElmotor(v);
			r.setMaxFirstCraneMovElmotor(v);
			r.setSecondCraneMovElmotor(v);
			r.setMaxSecondCraneMovElmotor(v);
			r.setCarriageMovElmotor(v);
			r.setMaxCarriageMovElmotor(v);
			
			//Гидротолкатели
			r.setMainLiftBrake(v);
			r.setMaxMainLiftBrake(v);
			r.setAuxLiftBrake(k%6 == 0 ? 0.09 : v);
			r.setMaxAuxLiftBrake(v);
			r.setFirstCraneMovBrake(v);
			r.setMaxFirstCraneMovBrake(v);
			r.setSecondCraneMovBrake(v);
			r.setMaxSecondCraneMovBrake(v);
			r.setCarriageMovBrake(v);
			r.setMaxCarriageMovBrake(v);
			//Прочее
			r.setSafetyPanel(v);
			r.setMaxSafetyPanel(v);
			r.setElectricHeatingUnit(v);
			r.setMaxElectricHeatingUnit(v);
			r.setContactResistInfo("Тут будут примечания");
			r.setContactResistMeasuringDevice("Прибор для съема показаний");
			r.setContactResistExpertInfo("ФИО эксперта");
			
			HibernateDao.saveOrUpdate(sf, r);
		}
	}
	
	//Сводные данные по контролю металлоконструкции
	public static void GenerateMetallware(int numberOfRecords){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Random generator = new Random();
		int mainScale = 2;
		double v = 0;
		Metallware m = null;
		for (int k=0; k<numberOfRecords; k++){
			m = new Metallware();
			//-------------------------------------------Нивелировка верхнего листа главных! балок
			m.setPointA1(generateRandom(12));	//Балка А, точка 1
			m.setPointA2(generateRandom(12));
			m.setPointA3(generateRandom(12));
			m.setPointB1(generateRandom(12));
			m.setPointB2(generateRandom(12));
			m.setPointB3(generateRandom(12));	//Балка Б, точка 3
			
			//---------------------------------------------Ультразв. контр. толщины концевых! балок
			m.setInitialThickness(6);
			m.setPoint1(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint2(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint3(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint4(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint5(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint6(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint7(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint8(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint9(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint10(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint11(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint12(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint13(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint14(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint15(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint16(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint17(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint18(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint19(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint20(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint21(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint22(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint23(roundDownScale(6-generator.nextDouble(), mainScale));
			m.setPoint24(roundDownScale(6-generator.nextDouble(), mainScale));
			
			//----------------------------------------------------Отклон. формы основных элементов
			//Параметры из отчета Субботина
			m.setProgib(roundDownScale(10 - generator.nextDouble(), mainScale));
			m.setIskrivlenie(roundDownScale(28 - generator.nextDouble(), mainScale));
			m.setSkruchivanie(roundDownScale(8 - generator.nextDouble(), mainScale));
			m.setVjazkost(roundDownScale(4.5 - generator.nextDouble(), mainScale));
			
			//Отклон. формы основных элементов мет-и
			m.setNonstraightAxisBeams(0); 			//Если значение отклонения = 0, будем считать, что это НОРМА!
			m.setMaxNonstraightnessAxisBeams(0.0025); 	//Отклонение от прямолинейности: 0.0025*L - зависимость от длины пролета
			m.setGridSurfaceCurvature(0);
			m.setMaxGridSurfaceCurvature(0.0035);		//Кривизна решетки: 0.0035*L - зависимость от длины пролета
			m.setDiagCrossSectionDiff(0);
			m.setMaxDiagCrossSectionDiff(1/700); 		//Разница диагноналей: b/700 or b/200
			m.setDeformations(0);
			m.setMaxDeformations(1.25); 			//Местные деформации
			
			//Виз.-оптич. осмотр осн. элементов мет-и
			int n = numberOfRecords;
			m.setGeomMainBeam(k%(generateRandom(n)+1) == 0 ? 1 : v); //Если значение отклонения = 1, будем считать, что это ДЕФЕКТ!
			m.setMaxGeomMainBeam(v);
			m.setGeomEndGirder(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxGeomEndGirder(v);
			m.setGeomCarriage(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxGeomCarriage(v);
			m.setGeomRail(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxGeomRail(v);
			m.setCracks(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxCracks(v);
			m.setMetallUndercut(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxMetallUndercut(v);
			m.setMetallScore(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxMetallScore(v);
			m.setMetallExfoliation(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxMetallExfoliation(v);
			m.setCorrosion(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxCorrosion(v);
			m.setDrainPortAbsence(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxDrainPortAbsence(v);
			m.setScrewBoltWear(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxScrewBoltWear(v);
			m.setAnticorrosiveCoatState(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setAnticorrosiveCoatState(v);
			m.setSignalColouringAbsence(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setSignalColouringAbsence(v);
			m.setFixPlankAbsence(k%(generateRandom(n)+1) == 0 ? 1 : v);
			m.setMaxFixPlankAbsence(v);
			
			HibernateDao.saveOrUpdate(sf, m);

		}
	}
		
	//Ведомость дефектов повреждений и отказов - прочие дефекты
	public static void GenerateDefectsSheet(int numberOfRecords){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		DefectsSheet ds = null;
		//for (int k=0; k<numberOfRecords; k++){
			ds = new DefectsSheet(1, "Трещины в настиле проходной галереи моста крана со стороны главных крановых троллей",
					"Выполнить ремонт", "ФИО эксперта");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(2, "Оборван упругий элемент на тупиковой опоре тележки со стороны кабины управления",
					"Выполнить ремонт");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(3, "Разрегулированы тормоза механизма передвижения крана с обеих сторон", "Произвести ревизию тормоза");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Не исправны лампы сигнализации включения главных крановых троллей", "Выполнить ремонт");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Не закреплен отопительный прибор в кабине управления", "Закрепить отопительный прибор");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Не нанесены знаки безопасности на ящиках сопротивления, установленных на мосту крана", 
					"Нанести обозначения согласно ГОСТ 12.4.026.76");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "Фиксация крюка в траверсе крюковой подвески выполнено болтом", 
					"Привести в соответствие с требованиями 'Правил...'");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "Крепление грузового каната на барабан выполнено с нарушением требований 'Правил...'",
					"Привести в соответствие с требованиями 'Правил...'");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Стыки рельс тележечного и кранового пути не заземлены", "Установить заземляющие перемычки");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Не нанесены знаки электробезопасности", "Нанести обозначения согласно ГОСТ 12.4.026.76");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(10, "На посадочной площадке крана не вывешены предупреждающие таблички", 
					"Написать и вывесить на посадочную площадку");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(10, "Отсутствует ремонтный загон электрического мостового крана", 
					"Привести в соответствие с требованиями п.5.4.19 ПУЭ");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(10, "Не выдержана длина ремонтного участка не менее 2 м", 
					"Привести в соответствие с требованиями п.5.4.19 ПУЭ");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "Ограждение грузовой тележки выполнено на высоту 500 мм, что не безопасно", "Привести в соответствие с требованиями 'Правил...'");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "Не установлена средняя полоса ограждения тележки с 3-х сторон", "Установить среднюю полосу ограждения");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "Проем под барабаном механизма не огражден верхней полосой на высоту 80-100 мм, что" +
					" не исключает падение ремонтных принадлежностей", "Установить ограждающую полосу");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "Не выдержан габарит 400 мм от грузовой тележки в крайних положениях до перил" +
					" ограждения концевых балок моста крана", "Перенести тупики тележки на 200 мм");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(10, "Нет габарита 1800 мм от пола кабины управления до плафона светильника", 
					"Перенести светильник в сторону");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(1, "Срезана средняя полоса ограждения концевой балки со стороны кабины управления",
					"Восстановить");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(10, "В кабине управления не установлено стационарное кресло", "Установить с регулировкой высоты");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(10, "На командо-контроллерах нет обозначения с указанием 'Вверх-вниз', ход моста, тележки 'Л-П'",
					"Нанести обозначения на контроллеры");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Не нанесены предупреждающие знаки на электрооборудование крана", "Нанести обозначения согласно ГОСТ 12.4.026.76");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(1, "Мост крана не очищен от посторонних предметов, грязи, масла", "Очистить до пуска в работу");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(1, "Трещины по металлу в нижнем тисте проходной галереи моста крана со стороны кабины" +
					" управления у колес крана", "Выполнить ремонт");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(1, "Прожжены вертикальные листы концевой балки со стороны кабины управления", 
					"Наложить накладки");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(1, "Не установлены бортики на площадке со стороны подвесного электрического кабеля, " +
					"запитывающего кран", "Установить борты высотой 100 мм");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Разбито стекло в оконном проеме кабины с правой стороны", "Заменить стекло");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Не установлен плафон освещения в кабине управления краном", "Установить плафон");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Нет соответствующей надписи на контроллере механизма подъема", "Сделать надпись 'Вверх-вниз'");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(3, "Не установлен 'метельник' впереди ходового колеса крана со стороны подвесного" +
					" электрического кабеля", "Установить предохранительный щиток");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(7, "Оборваны по сварке настила проходных галерей кранового пути в средней части со стороны здания",
					"Выполнить ремонт");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Кабина управления не окрашена, не нанесены чередующиеся полосы", 
					"Привести в соответствие с ГОСТ 2.2058-81");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Световой проем в кабине не защищен, это не безопасно при управлении" +
					" краном стоя", "Установить ограждающие прутья");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Нет освещения в кабине управления", "Провести ревизию освещения");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Запорное устройство двери кабины выполнено с наружной стороны", 
					"Привести в соответствие с требованиями 'Правил...'");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(8, "Не установлена охранная полоса", "Установить охранную полосу высотой 100 мм");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "Стыки рельс пути тележки не заземлены", "Установить заземляющие перила");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(10, "Не установлен трафарет с указанием рег. №, г/п и дат ЧТО, ПТО", "Установить трафарет");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Не закрыт крышкой ящик сопротивлений над кабиной крановщика", "Установить крышку");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "На крыше кабины кабель с оголенными проводами", "Устранить нарушение");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Не огражден выходной вал электродвигателя хода тележки", "Устранить нарушение");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "На пути тележки не установлены два тупиковых упора", "Установить тупиковые упоры");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(8, "Деформированы перила ограждения грузовой тележки", "Выполнить ремонт");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Не исправен концевой выключатель люка выхода из кабины на проходную галерею моста крана",
					"Выполнить ремонт");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(4, "Нарушена наружная изоляция кабеля тележки", "Выполнить ремонт");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Не установлены два болта крепления кабины крановщика", "Устранить нарушение");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(6, "Деформирована крышка люка выхода из кабины на проходную галерею моста крана", "Выполнить ремонт");
			HibernateDao.saveOrUpdate(sf, ds);
			ds = new DefectsSheet(5, "Оборваны два болта крепления крышки контроллера подъема груза", "Выполнить ремонт");
			
			/*
			 * Коды узлов:
			 * 1 - Металлоконструкция
			 * 2 - Тупиковые упоры
			 * 3 - Мех. передвижения крана
			 * 4 - Электрооборудование и приборы безопасности
			 * 5 - Мех. подъема крана
			 * 6 - Кабина
			 * 7 - Крановый путь
			 * 8 - Ограждения
			 * 
			 * 10 - Прочее
			 * 
			 */
			
		//}
	}	
	
	//Протокол виз.-оптического осмотра механизмов, электрооборудования и приборов безопасности
	public static void GenerateVisual(int numberOfRecords){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Visual v = null;
		String detect[] = {"Не обнаружено", "Обнаружено"};
		String predel = "Не допускается";
		for (int k=0; k<numberOfRecords; k++){
			v = new Visual();
			//Параметры виз.-оптического осмотра механизмов
			//Механизм главного подъема
			v.setHoistToothWearMainLifting(generateRandom(8));		//Лебедка (hoist): износ зубьев по делит. окружности
			v.setMaxHoistToothWearMainLifting(10);
			v.setHoistToothSpallingMainLifting(generateRandom(12));		//Лебедка: выкрашивание зуба по поверхности одного зуба
			v.setMaxHoistToothSpallingMainLifting(30);
			v.setHoistFixingMainLifting(generateRandom(1));			//Лебедка: крепление
			v.setMaxHoistFixingMainLifting(0);
			v.setBrakeCoverWearMainLifting(generateRandom(10));		//Тормоз: износ накладок
			v.setMaxBrakeCoverWearMainLifting(50);
			v.setBrakeBlockWearMainLifting(generateRandom(20));		//Тормоз: износ шкива
			v.setMaxBrakeBlockWearMainLifting(25);
			v.setBrakeBeatingMainLifting(0);				//Тормоз: биение тормозного шкива
			v.setMaxBrakeBeatingMainLifting(0.2);
			v.setBrakeBlockCracksMainLifting(generateRandom(1));		//Тормоз: трещины и задиры шкива
			v.setMaxBrakeBlockCracksMainLifting(0);
			v.setBrakeFixingMainLifting(generateRandom(1));			//Тормоз: крепление
			v.setMaxBrakeFixingMainLifting(0);
			v.setToothedCouplingToothWearMainLifting(generateRandom(10));	//Зубчатые муфты: износ зубьев по делит. окружности
			v.setMaxToothedCouplingToothWearMainLifting(10);	
			v.setBarrelThinningMainLifting(generateRandom(7));		//Барабан: утонение стенок
			v.setMaxBarrelThinningMainLifting(10);
			v.setBarrelGrooveWearMainLifting(generateRandom(2));		//Барабан: износ гребня ручья
			v.setMaxBarrelGrooveWearMainLifting(2);
			v.setBarrelCracksMainLifting(generateRandom(1));		//Барабан: трещины, сколы стенок
			v.setMaxBarrelCracksMainLifting(0);
			v.setBarrelFixingMainLifting(generateRandom(1));		//Барабан: крепление
			v.setMaxBarrelFixingMainLifting(0);
			v.setHookAssemblyVerticalWearMainLifting(generateRandom(8));	//Крюковая подвеска: износ вертикального сечения крюка
			v.setMaxHookAssemblyVerticalWearMainLifting(10);
			v.setHookAssemblyDeformationsMainLifting(generateRandom(1));	//Крюковая подвеска: деформации, трещины крюка
			v.setMaxHookAssemblyDeformationsMainLifting(0);	
			v.setHookAssemblyJournalWearMainLifting(generateRandom(2));	//Крюковая подвеска: износ цапф крюковой подвески
			v.setMaxHookAssemblyJournalWearMainLifting(2);
			v.setRopeBlockLedgeWearMainLifting(generateRandom(7));		//Канатные ролики и блоки: износ реборд по толщине
			v.setMaxRopeBlockLedgeWearMainLifting(20);
			v.setRopeBlockGrooveWearMainLifting(0); 			//Канатные ролики и блоки: износ ручья
			v.setMaxRopeBlockGrooveWearMainLifting(0.4);
			v.setRopeBlockLedgeBrakeMainLifting(generateRandom(1)); 	//Канатные ролики и блоки: частичные обломы реборд
			v.setMaxRopeBlockLedgeBrakeMainLifting(75);
			v.setTackleWearMainLifting(generateRandom(2));			//Канаты
			v.setMaxTackleWearMainLifting(7);
			//Механизм передвижения крана
			v.setHoistToothWearCraneMov(generateRandom(5));			//Лебедка (hoist): износ зубьев по делит. окружности
			v.setMaxHoistToothWearCraneMov(15);				//Максимальное допускаемое значение параметра
			v.setHoistToothSpallingCraneMov(generateRandom(5));		//Лебедка: выкрашивание зуба по поверхности одного зуба
			v.setMaxHoistToothSpallingCraneMov(30);
			v.setBrakeCoverWearCraneMov(generateRandom(16));		//Тормоз: износ накладок
			v.setMaxBrakeCoverWearCraneMov(50);
			v.setBrakeBlockWearCraneMov(generateRandom(5));			//Тормоз: износ шкива
			v.setMaxBrakeBlockWearCraneMov(25);
			v.setBrakeBeatingCraneMov(0);					//Тормоз: биение тормозного шкива
			v.setMaxBrakeBeatingCraneMov(0.2);
			v.setBrakeBlockCracksCraneMov(generateRandom(1));		//Тормоз: трещины и задиры шкива
			v.setMaxBrakeBlockCracksCraneMov(0);
			v.setGearToothWearCraneMov(generateRandom(8));			//Открытая зубчатая передача: износ зубьев шестерни
			v.setMaxGearToothWearCraneMov(20);
			v.setGearToothSpallingCraneMov(generateRandom(1));		//Открытая зубчатая передача: выкрашивание зуба по поверхности одного зуба
			v.setMaxGearToothSpallingCraneMov(0);
			v.setWheelLedgeWearCraneMov(generateRandom(5));			//Ходовые колеса: износ реборд
			v.setMaxWheelLedgeWearCraneMov(50);
			v.setWheelHoneycombDepthCraneMov(0);				//Ходовые колеса: глубина раковины выкрашивания
			v.setMaxWheelHoneycombDepthCraneMov(10);
			v.setWheelHoneycombLengthCraneMov(0);				//Ходовые колеса: длина раковины выкрашивания
			v.setMaxWheelHoneycombLengthCraneMov(0);	
			v.setWheelCracksCraneMov(generateRandom(1));			//Ходовые колеса: трещины
			v.setMaxWheelCracksCraneMov(0);
			
			//Механизм передвижения грузовой тележки
			v.setHoistToothWearCarriageMov(0);				//Лебедка (hoist): износ зубьев по делит. окружности
			v.setMaxHoistToothWearCarriageMov(20);				//Максимальное допускаемое значение параметра
			v.setHoistToothSpallingCarriageMov(0);				//Лебедка: выкрашивание зуба по поверхности одного зуба
			v.setMaxHoistToothSpallingCarriageMov(30);
			v.setHoistFixingCarriageMov(generateRandom(1));			//Лебедка: крепление
			v.setMaxHoistFixingCarriageMov(0);
			v.setBrakeCoverWearCarriageMov(generateRandom(1));		//Тормоз: износ накладок
			v.setMaxBrakeCoverWearCarriageMov(50);
			v.setBrakeBlockWearCarriageMov(generateRandom(1));		//Тормоз: износ шкива
			v.setMaxBrakeBlockWearCarriageMov(25);
			v.setBrakeBeatingCarriageMov(0);				//Тормоз: биение тормозного шкива
			v.setMaxBrakeBeatingCarriageMov(0.2);
			v.setBrakeBlockCracksCarriageMov(generateRandom(1));		//Тормоз: трещины и задиры шкива
			v.setMaxBrakeBlockCracksCarriageMov(0);
			v.setBrakeFixingCarriageMov(generateRandom(1));			//Тормоз: крепление
			v.setMaxBrakeFixingCarriageMov(0);
			v.setBarrelThinningCarriageMov(generateRandom(5));		//Барабан: утонение стенок
			v.setMaxBarrelThinningCarriageMov(10);
			v.setBarrelGrooveWearCarriageMov(0);				//Барабан: износ гребня ручья
			v.setMaxBarrelGrooveWearCarriageMov(2);
			v.setBarrelCracksCarriageMov(generateRandom(1));		//Барабан: трещины, сколы стенок
			v.setMaxBarrelCracksCarriageMov(0);
			v.setBarrelFixingCarriageMov(generateRandom(1));		//Барабан: крепление
			v.setMaxBarrelFixingCarriageMov(0);
			
			//Параметры виз.-оптического осмотра электрооборудования
			int n = numberOfRecords;
			v.setInputDeviceJammingElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]); 				//Вводное устройство: заедания подвижных соединений
			v.setMaxInputDeviceJammingElectro(predel);
			v.setInputDeviceCaseElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Вводное устройство: повреждения корпуса
			v.setMaxInputDeviceCaseElectro(predel);
			//В будущем на каждый узел нужно сделать по отдельному параметру, а пока будет так:
			v.setMotorJammingElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]); 					//Электродвигатели, генераторы: заедания подвижных соединений
			v.setMaxMotorJammingElectro(predel);
			v.setMotorCaseElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);					//Электродвигатели, генераторы: повреждения корпуса
			v.setMaxMotorCaseElectro(predel);
			v.setSwitchCaseElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);					//Авт. выключатели, контакторы, пускатели, реле, 
			//переключатели, контроллеры: повреждения корпуса
			v.setMaxSwitchCaseElectro(predel);
			v.setStaringResistorCaseElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Пускорег. резисторы: повреждения корпуса
			v.setMaxStaringResistorCaseElectro(predel);
			v.setBrakeElectromagnetCaseElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);			//Тормозные электромагниты и гидротолкатели: повреждения корпуса
			v.setMaxBrakeElectromagnetCaseElectro(predel);
			v.setControlPanelCaseElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Пульт управления: повреждения корпуса
			v.setMaxControlPanelCaseElectro(predel);
			v.setTransformerInsulationElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Трансформаторы: повреждения изоляции
			v.setMaxTransformerInsulationElectro(predel);
			v.setWireInsulationElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Провода и кабели: повреждения изоляции, обрыв одной и более жил
			v.setMaxWireInsulationElectro(predel);
			v.setMetalHoseInsulationElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Провода и кабели: поврежд. металлорукавов
			v.setMaxMetalHoseInsulationElectro(predel);
			v.setLightStateElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);					//Освещение и световая сигнализация: состояние и исправность электроарматуры и освет. ламп.
			v.setMaxLightStateElectro(predel);
			v.setNonstandardProtectorPresenceElectro(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);			//Предохранители: Наличие нестандартных предохранителей
			v.setMaxNonstandardProtectorPresenceElectro(predel);

			//Параметры виз.-оптического осмотра приборов и устройств безопасности

			v.setLimitSwitchCracksSafety(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Концевые выключатели: повреждение корпуса
			v.setMaxLimitSwitchCracksSafety(predel);
			v.setLimitSwitchPusherSafety(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Концевые выключатели: износ толкателя
			v.setMaxLimitSwitchPusherSafety(predel);					
			v.setLimitSwitchSelfResetSafety(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Концевые выключатели: отсутствие самовозврата подвижных частей
			v.setMaxLimitSwitchSelfResetSafety(predel);
			v.setFixedBufferCracksSafety(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Тупиковые упоры: повреждение
			v.setMaxFixedBufferCracksSafety(predel);
			v.setSignalLampCracksSafety(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Сигнальные лампы главных троллей: повреждение
			v.setMaxSignalLampCracksSafety(predel);
			v.setAudioSignalCracksSafety(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);				//Звуковой сигнал: повреждение
			v.setMaxAudioSignalCracksSafety(predel);
			v.setNovoltageInterlockCracksSafety(k%(generateRandom(n)+1) ==0 ? detect[1] : detect[0]);			//Нулевая блокировка: повреждение
			v.setMaxNovoltageInterlockCracksSafety(predel);
			
			HibernateDao.saveOrUpdate(sf, v);
		}
	}	
		
	public static double roundDownScale(double aValue, int Scale)
	  {
	    BigDecimal decimal = new BigDecimal(aValue);
	    decimal = decimal.setScale(Scale,BigDecimal.ROUND_DOWN);//ROUND_UP
	    double result = decimal.doubleValue();
	    return result;
	  }

	private static int generateRandom(int n) {
		Random generatorInd = new Random();
        return Math.abs(generatorInd.nextInt()) % n;
    }


}
