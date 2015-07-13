package model;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;


//@Entity

//Протокол виз.-оптического осмотра механизмов, электрооборудования и приборов безопасности
//Здесь будут располагаться параметры по 3-м протоколам
public class Visual implements CaseComponent{
		
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	//Параметры виз.-оптического осмотра механизмов
	
	//Механизм главного подъема
	private double hoistToothWearMainLifting;					//Лебедка (hoist): износ зубьев по делит. окружности
	private double maxHoistToothWearMainLifting;					//Максимальное допускаемое значение параметра
	private double hoistToothSpallingMainLifting;					//Лебедка: выкрашивание зуба по поверхности одного зуба
	private double maxHoistToothSpallingMainLifting;
	private double hoistFixingMainLifting;						//Лебедка: крепление
	private double maxHoistFixingMainLifting;
	private double brakeCoverWearMainLifting;					//Тормоз: износ накладок
	private double maxBrakeCoverWearMainLifting;
	private double brakeBlockWearMainLifting;					//Тормоз: износ шкива
	private double maxBrakeBlockWearMainLifting;
	private double brakeBeatingMainLifting;						//Тормоз: биение тормозного шкива
	private double maxBrakeBeatingMainLifting;
	private double brakeBlockCracksMainLifting;					//Тормоз: трещины и задиры шкива
	private double maxBrakeBlockCracksMainLifting;
	private double brakeFixingMainLifting;						//Тормоз: крепление
	private double maxBrakeFixingMainLifting;
	private double toothedCouplingToothWearMainLifting;				//Зубчатые муфты: износ зубьев по делит. окружности
	private double maxToothedCouplingToothWearMainLifting;	
	private double barrelThinningMainLifting;					//Барабан: утонение стенок
	private double maxBarrelThinningMainLifting;
	private double barrelGrooveWearMainLifting;					//Барабан: износ гребня ручья
	private double maxBarrelGrooveWearMainLifting;
	private double barrelCracksMainLifting;						//Барабан: трещины, сколы стенок
	private double maxBarrelCracksMainLifting;
	private double barrelFixingMainLifting;						//Барабан: крепление
	private double maxBarrelFixingMainLifting;
	private double hookAssemblyVerticalWearMainLifting;				//Крюковая подвеска: износ вертикального сечения крюка
	private double maxHookAssemblyVerticalWearMainLifting;
	private double hookAssemblyDeformationsMainLifting;				//Крюковая подвеска: деформации, трещины крюка
	private double maxHookAssemblyDeformationsMainLifting;	
	private double hookAssemblyJournalWearMainLifting;				//Крюковая подвеска: износ цапф крюковой подвески
	private double maxHookAssemblyJournalWearMainLifting;
	private double ropeBlockLedgeWearMainLifting;					//Канатные ролики и блоки: износ реборд по толщине
	private double maxRopeBlockLedgeWearMainLifting;
	private double ropeBlockGrooveWearMainLifting; 					//Канатные ролики и блоки: износ ручья
	private double maxRopeBlockGrooveWearMainLifting;
	private double ropeBlockLedgeBrakeMainLifting; 					//Канатные ролики и блоки: частичные обломы реборд
	private double maxRopeBlockLedgeBrakeMainLifting;
	private double tackleWearMainLifting;						//Канаты
	private double maxTackleWearMainLifting;
	
	//Механизм передвижения крана
	private double hoistToothWearCraneMov;						//Лебедка (hoist): износ зубьев по делит. окружности
	private double maxHoistToothWearCraneMov;					//Максимальное допускаемое значение параметра
	private double hoistToothSpallingCraneMov;					//Лебедка: выкрашивание зуба по поверхности одного зуба
	private double maxHoistToothSpallingCraneMov;
	private double brakeCoverWearCraneMov;						//Тормоз: износ накладок
	private double maxBrakeCoverWearCraneMov;
	private double brakeBlockWearCraneMov;						//Тормоз: износ шкива
	private double maxBrakeBlockWearCraneMov;
	private double brakeBeatingCraneMov;						//Тормоз: биение тормозного шкива
	private double maxBrakeBeatingCraneMov;
	private double brakeBlockCracksCraneMov;					//Тормоз: трещины и задиры шкива
	private double maxBrakeBlockCracksCraneMov;
	private double gearToothWearCraneMov;						//Открытая зубчатая передача: износ зубьев шестерни
	private double maxGearToothWearCraneMov;
	private double gearToothSpallingCraneMov;					//Открытая зубчатая передача: выкрашивание зуба по поверхности одного зуба
	private double maxGearToothSpallingCraneMov;
	private double wheelLedgeWearCraneMov;						//Ходовые колеса: износ реборд
	private double maxWheelLedgeWearCraneMov;
	private double wheelHoneycombDepthCraneMov;					//Ходовые колеса: глубина раковины выкрашивания
	private double maxWheelHoneycombDepthCraneMov;
	private double wheelHoneycombLengthCraneMov;					//Ходовые колеса: длина раковины выкрашивания
	private double maxWheelHoneycombLengthCraneMov;	
	private double wheelCracksCraneMov;						//Ходовые колеса: трещины
	private double maxWheelCracksCraneMov;							
	
	//Механизм передвижения грузовой тележки
	private double hoistToothWearCarriageMov;					//Лебедка (hoist): износ зубьев по делит. окружности
	private double maxHoistToothWearCarriageMov;					//Максимальное допускаемое значение параметра
	private double hoistToothSpallingCarriageMov;					//Лебедка: выкрашивание зуба по поверхности одного зуба
	private double maxHoistToothSpallingCarriageMov;	
	private double hoistFixingCarriageMov;						//Лебедка: крепление
	private double maxHoistFixingCarriageMov;
	private double brakeCoverWearCarriageMov;					//Тормоз: износ накладок
	private double maxBrakeCoverWearCarriageMov;
	private double brakeBlockWearCarriageMov;					//Тормоз: износ шкива
	private double maxBrakeBlockWearCarriageMov;
	private double brakeBeatingCarriageMov;						//Тормоз: биение тормозного шкива
	private double maxBrakeBeatingCarriageMov;
	private double brakeBlockCracksCarriageMov;					//Тормоз: трещины и задиры шкива
	private double maxBrakeBlockCracksCarriageMov;
	private double brakeFixingCarriageMov;						//Тормоз: крепление
	private double maxBrakeFixingCarriageMov;
	private double barrelThinningCarriageMov;					//Барабан: утонение стенок
	private double maxBarrelThinningCarriageMov;
	private double barrelGrooveWearCarriageMov;					//Барабан: износ гребня ручья
	private double maxBarrelGrooveWearCarriageMov;
	private double barrelCracksCarriageMov;						//Барабан: трещины, сколы стенок
	private double maxBarrelCracksCarriageMov;
	private double barrelFixingCarriageMov;						//Барабан: крепление
	private double maxBarrelFixingCarriageMov;
	
	//Параметры виз.-оптического осмотра электрооборудования
	private String inputDeviceJammingElectro; 					//Вводное устройство: заедания подвижных соединений
	private String maxInputDeviceJammingElectro;
	private String inputDeviceCaseElectro;						//Вводное устройство: повреждения корпуса
	private String maxInputDeviceCaseElectro;
	//В будущем на каждый узел нужно сделать по отдельному параметру, а пока будет так:
	private String motorJammingElectro; 						//Электродвигатели, генераторы: заедания подвижных соединений
	private String maxMotorJammingElectro;
	private String motorCaseElectro;						//Электродвигатели, генераторы: повреждения корпуса
	private String maxMotorCaseElectro;
	private String switchCaseElectro;						//Авт. выключатели, контакторы, пускатели, реле, 
											//переключатели, контроллеры: повреждения корпуса
	private String maxSwitchCaseElectro;
	private String staringResistorCaseElectro;					//Пускорег. резисторы: повреждения корпуса
	private String maxStaringResistorCaseElectro;
	private String brakeElectromagnetCaseElectro;					//Тормозные электромагниты и гидротолкатели: повреждения корпуса
	private String maxBrakeElectromagnetCaseElectro;
	private String controlPanelCaseElectro;						//Пульт управления: повреждения корпуса
	private String maxControlPanelCaseElectro;
	private String transformerInsulationElectro;					//Трансформаторы: повреждения изоляции
	private String maxTransformerInsulationElectro;
	private String wireInsulationElectro;						//Провода и кабели: повреждения изоляции, обрыв одной и более жил
	private String maxWireInsulationElectro;
	private String metalHoseInsulationElectro;					//Провода и кабели: поврежд. металлорукавов
	private String maxMetalHoseInsulationElectro;
	private String lightStateElectro;						//Освещение и световая сигнализация: состояние и исправность электроарматуры и освет. ламп.
	private String maxLightStateElectro;
	private String nonstandardProtectorPresenceElectro;				//Предохранители: Наличие нестандартных предохранителей
	private String maxNonstandardProtectorPresenceElectro;
	
	//Параметры виз.-оптического осмотра приборов и устройств безопасности
	
	private String limitSwitchCracksSafety;						//Концевые выключатели: повреждение корпуса
	private String maxLimitSwitchCracksSafety;
	private String limitSwitchPusherSafety;						//Концевые выключатели: износ толкателя
	private String maxLimitSwitchPusherSafety;					
	private String limitSwitchSelfResetSafety;					//Концевые выключатели: отсутствие самовозврата подвижных частей
	private String maxLimitSwitchSelfResetSafety;
	private String fixedBufferCracksSafety;						//Тупиковые упоры: повреждение
	private String maxFixedBufferCracksSafety;
	private String signalLampCracksSafety;						//Сигнальные лампы главных троллей: повреждение
	private String maxSignalLampCracksSafety;
	private String audioSignalCracksSafety;						//Звуковой сигнал: повреждение
	private String maxAudioSignalCracksSafety;
	private String novoltageInterlockCracksSafety;					//Нулевая блокировка: повреждение
	private String maxNovoltageInterlockCracksSafety;
	
	
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}


	public Visual() {
		super();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Visual [id=" + id + ", hoistToothWearMainLifting="
				+ hoistToothWearMainLifting + ", maxHoistToothWearMainLifting="
				+ maxHoistToothWearMainLifting
				+ ", hoistToothSpallingMainLifting="
				+ hoistToothSpallingMainLifting
				+ ", maxHoistToothSpallingMainLifting="
				+ maxHoistToothSpallingMainLifting
				+ ", hoistFixingMainLifting=" + hoistFixingMainLifting
				+ ", maxHoistFixingMainLifting=" + maxHoistFixingMainLifting
				+ ", brakeCoverWearMainLifting=" + brakeCoverWearMainLifting
				+ ", maxBrakeCoverWearMainLifting="
				+ maxBrakeCoverWearMainLifting + ", brakeBlockWearMainLifting="
				+ brakeBlockWearMainLifting + ", maxBrakeBlockWearMainLifting="
				+ maxBrakeBlockWearMainLifting + ", brakeBeatingMainLifting="
				+ brakeBeatingMainLifting + ", maxBrakeBeatingMainLifting="
				+ maxBrakeBeatingMainLifting + ", brakeBlockCracksMainLifting="
				+ brakeBlockCracksMainLifting
				+ ", maxBrakeBlockCracksMainLifting="
				+ maxBrakeBlockCracksMainLifting + ", brakeFixingMainLifting="
				+ brakeFixingMainLifting + ", maxBrakeFixingMainLifting="
				+ maxBrakeFixingMainLifting
				+ ", toothedCouplingToothWearMainLifting="
				+ toothedCouplingToothWearMainLifting
				+ ", maxToothedCouplingToothWearMainLifting="
				+ maxToothedCouplingToothWearMainLifting
				+ ", barrelThinningMainLifting=" + barrelThinningMainLifting
				+ ", maxBarrelThinningMainLifting="
				+ maxBarrelThinningMainLifting
				+ ", barrelGrooveWearMainLifting="
				+ barrelGrooveWearMainLifting
				+ ", maxBarrelGrooveWearMainLifting="
				+ maxBarrelGrooveWearMainLifting + ", barrelCracksMainLifting="
				+ barrelCracksMainLifting + ", maxBarrelCracksMainLifting="
				+ maxBarrelCracksMainLifting + ", barrelFixingMainLifting="
				+ barrelFixingMainLifting + ", maxBarrelFixingMainLifting="
				+ maxBarrelFixingMainLifting
				+ ", hookAssemblyVerticalWearMainLifting="
				+ hookAssemblyVerticalWearMainLifting
				+ ", maxHookAssemblyVerticalWearMainLifting="
				+ maxHookAssemblyVerticalWearMainLifting
				+ ", hookAssemblyDeformationsMainLifting="
				+ hookAssemblyDeformationsMainLifting
				+ ", maxHookAssemblyDeformationsMainLifting="
				+ maxHookAssemblyDeformationsMainLifting
				+ ", hookAssemblyJournalWearMainLifting="
				+ hookAssemblyJournalWearMainLifting
				+ ", maxHookAssemblyJournalWearMainLifting="
				+ maxHookAssemblyJournalWearMainLifting
				+ ", ropeBlockLedgeWearMainLifting="
				+ ropeBlockLedgeWearMainLifting
				+ ", maxRopeBlockLedgeWearMainLifting="
				+ maxRopeBlockLedgeWearMainLifting
				+ ", ropeBlockGrooveWearMainLifting="
				+ ropeBlockGrooveWearMainLifting
				+ ", maxRopeBlockGrooveWearMainLifting="
				+ maxRopeBlockGrooveWearMainLifting
				+ ", ropeBlockLedgeBrakeMainLifting="
				+ ropeBlockLedgeBrakeMainLifting
				+ ", maxRopeBlockLedgeBrakeMainLifting="
				+ maxRopeBlockLedgeBrakeMainLifting
				+ ", tackleWearMainLifting=" + tackleWearMainLifting
				+ ", maxTackleWearMainLifting=" + maxTackleWearMainLifting
				+ ", hoistToothWearCraneMov=" + hoistToothWearCraneMov
				+ ", maxHoistToothWearCraneMov=" + maxHoistToothWearCraneMov
				+ ", hoistToothSpallingCraneMov=" + hoistToothSpallingCraneMov
				+ ", maxHoistToothSpallingCraneMov="
				+ maxHoistToothSpallingCraneMov + ", brakeCoverWearCraneMov="
				+ brakeCoverWearCraneMov + ", maxBrakeCoverWearCraneMov="
				+ maxBrakeCoverWearCraneMov + ", brakeBlockWearCraneMov="
				+ brakeBlockWearCraneMov + ", maxBrakeBlockWearCraneMov="
				+ maxBrakeBlockWearCraneMov + ", brakeBeatingCraneMov="
				+ brakeBeatingCraneMov + ", maxBrakeBeatingCraneMov="
				+ maxBrakeBeatingCraneMov + ", brakeBlockCracksCraneMov="
				+ brakeBlockCracksCraneMov + ", maxBrakeBlockCracksCraneMov="
				+ maxBrakeBlockCracksCraneMov + ", gearToothWearCraneMov="
				+ gearToothWearCraneMov + ", maxGearToothWearCraneMov="
				+ maxGearToothWearCraneMov + ", gearToothSpallingCraneMov="
				+ gearToothSpallingCraneMov + ", maxGearToothSpallingCraneMov="
				+ maxGearToothSpallingCraneMov + ", wheelLedgeWearCraneMov="
				+ wheelLedgeWearCraneMov + ", maxWheelLedgeWearCraneMov="
				+ maxWheelLedgeWearCraneMov + ", wheelHoneycombDepthCraneMov="
				+ wheelHoneycombDepthCraneMov
				+ ", maxWheelHoneycombDepthCraneMov="
				+ maxWheelHoneycombDepthCraneMov
				+ ", wheelHoneycombLengthCraneMov="
				+ wheelHoneycombLengthCraneMov
				+ ", maxWheelHoneycombLengthCraneMov="
				+ maxWheelHoneycombLengthCraneMov + ", wheelCracksCraneMov="
				+ wheelCracksCraneMov + ", hoistToothWearCarriageMov="
				+ hoistToothWearCarriageMov + ", maxHoistToothWearCarriageMov="
				+ maxHoistToothWearCarriageMov
				+ ", hoistToothSpallingCarriageMov="
				+ hoistToothSpallingCarriageMov
				+ ", maxHoistToothSpallingCarriageMov="
				+ maxHoistToothSpallingCarriageMov
				+ ", hoistFixingCarriageMov=" + hoistFixingCarriageMov
				+ ", maxHoistFixingCarriageMov=" + maxHoistFixingCarriageMov
				+ ", brakeCoverWearCarriageMov=" + brakeCoverWearCarriageMov
				+ ", maxBrakeCoverWearCarriageMov="
				+ maxBrakeCoverWearCarriageMov + ", brakeBlockWearCarriageMov="
				+ brakeBlockWearCarriageMov + ", maxBrakeBlockWearCarriageMov="
				+ maxBrakeBlockWearCarriageMov + ", brakeBeatingCarriageMov="
				+ brakeBeatingCarriageMov + ", maxBrakeBeatingCarriageMov="
				+ maxBrakeBeatingCarriageMov + ", brakeBlockCracksCarriageMov="
				+ brakeBlockCracksCarriageMov
				+ ", maxBrakeBlockCracksCarriageMov="
				+ maxBrakeBlockCracksCarriageMov + ", brakeFixingCarriageMov="
				+ brakeFixingCarriageMov + ", maxBrakeFixingCarriageMov="
				+ maxBrakeFixingCarriageMov + ", barrelThinningCarriageMov="
				+ barrelThinningCarriageMov + ", maxBarrelThinningCarriageMov="
				+ maxBarrelThinningCarriageMov
				+ ", barrelGrooveWearCarriageMov="
				+ barrelGrooveWearCarriageMov
				+ ", maxBarrelGrooveWearCarriageMov="
				+ maxBarrelGrooveWearCarriageMov + ", barrelCracksCarriageMov="
				+ barrelCracksCarriageMov + ", maxBarrelCracksCarriageMov="
				+ maxBarrelCracksCarriageMov + ", barrelFixingCarriageMov="
				+ barrelFixingCarriageMov + ", maxBarrelFixingCarriageMov="
				+ maxBarrelFixingCarriageMov + ", inputDeviceJammingElectro="
				+ inputDeviceJammingElectro + ", maxInputDeviceJammingElectro="
				+ maxInputDeviceJammingElectro + ", inputDeviceCaseElectro="
				+ inputDeviceCaseElectro + ", maxInputDeviceCaseElectro="
				+ maxInputDeviceCaseElectro + ", motorJammingElectro="
				+ motorJammingElectro + ", maxMotorJammingElectro="
				+ maxMotorJammingElectro + ", motorCaseElectro="
				+ motorCaseElectro + ", maxMotorCaseElectro="
				+ maxMotorCaseElectro + ", switchCaseElectro="
				+ switchCaseElectro + ", maxSwitchCaseElectro="
				+ maxSwitchCaseElectro + ", staringResistorCaseElectro="
				+ staringResistorCaseElectro
				+ ", maxStaringResistorCaseElectro="
				+ maxStaringResistorCaseElectro
				+ ", brakeElectromagnetCaseElectro="
				+ brakeElectromagnetCaseElectro
				+ ", maxBrakeElectromagnetCaseElectro="
				+ maxBrakeElectromagnetCaseElectro
				+ ", controlPanelCaseElectro=" + controlPanelCaseElectro
				+ ", maxControlPanelCaseElectro=" + maxControlPanelCaseElectro
				+ ", transformerInsulationElectro="
				+ transformerInsulationElectro
				+ ", maxTransformerInsulationElectro="
				+ maxTransformerInsulationElectro + ", wireInsulationElectro="
				+ wireInsulationElectro + ", maxWireInsulationElectro="
				+ maxWireInsulationElectro + ", metalHoseInsulationElectro="
				+ metalHoseInsulationElectro
				+ ", maxMetalHoseInsulationElectro="
				+ maxMetalHoseInsulationElectro + ", lightStateElectro="
				+ lightStateElectro + ", maxLightStateElectro="
				+ maxLightStateElectro
				+ ", nonstandardProtectorPresenceElectro="
				+ nonstandardProtectorPresenceElectro
				+ ", maxNonstandardProtectorPresenceElectro="
				+ maxNonstandardProtectorPresenceElectro
				+ ", limitSwitchCracksSafety=" + limitSwitchCracksSafety
				+ ", maxLimitSwitchCracksSafety=" + maxLimitSwitchCracksSafety
				+ ", limitSwitchPusherSafety=" + limitSwitchPusherSafety
				+ ", maxLimitSwitchPusherSafety=" + maxLimitSwitchPusherSafety
				+ ", limitSwitchSelfResetSafety=" + limitSwitchSelfResetSafety
				+ ", maxLimitSwitchSelfResetSafety="
				+ maxLimitSwitchSelfResetSafety + ", fixedBufferCracksSafety="
				+ fixedBufferCracksSafety + ", maxFixedBufferCracksSafety="
				+ maxFixedBufferCracksSafety + ", signalLampCracksSafety="
				+ signalLampCracksSafety + ", maxSignalLampCracksSafety="
				+ maxSignalLampCracksSafety + ", audioSignalCracksSafety="
				+ audioSignalCracksSafety + ", maxAudioSignalCracksSafety="
				+ maxAudioSignalCracksSafety
				+ ", novoltageInterlockCracksSafety="
				+ novoltageInterlockCracksSafety
				+ ", maxNovoltageInterlockCracksSafety="
				+ maxNovoltageInterlockCracksSafety + "]";
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the hoistToothWearMainLifting
	 */
	public double getHoistToothWearMainLifting() {
		return hoistToothWearMainLifting;
	}


	/**
	 * @param hoistToothWearMainLifting the hoistToothWearMainLifting to set
	 */
	public void setHoistToothWearMainLifting(double hoistToothWearMainLifting) {
		this.hoistToothWearMainLifting = hoistToothWearMainLifting;
	}


	/**
	 * @return the maxHoistToothWearMainLifting
	 */
	public double getMaxHoistToothWearMainLifting() {
		return maxHoistToothWearMainLifting;
	}


	/**
	 * @param maxHoistToothWearMainLifting the maxHoistToothWearMainLifting to set
	 */
	public void setMaxHoistToothWearMainLifting(double maxHoistToothWearMainLifting) {
		this.maxHoistToothWearMainLifting = maxHoistToothWearMainLifting;
	}


	/**
	 * @return the hoistToothSpallingMainLifting
	 */
	public double getHoistToothSpallingMainLifting() {
		return hoistToothSpallingMainLifting;
	}


	/**
	 * @param hoistToothSpallingMainLifting the hoistToothSpallingMainLifting to set
	 */
	public void setHoistToothSpallingMainLifting(
			double hoistToothSpallingMainLifting) {
		this.hoistToothSpallingMainLifting = hoistToothSpallingMainLifting;
	}


	/**
	 * @return the maxHoistToothSpallingMainLifting
	 */
	public double getMaxHoistToothSpallingMainLifting() {
		return maxHoistToothSpallingMainLifting;
	}


	/**
	 * @param maxHoistToothSpallingMainLifting the maxHoistToothSpallingMainLifting to set
	 */
	public void setMaxHoistToothSpallingMainLifting(
			double maxHoistToothSpallingMainLifting) {
		this.maxHoistToothSpallingMainLifting = maxHoistToothSpallingMainLifting;
	}


	/**
	 * @return the hoistFixingMainLifting
	 */
	public double getHoistFixingMainLifting() {
		return hoistFixingMainLifting;
	}


	/**
	 * @param hoistFixingMainLifting the hoistFixingMainLifting to set
	 */
	public void setHoistFixingMainLifting(double hoistFixingMainLifting) {
		this.hoistFixingMainLifting = hoistFixingMainLifting;
	}


	/**
	 * @return the maxHoistFixingMainLifting
	 */
	public double getMaxHoistFixingMainLifting() {
		return maxHoistFixingMainLifting;
	}


	/**
	 * @param maxHoistFixingMainLifting the maxHoistFixingMainLifting to set
	 */
	public void setMaxHoistFixingMainLifting(double maxHoistFixingMainLifting) {
		this.maxHoistFixingMainLifting = maxHoistFixingMainLifting;
	}


	/**
	 * @return the brakeCoverWearMainLifting
	 */
	public double getBrakeCoverWearMainLifting() {
		return brakeCoverWearMainLifting;
	}


	/**
	 * @param brakeCoverWearMainLifting the brakeCoverWearMainLifting to set
	 */
	public void setBrakeCoverWearMainLifting(double brakeCoverWearMainLifting) {
		this.brakeCoverWearMainLifting = brakeCoverWearMainLifting;
	}


	/**
	 * @return the maxBrakeCoverWearMainLifting
	 */
	public double getMaxBrakeCoverWearMainLifting() {
		return maxBrakeCoverWearMainLifting;
	}


	/**
	 * @param maxBrakeCoverWearMainLifting the maxBrakeCoverWearMainLifting to set
	 */
	public void setMaxBrakeCoverWearMainLifting(double maxBrakeCoverWearMainLifting) {
		this.maxBrakeCoverWearMainLifting = maxBrakeCoverWearMainLifting;
	}


	/**
	 * @return the brakeBlockWearMainLifting
	 */
	public double getBrakeBlockWearMainLifting() {
		return brakeBlockWearMainLifting;
	}


	/**
	 * @param brakeBlockWearMainLifting the brakeBlockWearMainLifting to set
	 */
	public void setBrakeBlockWearMainLifting(double brakeBlockWearMainLifting) {
		this.brakeBlockWearMainLifting = brakeBlockWearMainLifting;
	}


	/**
	 * @return the maxBrakeBlockWearMainLifting
	 */
	public double getMaxBrakeBlockWearMainLifting() {
		return maxBrakeBlockWearMainLifting;
	}


	/**
	 * @param maxBrakeBlockWearMainLifting the maxBrakeBlockWearMainLifting to set
	 */
	public void setMaxBrakeBlockWearMainLifting(double maxBrakeBlockWearMainLifting) {
		this.maxBrakeBlockWearMainLifting = maxBrakeBlockWearMainLifting;
	}


	/**
	 * @return the brakeBeatingMainLifting
	 */
	public double getBrakeBeatingMainLifting() {
		return brakeBeatingMainLifting;
	}


	/**
	 * @param brakeBeatingMainLifting the brakeBeatingMainLifting to set
	 */
	public void setBrakeBeatingMainLifting(double brakeBeatingMainLifting) {
		this.brakeBeatingMainLifting = brakeBeatingMainLifting;
	}


	/**
	 * @return the maxBrakeBeatingMainLifting
	 */
	public double getMaxBrakeBeatingMainLifting() {
		return maxBrakeBeatingMainLifting;
	}


	/**
	 * @param maxBrakeBeatingMainLifting the maxBrakeBeatingMainLifting to set
	 */
	public void setMaxBrakeBeatingMainLifting(double maxBrakeBeatingMainLifting) {
		this.maxBrakeBeatingMainLifting = maxBrakeBeatingMainLifting;
	}


	/**
	 * @return the brakeBlockCracksMainLifting
	 */
	public double getBrakeBlockCracksMainLifting() {
		return brakeBlockCracksMainLifting;
	}


	/**
	 * @param brakeBlockCracksMainLifting the brakeBlockCracksMainLifting to set
	 */
	public void setBrakeBlockCracksMainLifting(double brakeBlockCracksMainLifting) {
		this.brakeBlockCracksMainLifting = brakeBlockCracksMainLifting;
	}


	/**
	 * @return the maxBrakeBlockCracksMainLifting
	 */
	public double getMaxBrakeBlockCracksMainLifting() {
		return maxBrakeBlockCracksMainLifting;
	}


	/**
	 * @param maxBrakeBlockCracksMainLifting the maxBrakeBlockCracksMainLifting to set
	 */
	public void setMaxBrakeBlockCracksMainLifting(
			double maxBrakeBlockCracksMainLifting) {
		this.maxBrakeBlockCracksMainLifting = maxBrakeBlockCracksMainLifting;
	}


	/**
	 * @return the brakeFixingMainLifting
	 */
	public double getBrakeFixingMainLifting() {
		return brakeFixingMainLifting;
	}


	/**
	 * @param brakeFixingMainLifting the brakeFixingMainLifting to set
	 */
	public void setBrakeFixingMainLifting(double brakeFixingMainLifting) {
		this.brakeFixingMainLifting = brakeFixingMainLifting;
	}


	/**
	 * @return the maxBrakeFixingMainLifting
	 */
	public double getMaxBrakeFixingMainLifting() {
		return maxBrakeFixingMainLifting;
	}


	/**
	 * @param maxBrakeFixingMainLifting the maxBrakeFixingMainLifting to set
	 */
	public void setMaxBrakeFixingMainLifting(double maxBrakeFixingMainLifting) {
		this.maxBrakeFixingMainLifting = maxBrakeFixingMainLifting;
	}


	/**
	 * @return the toothedCouplingToothWearMainLifting
	 */
	public double getToothedCouplingToothWearMainLifting() {
		return toothedCouplingToothWearMainLifting;
	}


	/**
	 * @param toothedCouplingToothWearMainLifting the toothedCouplingToothWearMainLifting to set
	 */
	public void setToothedCouplingToothWearMainLifting(
			double toothedCouplingToothWearMainLifting) {
		this.toothedCouplingToothWearMainLifting = toothedCouplingToothWearMainLifting;
	}


	/**
	 * @return the maxToothedCouplingToothWearMainLifting
	 */
	public double getMaxToothedCouplingToothWearMainLifting() {
		return maxToothedCouplingToothWearMainLifting;
	}


	/**
	 * @param maxToothedCouplingToothWearMainLifting the maxToothedCouplingToothWearMainLifting to set
	 */
	public void setMaxToothedCouplingToothWearMainLifting(
			double maxToothedCouplingToothWearMainLifting) {
		this.maxToothedCouplingToothWearMainLifting = maxToothedCouplingToothWearMainLifting;
	}


	/**
	 * @return the barrelThinningMainLifting
	 */
	public double getBarrelThinningMainLifting() {
		return barrelThinningMainLifting;
	}


	/**
	 * @param barrelThinningMainLifting the barrelThinningMainLifting to set
	 */
	public void setBarrelThinningMainLifting(double barrelThinningMainLifting) {
		this.barrelThinningMainLifting = barrelThinningMainLifting;
	}


	/**
	 * @return the maxBarrelThinningMainLifting
	 */
	public double getMaxBarrelThinningMainLifting() {
		return maxBarrelThinningMainLifting;
	}


	/**
	 * @param maxBarrelThinningMainLifting the maxBarrelThinningMainLifting to set
	 */
	public void setMaxBarrelThinningMainLifting(double maxBarrelThinningMainLifting) {
		this.maxBarrelThinningMainLifting = maxBarrelThinningMainLifting;
	}


	/**
	 * @return the barrelGrooveWearMainLifting
	 */
	public double getBarrelGrooveWearMainLifting() {
		return barrelGrooveWearMainLifting;
	}


	/**
	 * @param barrelGrooveWearMainLifting the barrelGrooveWearMainLifting to set
	 */
	public void setBarrelGrooveWearMainLifting(double barrelGrooveWearMainLifting) {
		this.barrelGrooveWearMainLifting = barrelGrooveWearMainLifting;
	}


	/**
	 * @return the maxBarrelGrooveWearMainLifting
	 */
	public double getMaxBarrelGrooveWearMainLifting() {
		return maxBarrelGrooveWearMainLifting;
	}


	/**
	 * @param maxBarrelGrooveWearMainLifting the maxBarrelGrooveWearMainLifting to set
	 */
	public void setMaxBarrelGrooveWearMainLifting(
			double maxBarrelGrooveWearMainLifting) {
		this.maxBarrelGrooveWearMainLifting = maxBarrelGrooveWearMainLifting;
	}


	/**
	 * @return the barrelCracksMainLifting
	 */
	public double getBarrelCracksMainLifting() {
		return barrelCracksMainLifting;
	}


	/**
	 * @param barrelCracksMainLifting the barrelCracksMainLifting to set
	 */
	public void setBarrelCracksMainLifting(double barrelCracksMainLifting) {
		this.barrelCracksMainLifting = barrelCracksMainLifting;
	}


	/**
	 * @return the maxBarrelCracksMainLifting
	 */
	public double getMaxBarrelCracksMainLifting() {
		return maxBarrelCracksMainLifting;
	}


	/**
	 * @param maxBarrelCracksMainLifting the maxBarrelCracksMainLifting to set
	 */
	public void setMaxBarrelCracksMainLifting(double maxBarrelCracksMainLifting) {
		this.maxBarrelCracksMainLifting = maxBarrelCracksMainLifting;
	}


	/**
	 * @return the barrelFixingMainLifting
	 */
	public double getBarrelFixingMainLifting() {
		return barrelFixingMainLifting;
	}


	/**
	 * @param barrelFixingMainLifting the barrelFixingMainLifting to set
	 */
	public void setBarrelFixingMainLifting(double barrelFixingMainLifting) {
		this.barrelFixingMainLifting = barrelFixingMainLifting;
	}


	/**
	 * @return the maxBarrelFixingMainLifting
	 */
	public double getMaxBarrelFixingMainLifting() {
		return maxBarrelFixingMainLifting;
	}


	/**
	 * @param maxBarrelFixingMainLifting the maxBarrelFixingMainLifting to set
	 */
	public void setMaxBarrelFixingMainLifting(double maxBarrelFixingMainLifting) {
		this.maxBarrelFixingMainLifting = maxBarrelFixingMainLifting;
	}


	/**
	 * @return the hookAssemblyVerticalWearMainLifting
	 */
	public double getHookAssemblyVerticalWearMainLifting() {
		return hookAssemblyVerticalWearMainLifting;
	}


	/**
	 * @param hookAssemblyVerticalWearMainLifting the hookAssemblyVerticalWearMainLifting to set
	 */
	public void setHookAssemblyVerticalWearMainLifting(
			double hookAssemblyVerticalWearMainLifting) {
		this.hookAssemblyVerticalWearMainLifting = hookAssemblyVerticalWearMainLifting;
	}


	/**
	 * @return the maxHookAssemblyVerticalWearMainLifting
	 */
	public double getMaxHookAssemblyVerticalWearMainLifting() {
		return maxHookAssemblyVerticalWearMainLifting;
	}


	/**
	 * @param maxHookAssemblyVerticalWearMainLifting the maxHookAssemblyVerticalWearMainLifting to set
	 */
	public void setMaxHookAssemblyVerticalWearMainLifting(
			double maxHookAssemblyVerticalWearMainLifting) {
		this.maxHookAssemblyVerticalWearMainLifting = maxHookAssemblyVerticalWearMainLifting;
	}


	/**
	 * @return the hookAssemblyDeformationsMainLifting
	 */
	public double getHookAssemblyDeformationsMainLifting() {
		return hookAssemblyDeformationsMainLifting;
	}


	/**
	 * @param hookAssemblyDeformationsMainLifting the hookAssemblyDeformationsMainLifting to set
	 */
	public void setHookAssemblyDeformationsMainLifting(
			double hookAssemblyDeformationsMainLifting) {
		this.hookAssemblyDeformationsMainLifting = hookAssemblyDeformationsMainLifting;
	}


	/**
	 * @return the maxHookAssemblyDeformationsMainLifting
	 */
	public double getMaxHookAssemblyDeformationsMainLifting() {
		return maxHookAssemblyDeformationsMainLifting;
	}


	/**
	 * @param maxHookAssemblyDeformationsMainLifting the maxHookAssemblyDeformationsMainLifting to set
	 */
	public void setMaxHookAssemblyDeformationsMainLifting(
			double maxHookAssemblyDeformationsMainLifting) {
		this.maxHookAssemblyDeformationsMainLifting = maxHookAssemblyDeformationsMainLifting;
	}


	/**
	 * @return the hookAssemblyJournalWearMainLifting
	 */
	public double getHookAssemblyJournalWearMainLifting() {
		return hookAssemblyJournalWearMainLifting;
	}


	/**
	 * @param hookAssemblyJournalWearMainLifting the hookAssemblyJournalWearMainLifting to set
	 */
	public void setHookAssemblyJournalWearMainLifting(
			double hookAssemblyJournalWearMainLifting) {
		this.hookAssemblyJournalWearMainLifting = hookAssemblyJournalWearMainLifting;
	}


	/**
	 * @return the maxHookAssemblyJournalWearMainLifting
	 */
	public double getMaxHookAssemblyJournalWearMainLifting() {
		return maxHookAssemblyJournalWearMainLifting;
	}


	/**
	 * @param maxHookAssemblyJournalWearMainLifting the maxHookAssemblyJournalWearMainLifting to set
	 */
	public void setMaxHookAssemblyJournalWearMainLifting(
			double maxHookAssemblyJournalWearMainLifting) {
		this.maxHookAssemblyJournalWearMainLifting = maxHookAssemblyJournalWearMainLifting;
	}


	/**
	 * @return the ropeBlockLedgeWearMainLifting
	 */
	public double getRopeBlockLedgeWearMainLifting() {
		return ropeBlockLedgeWearMainLifting;
	}


	/**
	 * @param ropeBlockLedgeWearMainLifting the ropeBlockLedgeWearMainLifting to set
	 */
	public void setRopeBlockLedgeWearMainLifting(
			double ropeBlockLedgeWearMainLifting) {
		this.ropeBlockLedgeWearMainLifting = ropeBlockLedgeWearMainLifting;
	}


	/**
	 * @return the maxRopeBlockLedgeWearMainLifting
	 */
	public double getMaxRopeBlockLedgeWearMainLifting() {
		return maxRopeBlockLedgeWearMainLifting;
	}


	/**
	 * @param maxRopeBlockLedgeWearMainLifting the maxRopeBlockLedgeWearMainLifting to set
	 */
	public void setMaxRopeBlockLedgeWearMainLifting(
			double maxRopeBlockLedgeWearMainLifting) {
		this.maxRopeBlockLedgeWearMainLifting = maxRopeBlockLedgeWearMainLifting;
	}


	/**
	 * @return the ropeBlockGrooveWearMainLifting
	 */
	public double getRopeBlockGrooveWearMainLifting() {
		return ropeBlockGrooveWearMainLifting;
	}


	/**
	 * @param ropeBlockGrooveWearMainLifting the ropeBlockGrooveWearMainLifting to set
	 */
	public void setRopeBlockGrooveWearMainLifting(
			double ropeBlockGrooveWearMainLifting) {
		this.ropeBlockGrooveWearMainLifting = ropeBlockGrooveWearMainLifting;
	}


	/**
	 * @return the maxRopeBlockGrooveWearMainLifting
	 */
	public double getMaxRopeBlockGrooveWearMainLifting() {
		return maxRopeBlockGrooveWearMainLifting;
	}


	/**
	 * @param maxRopeBlockGrooveWearMainLifting the maxRopeBlockGrooveWearMainLifting to set
	 */
	public void setMaxRopeBlockGrooveWearMainLifting(
			double maxRopeBlockGrooveWearMainLifting) {
		this.maxRopeBlockGrooveWearMainLifting = maxRopeBlockGrooveWearMainLifting;
	}


	/**
	 * @return the ropeBlockLedgeBrakeMainLifting
	 */
	public double getRopeBlockLedgeBrakeMainLifting() {
		return ropeBlockLedgeBrakeMainLifting;
	}


	/**
	 * @param ropeBlockLedgeBrakeMainLifting the ropeBlockLedgeBrakeMainLifting to set
	 */
	public void setRopeBlockLedgeBrakeMainLifting(
			double ropeBlockLedgeBrakeMainLifting) {
		this.ropeBlockLedgeBrakeMainLifting = ropeBlockLedgeBrakeMainLifting;
	}


	/**
	 * @return the maxRopeBlockLedgeBrakeMainLifting
	 */
	public double getMaxRopeBlockLedgeBrakeMainLifting() {
		return maxRopeBlockLedgeBrakeMainLifting;
	}


	/**
	 * @param maxRopeBlockLedgeBrakeMainLifting the maxRopeBlockLedgeBrakeMainLifting to set
	 */
	public void setMaxRopeBlockLedgeBrakeMainLifting(
			double maxRopeBlockLedgeBrakeMainLifting) {
		this.maxRopeBlockLedgeBrakeMainLifting = maxRopeBlockLedgeBrakeMainLifting;
	}


	/**
	 * @return the tackleWearMainLifting
	 */
	public double getTackleWearMainLifting() {
		return tackleWearMainLifting;
	}


	/**
	 * @param tackleWearMainLifting the tackleWearMainLifting to set
	 */
	public void setTackleWearMainLifting(double tackleWearMainLifting) {
		this.tackleWearMainLifting = tackleWearMainLifting;
	}


	/**
	 * @return the maxTackleWearMainLifting
	 */
	public double getMaxTackleWearMainLifting() {
		return maxTackleWearMainLifting;
	}


	/**
	 * @param maxTackleWearMainLifting the maxTackleWearMainLifting to set
	 */
	public void setMaxTackleWearMainLifting(double maxTackleWearMainLifting) {
		this.maxTackleWearMainLifting = maxTackleWearMainLifting;
	}


	/**
	 * @return the hoistToothWearCraneMov
	 */
	public double getHoistToothWearCraneMov() {
		return hoistToothWearCraneMov;
	}


	/**
	 * @param hoistToothWearCraneMov the hoistToothWearCraneMov to set
	 */
	public void setHoistToothWearCraneMov(double hoistToothWearCraneMov) {
		this.hoistToothWearCraneMov = hoistToothWearCraneMov;
	}


	/**
	 * @return the maxHoistToothWearCraneMov
	 */
	public double getMaxHoistToothWearCraneMov() {
		return maxHoistToothWearCraneMov;
	}


	/**
	 * @param maxHoistToothWearCraneMov the maxHoistToothWearCraneMov to set
	 */
	public void setMaxHoistToothWearCraneMov(double maxHoistToothWearCraneMov) {
		this.maxHoistToothWearCraneMov = maxHoistToothWearCraneMov;
	}


	/**
	 * @return the hoistToothSpallingCraneMov
	 */
	public double getHoistToothSpallingCraneMov() {
		return hoistToothSpallingCraneMov;
	}


	/**
	 * @param hoistToothSpallingCraneMov the hoistToothSpallingCraneMov to set
	 */
	public void setHoistToothSpallingCraneMov(double hoistToothSpallingCraneMov) {
		this.hoistToothSpallingCraneMov = hoistToothSpallingCraneMov;
	}


	/**
	 * @return the maxHoistToothSpallingCraneMov
	 */
	public double getMaxHoistToothSpallingCraneMov() {
		return maxHoistToothSpallingCraneMov;
	}


	/**
	 * @param maxHoistToothSpallingCraneMov the maxHoistToothSpallingCraneMov to set
	 */
	public void setMaxHoistToothSpallingCraneMov(
			double maxHoistToothSpallingCraneMov) {
		this.maxHoistToothSpallingCraneMov = maxHoistToothSpallingCraneMov;
	}


	/**
	 * @return the brakeCoverWearCraneMov
	 */
	public double getBrakeCoverWearCraneMov() {
		return brakeCoverWearCraneMov;
	}


	/**
	 * @param brakeCoverWearCraneMov the brakeCoverWearCraneMov to set
	 */
	public void setBrakeCoverWearCraneMov(double brakeCoverWearCraneMov) {
		this.brakeCoverWearCraneMov = brakeCoverWearCraneMov;
	}


	/**
	 * @return the maxBrakeCoverWearCraneMov
	 */
	public double getMaxBrakeCoverWearCraneMov() {
		return maxBrakeCoverWearCraneMov;
	}


	/**
	 * @param maxBrakeCoverWearCraneMov the maxBrakeCoverWearCraneMov to set
	 */
	public void setMaxBrakeCoverWearCraneMov(double maxBrakeCoverWearCraneMov) {
		this.maxBrakeCoverWearCraneMov = maxBrakeCoverWearCraneMov;
	}


	/**
	 * @return the brakeBlockWearCraneMov
	 */
	public double getBrakeBlockWearCraneMov() {
		return brakeBlockWearCraneMov;
	}


	/**
	 * @param brakeBlockWearCraneMov the brakeBlockWearCraneMov to set
	 */
	public void setBrakeBlockWearCraneMov(double brakeBlockWearCraneMov) {
		this.brakeBlockWearCraneMov = brakeBlockWearCraneMov;
	}


	/**
	 * @return the maxBrakeBlockWearCraneMov
	 */
	public double getMaxBrakeBlockWearCraneMov() {
		return maxBrakeBlockWearCraneMov;
	}


	/**
	 * @param maxBrakeBlockWearCraneMov the maxBrakeBlockWearCraneMov to set
	 */
	public void setMaxBrakeBlockWearCraneMov(double maxBrakeBlockWearCraneMov) {
		this.maxBrakeBlockWearCraneMov = maxBrakeBlockWearCraneMov;
	}


	/**
	 * @return the brakeBeatingCraneMov
	 */
	public double getBrakeBeatingCraneMov() {
		return brakeBeatingCraneMov;
	}


	/**
	 * @param brakeBeatingCraneMov the brakeBeatingCraneMov to set
	 */
	public void setBrakeBeatingCraneMov(double brakeBeatingCraneMov) {
		this.brakeBeatingCraneMov = brakeBeatingCraneMov;
	}


	/**
	 * @return the maxBrakeBeatingCraneMov
	 */
	public double getMaxBrakeBeatingCraneMov() {
		return maxBrakeBeatingCraneMov;
	}


	/**
	 * @param maxBrakeBeatingCraneMov the maxBrakeBeatingCraneMov to set
	 */
	public void setMaxBrakeBeatingCraneMov(double maxBrakeBeatingCraneMov) {
		this.maxBrakeBeatingCraneMov = maxBrakeBeatingCraneMov;
	}


	/**
	 * @return the brakeBlockCracksCraneMov
	 */
	public double getBrakeBlockCracksCraneMov() {
		return brakeBlockCracksCraneMov;
	}


	/**
	 * @param brakeBlockCracksCraneMov the brakeBlockCracksCraneMov to set
	 */
	public void setBrakeBlockCracksCraneMov(double brakeBlockCracksCraneMov) {
		this.brakeBlockCracksCraneMov = brakeBlockCracksCraneMov;
	}


	/**
	 * @return the maxBrakeBlockCracksCraneMov
	 */
	public double getMaxBrakeBlockCracksCraneMov() {
		return maxBrakeBlockCracksCraneMov;
	}


	/**
	 * @param maxBrakeBlockCracksCraneMov the maxBrakeBlockCracksCraneMov to set
	 */
	public void setMaxBrakeBlockCracksCraneMov(double maxBrakeBlockCracksCraneMov) {
		this.maxBrakeBlockCracksCraneMov = maxBrakeBlockCracksCraneMov;
	}


	/**
	 * @return the gearToothWearCraneMov
	 */
	public double getGearToothWearCraneMov() {
		return gearToothWearCraneMov;
	}


	/**
	 * @param gearToothWearCraneMov the gearToothWearCraneMov to set
	 */
	public void setGearToothWearCraneMov(double gearToothWearCraneMov) {
		this.gearToothWearCraneMov = gearToothWearCraneMov;
	}


	/**
	 * @return the maxGearToothWearCraneMov
	 */
	public double getMaxGearToothWearCraneMov() {
		return maxGearToothWearCraneMov;
	}


	/**
	 * @param maxGearToothWearCraneMov the maxGearToothWearCraneMov to set
	 */
	public void setMaxGearToothWearCraneMov(double maxGearToothWearCraneMov) {
		this.maxGearToothWearCraneMov = maxGearToothWearCraneMov;
	}


	/**
	 * @return the gearToothSpallingCraneMov
	 */
	public double getGearToothSpallingCraneMov() {
		return gearToothSpallingCraneMov;
	}


	/**
	 * @param gearToothSpallingCraneMov the gearToothSpallingCraneMov to set
	 */
	public void setGearToothSpallingCraneMov(double gearToothSpallingCraneMov) {
		this.gearToothSpallingCraneMov = gearToothSpallingCraneMov;
	}


	/**
	 * @return the maxGearToothSpallingCraneMov
	 */
	public double getMaxGearToothSpallingCraneMov() {
		return maxGearToothSpallingCraneMov;
	}


	/**
	 * @param maxGearToothSpallingCraneMov the maxGearToothSpallingCraneMov to set
	 */
	public void setMaxGearToothSpallingCraneMov(double maxGearToothSpallingCraneMov) {
		this.maxGearToothSpallingCraneMov = maxGearToothSpallingCraneMov;
	}


	/**
	 * @return the wheelLedgeWearCraneMov
	 */
	public double getWheelLedgeWearCraneMov() {
		return wheelLedgeWearCraneMov;
	}


	/**
	 * @param wheelLedgeWearCraneMov the wheelLedgeWearCraneMov to set
	 */
	public void setWheelLedgeWearCraneMov(double wheelLedgeWearCraneMov) {
		this.wheelLedgeWearCraneMov = wheelLedgeWearCraneMov;
	}


	/**
	 * @return the maxWheelLedgeWearCraneMov
	 */
	public double getMaxWheelLedgeWearCraneMov() {
		return maxWheelLedgeWearCraneMov;
	}


	/**
	 * @param maxWheelLedgeWearCraneMov the maxWheelLedgeWearCraneMov to set
	 */
	public void setMaxWheelLedgeWearCraneMov(double maxWheelLedgeWearCraneMov) {
		this.maxWheelLedgeWearCraneMov = maxWheelLedgeWearCraneMov;
	}


	/**
	 * @return the wheelHoneycombDepthCraneMov
	 */
	public double getWheelHoneycombDepthCraneMov() {
		return wheelHoneycombDepthCraneMov;
	}


	/**
	 * @param wheelHoneycombDepthCraneMov the wheelHoneycombDepthCraneMov to set
	 */
	public void setWheelHoneycombDepthCraneMov(double wheelHoneycombDepthCraneMov) {
		this.wheelHoneycombDepthCraneMov = wheelHoneycombDepthCraneMov;
	}


	/**
	 * @return the maxWheelHoneycombDepthCraneMov
	 */
	public double getMaxWheelHoneycombDepthCraneMov() {
		return maxWheelHoneycombDepthCraneMov;
	}


	/**
	 * @param maxWheelHoneycombDepthCraneMov the maxWheelHoneycombDepthCraneMov to set
	 */
	public void setMaxWheelHoneycombDepthCraneMov(
			double maxWheelHoneycombDepthCraneMov) {
		this.maxWheelHoneycombDepthCraneMov = maxWheelHoneycombDepthCraneMov;
	}


	/**
	 * @return the wheelHoneycombLengthCraneMov
	 */
	public double getWheelHoneycombLengthCraneMov() {
		return wheelHoneycombLengthCraneMov;
	}


	/**
	 * @param wheelHoneycombLengthCraneMov the wheelHoneycombLengthCraneMov to set
	 */
	public void setWheelHoneycombLengthCraneMov(double wheelHoneycombLengthCraneMov) {
		this.wheelHoneycombLengthCraneMov = wheelHoneycombLengthCraneMov;
	}


	/**
	 * @return the maxWheelHoneycombLengthCraneMov
	 */
	public double getMaxWheelHoneycombLengthCraneMov() {
		return maxWheelHoneycombLengthCraneMov;
	}


	/**
	 * @param maxWheelHoneycombLengthCraneMov the maxWheelHoneycombLengthCraneMov to set
	 */
	public void setMaxWheelHoneycombLengthCraneMov(
			double maxWheelHoneycombLengthCraneMov) {
		this.maxWheelHoneycombLengthCraneMov = maxWheelHoneycombLengthCraneMov;
	}


	/**
	 * @return the wheelCracksCraneMov
	 */
	public double getWheelCracksCraneMov() {
		return wheelCracksCraneMov;
	}


	/**
	 * @param wheelCracksCraneMov the wheelCracksCraneMov to set
	 */
	public void setWheelCracksCraneMov(double wheelCracksCraneMov) {
		this.wheelCracksCraneMov = wheelCracksCraneMov;
	}


	/**
	 * @return the maxWheelCracksCraneMov
	 */
	public double getMaxWheelCracksCraneMov() {
		return maxWheelCracksCraneMov;
	}


	/**
	 * @param maxWheelCracksCraneMov the maxWheelCracksCraneMov to set
	 */
	public void setMaxWheelCracksCraneMov(double maxWheelCracksCraneMov) {
		this.maxWheelCracksCraneMov = maxWheelCracksCraneMov;
	}


	/**
	 * @return the hoistToothWearCarriageMov
	 */
	public double getHoistToothWearCarriageMov() {
		return hoistToothWearCarriageMov;
	}


	/**
	 * @param hoistToothWearCarriageMov the hoistToothWearCarriageMov to set
	 */
	public void setHoistToothWearCarriageMov(double hoistToothWearCarriageMov) {
		this.hoistToothWearCarriageMov = hoistToothWearCarriageMov;
	}


	/**
	 * @return the maxHoistToothWearCarriageMov
	 */
	public double getMaxHoistToothWearCarriageMov() {
		return maxHoistToothWearCarriageMov;
	}


	/**
	 * @param maxHoistToothWearCarriageMov the maxHoistToothWearCarriageMov to set
	 */
	public void setMaxHoistToothWearCarriageMov(double maxHoistToothWearCarriageMov) {
		this.maxHoistToothWearCarriageMov = maxHoistToothWearCarriageMov;
	}


	/**
	 * @return the hoistToothSpallingCarriageMov
	 */
	public double getHoistToothSpallingCarriageMov() {
		return hoistToothSpallingCarriageMov;
	}


	/**
	 * @param hoistToothSpallingCarriageMov the hoistToothSpallingCarriageMov to set
	 */
	public void setHoistToothSpallingCarriageMov(
			double hoistToothSpallingCarriageMov) {
		this.hoistToothSpallingCarriageMov = hoistToothSpallingCarriageMov;
	}


	/**
	 * @return the maxHoistToothSpallingCarriageMov
	 */
	public double getMaxHoistToothSpallingCarriageMov() {
		return maxHoistToothSpallingCarriageMov;
	}


	/**
	 * @param maxHoistToothSpallingCarriageMov the maxHoistToothSpallingCarriageMov to set
	 */
	public void setMaxHoistToothSpallingCarriageMov(
			double maxHoistToothSpallingCarriageMov) {
		this.maxHoistToothSpallingCarriageMov = maxHoistToothSpallingCarriageMov;
	}


	/**
	 * @return the hoistFixingCarriageMov
	 */
	public double getHoistFixingCarriageMov() {
		return hoistFixingCarriageMov;
	}


	/**
	 * @param hoistFixingCarriageMov the hoistFixingCarriageMov to set
	 */
	public void setHoistFixingCarriageMov(double hoistFixingCarriageMov) {
		this.hoistFixingCarriageMov = hoistFixingCarriageMov;
	}


	/**
	 * @return the maxHoistFixingCarriageMov
	 */
	public double getMaxHoistFixingCarriageMov() {
		return maxHoistFixingCarriageMov;
	}


	/**
	 * @param maxHoistFixingCarriageMov the maxHoistFixingCarriageMov to set
	 */
	public void setMaxHoistFixingCarriageMov(double maxHoistFixingCarriageMov) {
		this.maxHoistFixingCarriageMov = maxHoistFixingCarriageMov;
	}


	/**
	 * @return the brakeCoverWearCarriageMov
	 */
	public double getBrakeCoverWearCarriageMov() {
		return brakeCoverWearCarriageMov;
	}


	/**
	 * @param brakeCoverWearCarriageMov the brakeCoverWearCarriageMov to set
	 */
	public void setBrakeCoverWearCarriageMov(double brakeCoverWearCarriageMov) {
		this.brakeCoverWearCarriageMov = brakeCoverWearCarriageMov;
	}


	/**
	 * @return the maxBrakeCoverWearCarriageMov
	 */
	public double getMaxBrakeCoverWearCarriageMov() {
		return maxBrakeCoverWearCarriageMov;
	}


	/**
	 * @param maxBrakeCoverWearCarriageMov the maxBrakeCoverWearCarriageMov to set
	 */
	public void setMaxBrakeCoverWearCarriageMov(double maxBrakeCoverWearCarriageMov) {
		this.maxBrakeCoverWearCarriageMov = maxBrakeCoverWearCarriageMov;
	}


	/**
	 * @return the brakeBlockWearCarriageMov
	 */
	public double getBrakeBlockWearCarriageMov() {
		return brakeBlockWearCarriageMov;
	}


	/**
	 * @param brakeBlockWearCarriageMov the brakeBlockWearCarriageMov to set
	 */
	public void setBrakeBlockWearCarriageMov(double brakeBlockWearCarriageMov) {
		this.brakeBlockWearCarriageMov = brakeBlockWearCarriageMov;
	}


	/**
	 * @return the maxBrakeBlockWearCarriageMov
	 */
	public double getMaxBrakeBlockWearCarriageMov() {
		return maxBrakeBlockWearCarriageMov;
	}


	/**
	 * @param maxBrakeBlockWearCarriageMov the maxBrakeBlockWearCarriageMov to set
	 */
	public void setMaxBrakeBlockWearCarriageMov(double maxBrakeBlockWearCarriageMov) {
		this.maxBrakeBlockWearCarriageMov = maxBrakeBlockWearCarriageMov;
	}


	/**
	 * @return the brakeBeatingCarriageMov
	 */
	public double getBrakeBeatingCarriageMov() {
		return brakeBeatingCarriageMov;
	}


	/**
	 * @param brakeBeatingCarriageMov the brakeBeatingCarriageMov to set
	 */
	public void setBrakeBeatingCarriageMov(double brakeBeatingCarriageMov) {
		this.brakeBeatingCarriageMov = brakeBeatingCarriageMov;
	}


	/**
	 * @return the maxBrakeBeatingCarriageMov
	 */
	public double getMaxBrakeBeatingCarriageMov() {
		return maxBrakeBeatingCarriageMov;
	}


	/**
	 * @param maxBrakeBeatingCarriageMov the maxBrakeBeatingCarriageMov to set
	 */
	public void setMaxBrakeBeatingCarriageMov(double maxBrakeBeatingCarriageMov) {
		this.maxBrakeBeatingCarriageMov = maxBrakeBeatingCarriageMov;
	}


	/**
	 * @return the brakeBlockCracksCarriageMov
	 */
	public double getBrakeBlockCracksCarriageMov() {
		return brakeBlockCracksCarriageMov;
	}


	/**
	 * @param brakeBlockCracksCarriageMov the brakeBlockCracksCarriageMov to set
	 */
	public void setBrakeBlockCracksCarriageMov(double brakeBlockCracksCarriageMov) {
		this.brakeBlockCracksCarriageMov = brakeBlockCracksCarriageMov;
	}


	/**
	 * @return the maxBrakeBlockCracksCarriageMov
	 */
	public double getMaxBrakeBlockCracksCarriageMov() {
		return maxBrakeBlockCracksCarriageMov;
	}


	/**
	 * @param maxBrakeBlockCracksCarriageMov the maxBrakeBlockCracksCarriageMov to set
	 */
	public void setMaxBrakeBlockCracksCarriageMov(
			double maxBrakeBlockCracksCarriageMov) {
		this.maxBrakeBlockCracksCarriageMov = maxBrakeBlockCracksCarriageMov;
	}


	/**
	 * @return the brakeFixingCarriageMov
	 */
	public double getBrakeFixingCarriageMov() {
		return brakeFixingCarriageMov;
	}


	/**
	 * @param brakeFixingCarriageMov the brakeFixingCarriageMov to set
	 */
	public void setBrakeFixingCarriageMov(double brakeFixingCarriageMov) {
		this.brakeFixingCarriageMov = brakeFixingCarriageMov;
	}


	/**
	 * @return the maxBrakeFixingCarriageMov
	 */
	public double getMaxBrakeFixingCarriageMov() {
		return maxBrakeFixingCarriageMov;
	}


	/**
	 * @param maxBrakeFixingCarriageMov the maxBrakeFixingCarriageMov to set
	 */
	public void setMaxBrakeFixingCarriageMov(double maxBrakeFixingCarriageMov) {
		this.maxBrakeFixingCarriageMov = maxBrakeFixingCarriageMov;
	}


	/**
	 * @return the barrelThinningCarriageMov
	 */
	public double getBarrelThinningCarriageMov() {
		return barrelThinningCarriageMov;
	}


	/**
	 * @param barrelThinningCarriageMov the barrelThinningCarriageMov to set
	 */
	public void setBarrelThinningCarriageMov(double barrelThinningCarriageMov) {
		this.barrelThinningCarriageMov = barrelThinningCarriageMov;
	}


	/**
	 * @return the maxBarrelThinningCarriageMov
	 */
	public double getMaxBarrelThinningCarriageMov() {
		return maxBarrelThinningCarriageMov;
	}


	/**
	 * @param maxBarrelThinningCarriageMov the maxBarrelThinningCarriageMov to set
	 */
	public void setMaxBarrelThinningCarriageMov(double maxBarrelThinningCarriageMov) {
		this.maxBarrelThinningCarriageMov = maxBarrelThinningCarriageMov;
	}


	/**
	 * @return the barrelGrooveWearCarriageMov
	 */
	public double getBarrelGrooveWearCarriageMov() {
		return barrelGrooveWearCarriageMov;
	}


	/**
	 * @param barrelGrooveWearCarriageMov the barrelGrooveWearCarriageMov to set
	 */
	public void setBarrelGrooveWearCarriageMov(double barrelGrooveWearCarriageMov) {
		this.barrelGrooveWearCarriageMov = barrelGrooveWearCarriageMov;
	}


	/**
	 * @return the maxBarrelGrooveWearCarriageMov
	 */
	public double getMaxBarrelGrooveWearCarriageMov() {
		return maxBarrelGrooveWearCarriageMov;
	}


	/**
	 * @param maxBarrelGrooveWearCarriageMov the maxBarrelGrooveWearCarriageMov to set
	 */
	public void setMaxBarrelGrooveWearCarriageMov(
			double maxBarrelGrooveWearCarriageMov) {
		this.maxBarrelGrooveWearCarriageMov = maxBarrelGrooveWearCarriageMov;
	}


	/**
	 * @return the barrelCracksCarriageMov
	 */
	public double getBarrelCracksCarriageMov() {
		return barrelCracksCarriageMov;
	}


	/**
	 * @param barrelCracksCarriageMov the barrelCracksCarriageMov to set
	 */
	public void setBarrelCracksCarriageMov(double barrelCracksCarriageMov) {
		this.barrelCracksCarriageMov = barrelCracksCarriageMov;
	}


	/**
	 * @return the maxBarrelCracksCarriageMov
	 */
	public double getMaxBarrelCracksCarriageMov() {
		return maxBarrelCracksCarriageMov;
	}


	/**
	 * @param maxBarrelCracksCarriageMov the maxBarrelCracksCarriageMov to set
	 */
	public void setMaxBarrelCracksCarriageMov(double maxBarrelCracksCarriageMov) {
		this.maxBarrelCracksCarriageMov = maxBarrelCracksCarriageMov;
	}


	/**
	 * @return the barrelFixingCarriageMov
	 */
	public double getBarrelFixingCarriageMov() {
		return barrelFixingCarriageMov;
	}


	/**
	 * @param barrelFixingCarriageMov the barrelFixingCarriageMov to set
	 */
	public void setBarrelFixingCarriageMov(double barrelFixingCarriageMov) {
		this.barrelFixingCarriageMov = barrelFixingCarriageMov;
	}


	/**
	 * @return the maxBarrelFixingCarriageMov
	 */
	public double getMaxBarrelFixingCarriageMov() {
		return maxBarrelFixingCarriageMov;
	}


	/**
	 * @param maxBarrelFixingCarriageMov the maxBarrelFixingCarriageMov to set
	 */
	public void setMaxBarrelFixingCarriageMov(double maxBarrelFixingCarriageMov) {
		this.maxBarrelFixingCarriageMov = maxBarrelFixingCarriageMov;
	}


	/**
	 * @return the inputDeviceJammingElectro
	 */
	public String getInputDeviceJammingElectro() {
		return inputDeviceJammingElectro;
	}


	/**
	 * @param inputDeviceJammingElectro the inputDeviceJammingElectro to set
	 */
	public void setInputDeviceJammingElectro(String inputDeviceJammingElectro) {
		this.inputDeviceJammingElectro = inputDeviceJammingElectro;
	}


	/**
	 * @return the maxInputDeviceJammingElectro
	 */
	public String getMaxInputDeviceJammingElectro() {
		return maxInputDeviceJammingElectro;
	}


	/**
	 * @param maxInputDeviceJammingElectro the maxInputDeviceJammingElectro to set
	 */
	public void setMaxInputDeviceJammingElectro(String maxInputDeviceJammingElectro) {
		this.maxInputDeviceJammingElectro = maxInputDeviceJammingElectro;
	}


	/**
	 * @return the inputDeviceCaseElectro
	 */
	public String getInputDeviceCaseElectro() {
		return inputDeviceCaseElectro;
	}


	/**
	 * @param inputDeviceCaseElectro the inputDeviceCaseElectro to set
	 */
	public void setInputDeviceCaseElectro(String inputDeviceCaseElectro) {
		this.inputDeviceCaseElectro = inputDeviceCaseElectro;
	}


	/**
	 * @return the maxInputDeviceCaseElectro
	 */
	public String getMaxInputDeviceCaseElectro() {
		return maxInputDeviceCaseElectro;
	}


	/**
	 * @param maxInputDeviceCaseElectro the maxInputDeviceCaseElectro to set
	 */
	public void setMaxInputDeviceCaseElectro(String maxInputDeviceCaseElectro) {
		this.maxInputDeviceCaseElectro = maxInputDeviceCaseElectro;
	}


	/**
	 * @return the motorJammingElectro
	 */
	public String getMotorJammingElectro() {
		return motorJammingElectro;
	}


	/**
	 * @param motorJammingElectro the motorJammingElectro to set
	 */
	public void setMotorJammingElectro(String motorJammingElectro) {
		this.motorJammingElectro = motorJammingElectro;
	}


	/**
	 * @return the maxMotorJammingElectro
	 */
	public String getMaxMotorJammingElectro() {
		return maxMotorJammingElectro;
	}


	/**
	 * @param maxMotorJammingElectro the maxMotorJammingElectro to set
	 */
	public void setMaxMotorJammingElectro(String maxMotorJammingElectro) {
		this.maxMotorJammingElectro = maxMotorJammingElectro;
	}


	/**
	 * @return the motorCaseElectro
	 */
	public String getMotorCaseElectro() {
		return motorCaseElectro;
	}


	/**
	 * @param motorCaseElectro the motorCaseElectro to set
	 */
	public void setMotorCaseElectro(String motorCaseElectro) {
		this.motorCaseElectro = motorCaseElectro;
	}


	/**
	 * @return the maxMotorCaseElectro
	 */
	public String getMaxMotorCaseElectro() {
		return maxMotorCaseElectro;
	}


	/**
	 * @param maxMotorCaseElectro the maxMotorCaseElectro to set
	 */
	public void setMaxMotorCaseElectro(String maxMotorCaseElectro) {
		this.maxMotorCaseElectro = maxMotorCaseElectro;
	}


	/**
	 * @return the switchCaseElectro
	 */
	public String getSwitchCaseElectro() {
		return switchCaseElectro;
	}


	/**
	 * @param switchCaseElectro the switchCaseElectro to set
	 */
	public void setSwitchCaseElectro(String switchCaseElectro) {
		this.switchCaseElectro = switchCaseElectro;
	}


	/**
	 * @return the maxSwitchCaseElectro
	 */
	public String getMaxSwitchCaseElectro() {
		return maxSwitchCaseElectro;
	}


	/**
	 * @param maxSwitchCaseElectro the maxSwitchCaseElectro to set
	 */
	public void setMaxSwitchCaseElectro(String maxSwitchCaseElectro) {
		this.maxSwitchCaseElectro = maxSwitchCaseElectro;
	}


	/**
	 * @return the staringResistorCaseElectro
	 */
	public String getStaringResistorCaseElectro() {
		return staringResistorCaseElectro;
	}


	/**
	 * @param staringResistorCaseElectro the staringResistorCaseElectro to set
	 */
	public void setStaringResistorCaseElectro(String staringResistorCaseElectro) {
		this.staringResistorCaseElectro = staringResistorCaseElectro;
	}


	/**
	 * @return the maxStaringResistorCaseElectro
	 */
	public String getMaxStaringResistorCaseElectro() {
		return maxStaringResistorCaseElectro;
	}


	/**
	 * @param maxStaringResistorCaseElectro the maxStaringResistorCaseElectro to set
	 */
	public void setMaxStaringResistorCaseElectro(
			String maxStaringResistorCaseElectro) {
		this.maxStaringResistorCaseElectro = maxStaringResistorCaseElectro;
	}


	/**
	 * @return the brakeElectromagnetCaseElectro
	 */
	public String getBrakeElectromagnetCaseElectro() {
		return brakeElectromagnetCaseElectro;
	}


	/**
	 * @param brakeElectromagnetCaseElectro the brakeElectromagnetCaseElectro to set
	 */
	public void setBrakeElectromagnetCaseElectro(
			String brakeElectromagnetCaseElectro) {
		this.brakeElectromagnetCaseElectro = brakeElectromagnetCaseElectro;
	}


	/**
	 * @return the maxBrakeElectromagnetCaseElectro
	 */
	public String getMaxBrakeElectromagnetCaseElectro() {
		return maxBrakeElectromagnetCaseElectro;
	}


	/**
	 * @param maxBrakeElectromagnetCaseElectro the maxBrakeElectromagnetCaseElectro to set
	 */
	public void setMaxBrakeElectromagnetCaseElectro(
			String maxBrakeElectromagnetCaseElectro) {
		this.maxBrakeElectromagnetCaseElectro = maxBrakeElectromagnetCaseElectro;
	}


	/**
	 * @return the controlPanelCaseElectro
	 */
	public String getControlPanelCaseElectro() {
		return controlPanelCaseElectro;
	}


	/**
	 * @param controlPanelCaseElectro the controlPanelCaseElectro to set
	 */
	public void setControlPanelCaseElectro(String controlPanelCaseElectro) {
		this.controlPanelCaseElectro = controlPanelCaseElectro;
	}


	/**
	 * @return the maxControlPanelCaseElectro
	 */
	public String getMaxControlPanelCaseElectro() {
		return maxControlPanelCaseElectro;
	}


	/**
	 * @param maxControlPanelCaseElectro the maxControlPanelCaseElectro to set
	 */
	public void setMaxControlPanelCaseElectro(String maxControlPanelCaseElectro) {
		this.maxControlPanelCaseElectro = maxControlPanelCaseElectro;
	}


	/**
	 * @return the transformerInsulationElectro
	 */
	public String getTransformerInsulationElectro() {
		return transformerInsulationElectro;
	}


	/**
	 * @param transformerInsulationElectro the transformerInsulationElectro to set
	 */
	public void setTransformerInsulationElectro(String transformerInsulationElectro) {
		this.transformerInsulationElectro = transformerInsulationElectro;
	}


	/**
	 * @return the maxTransformerInsulationElectro
	 */
	public String getMaxTransformerInsulationElectro() {
		return maxTransformerInsulationElectro;
	}


	/**
	 * @param maxTransformerInsulationElectro the maxTransformerInsulationElectro to set
	 */
	public void setMaxTransformerInsulationElectro(
			String maxTransformerInsulationElectro) {
		this.maxTransformerInsulationElectro = maxTransformerInsulationElectro;
	}


	/**
	 * @return the wireInsulationElectro
	 */
	public String getWireInsulationElectro() {
		return wireInsulationElectro;
	}


	/**
	 * @param wireInsulationElectro the wireInsulationElectro to set
	 */
	public void setWireInsulationElectro(String wireInsulationElectro) {
		this.wireInsulationElectro = wireInsulationElectro;
	}


	/**
	 * @return the maxWireInsulationElectro
	 */
	public String getMaxWireInsulationElectro() {
		return maxWireInsulationElectro;
	}


	/**
	 * @param maxWireInsulationElectro the maxWireInsulationElectro to set
	 */
	public void setMaxWireInsulationElectro(String maxWireInsulationElectro) {
		this.maxWireInsulationElectro = maxWireInsulationElectro;
	}


	/**
	 * @return the metalHoseInsulationElectro
	 */
	public String getMetalHoseInsulationElectro() {
		return metalHoseInsulationElectro;
	}


	/**
	 * @param metalHoseInsulationElectro the metalHoseInsulationElectro to set
	 */
	public void setMetalHoseInsulationElectro(String metalHoseInsulationElectro) {
		this.metalHoseInsulationElectro = metalHoseInsulationElectro;
	}


	/**
	 * @return the maxMetalHoseInsulationElectro
	 */
	public String getMaxMetalHoseInsulationElectro() {
		return maxMetalHoseInsulationElectro;
	}


	/**
	 * @param maxMetalHoseInsulationElectro the maxMetalHoseInsulationElectro to set
	 */
	public void setMaxMetalHoseInsulationElectro(
			String maxMetalHoseInsulationElectro) {
		this.maxMetalHoseInsulationElectro = maxMetalHoseInsulationElectro;
	}


	/**
	 * @return the lightStateElectro
	 */
	public String getLightStateElectro() {
		return lightStateElectro;
	}


	/**
	 * @param lightStateElectro the lightStateElectro to set
	 */
	public void setLightStateElectro(String lightStateElectro) {
		this.lightStateElectro = lightStateElectro;
	}


	/**
	 * @return the maxLightStateElectro
	 */
	public String getMaxLightStateElectro() {
		return maxLightStateElectro;
	}


	/**
	 * @param maxLightStateElectro the maxLightStateElectro to set
	 */
	public void setMaxLightStateElectro(String maxLightStateElectro) {
		this.maxLightStateElectro = maxLightStateElectro;
	}


	/**
	 * @return the nonstandardProtectorPresenceElectro
	 */
	public String getNonstandardProtectorPresenceElectro() {
		return nonstandardProtectorPresenceElectro;
	}


	/**
	 * @param nonstandardProtectorPresenceElectro the nonstandardProtectorPresenceElectro to set
	 */
	public void setNonstandardProtectorPresenceElectro(
			String nonstandardProtectorPresenceElectro) {
		this.nonstandardProtectorPresenceElectro = nonstandardProtectorPresenceElectro;
	}


	/**
	 * @return the maxNonstandardProtectorPresenceElectro
	 */
	public String getMaxNonstandardProtectorPresenceElectro() {
		return maxNonstandardProtectorPresenceElectro;
	}


	/**
	 * @param maxNonstandardProtectorPresenceElectro the maxNonstandardProtectorPresenceElectro to set
	 */
	public void setMaxNonstandardProtectorPresenceElectro(
			String maxNonstandardProtectorPresenceElectro) {
		this.maxNonstandardProtectorPresenceElectro = maxNonstandardProtectorPresenceElectro;
	}


	/**
	 * @return the limitSwitchCracksSafety
	 */
	public String getLimitSwitchCracksSafety() {
		return limitSwitchCracksSafety;
	}


	/**
	 * @param limitSwitchCracksSafety the limitSwitchCracksSafety to set
	 */
	public void setLimitSwitchCracksSafety(String limitSwitchCracksSafety) {
		this.limitSwitchCracksSafety = limitSwitchCracksSafety;
	}


	/**
	 * @return the maxLimitSwitchCracksSafety
	 */
	public String getMaxLimitSwitchCracksSafety() {
		return maxLimitSwitchCracksSafety;
	}


	/**
	 * @param maxLimitSwitchCracksSafety the maxLimitSwitchCracksSafety to set
	 */
	public void setMaxLimitSwitchCracksSafety(String maxLimitSwitchCracksSafety) {
		this.maxLimitSwitchCracksSafety = maxLimitSwitchCracksSafety;
	}


	/**
	 * @return the limitSwitchPusherSafety
	 */
	public String getLimitSwitchPusherSafety() {
		return limitSwitchPusherSafety;
	}


	/**
	 * @param limitSwitchPusherSafety the limitSwitchPusherSafety to set
	 */
	public void setLimitSwitchPusherSafety(String limitSwitchPusherSafety) {
		this.limitSwitchPusherSafety = limitSwitchPusherSafety;
	}


	/**
	 * @return the maxLimitSwitchPusherSafety
	 */
	public String getMaxLimitSwitchPusherSafety() {
		return maxLimitSwitchPusherSafety;
	}


	/**
	 * @param maxLimitSwitchPusherSafety the maxLimitSwitchPusherSafety to set
	 */
	public void setMaxLimitSwitchPusherSafety(String maxLimitSwitchPusherSafety) {
		this.maxLimitSwitchPusherSafety = maxLimitSwitchPusherSafety;
	}


	/**
	 * @return the limitSwitchSelfResetSafety
	 */
	public String getLimitSwitchSelfResetSafety() {
		return limitSwitchSelfResetSafety;
	}


	/**
	 * @param limitSwitchSelfResetSafety the limitSwitchSelfResetSafety to set
	 */
	public void setLimitSwitchSelfResetSafety(String limitSwitchSelfResetSafety) {
		this.limitSwitchSelfResetSafety = limitSwitchSelfResetSafety;
	}


	/**
	 * @return the maxLimitSwitchSelfResetSafety
	 */
	public String getMaxLimitSwitchSelfResetSafety() {
		return maxLimitSwitchSelfResetSafety;
	}


	/**
	 * @param maxLimitSwitchSelfResetSafety the maxLimitSwitchSelfResetSafety to set
	 */
	public void setMaxLimitSwitchSelfResetSafety(
			String maxLimitSwitchSelfResetSafety) {
		this.maxLimitSwitchSelfResetSafety = maxLimitSwitchSelfResetSafety;
	}


	/**
	 * @return the fixedBufferCracksSafety
	 */
	public String getFixedBufferCracksSafety() {
		return fixedBufferCracksSafety;
	}


	/**
	 * @param fixedBufferCracksSafety the fixedBufferCracksSafety to set
	 */
	public void setFixedBufferCracksSafety(String fixedBufferCracksSafety) {
		this.fixedBufferCracksSafety = fixedBufferCracksSafety;
	}


	/**
	 * @return the maxFixedBufferCracksSafety
	 */
	public String getMaxFixedBufferCracksSafety() {
		return maxFixedBufferCracksSafety;
	}


	/**
	 * @param maxFixedBufferCracksSafety the maxFixedBufferCracksSafety to set
	 */
	public void setMaxFixedBufferCracksSafety(String maxFixedBufferCracksSafety) {
		this.maxFixedBufferCracksSafety = maxFixedBufferCracksSafety;
	}


	/**
	 * @return the signalLampCracksSafety
	 */
	public String getSignalLampCracksSafety() {
		return signalLampCracksSafety;
	}


	/**
	 * @param signalLampCracksSafety the signalLampCracksSafety to set
	 */
	public void setSignalLampCracksSafety(String signalLampCracksSafety) {
		this.signalLampCracksSafety = signalLampCracksSafety;
	}


	/**
	 * @return the maxSignalLampCracksSafety
	 */
	public String getMaxSignalLampCracksSafety() {
		return maxSignalLampCracksSafety;
	}


	/**
	 * @param maxSignalLampCracksSafety the maxSignalLampCracksSafety to set
	 */
	public void setMaxSignalLampCracksSafety(String maxSignalLampCracksSafety) {
		this.maxSignalLampCracksSafety = maxSignalLampCracksSafety;
	}


	/**
	 * @return the audioSignalCracksSafety
	 */
	public String getAudioSignalCracksSafety() {
		return audioSignalCracksSafety;
	}


	/**
	 * @param audioSignalCracksSafety the audioSignalCracksSafety to set
	 */
	public void setAudioSignalCracksSafety(String audioSignalCracksSafety) {
		this.audioSignalCracksSafety = audioSignalCracksSafety;
	}


	/**
	 * @return the maxAudioSignalCracksSafety
	 */
	public String getMaxAudioSignalCracksSafety() {
		return maxAudioSignalCracksSafety;
	}


	/**
	 * @param maxAudioSignalCracksSafety the maxAudioSignalCracksSafety to set
	 */
	public void setMaxAudioSignalCracksSafety(String maxAudioSignalCracksSafety) {
		this.maxAudioSignalCracksSafety = maxAudioSignalCracksSafety;
	}


	/**
	 * @return the novoltageInterlockCracksSafety
	 */
	public String getNovoltageInterlockCracksSafety() {
		return novoltageInterlockCracksSafety;
	}


	/**
	 * @param novoltageInterlockCracksSafety the novoltageInterlockCracksSafety to set
	 */
	public void setNovoltageInterlockCracksSafety(
			String novoltageInterlockCracksSafety) {
		this.novoltageInterlockCracksSafety = novoltageInterlockCracksSafety;
	}


	/**
	 * @return the maxNovoltageInterlockCracksSafety
	 */
	public String getMaxNovoltageInterlockCracksSafety() {
		return maxNovoltageInterlockCracksSafety;
	}


	/**
	 * @param maxNovoltageInterlockCracksSafety the maxNovoltageInterlockCracksSafety to set
	 */
	public void setMaxNovoltageInterlockCracksSafety(
			String maxNovoltageInterlockCracksSafety) {
		this.maxNovoltageInterlockCracksSafety = maxNovoltageInterlockCracksSafety;
	}
	

}
