package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

//@Entity
public class Resistance implements CaseComponent{
		
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	//---------------------------------------Сопротивление переходных контактов цепи 	
	
	//Контроллер
	private double mainLiftController;				//Контроллер мех. гл. подъема
	private double maxMainLiftController;
	private double auxLiftController;				//Контроллер мех. вспом. подъема
	private double maxAuxLiftController;
	private double craneMovController;				//Контроллер мех. пер. крана
	private double maxCraneMovController;
	private double carriageMovementController;			//Контроллер мех. пер. тележки
	private double maxCarriageMovementController;
	//Концевой выключатель	limit switch
	private double mainLiftLimitLwitch;				//Концевой выключатель мех. гл. под.
	private double maxMainLiftLimitSwitch;
	private double auxLiftLimitSwitch;				//Концевой выключатель мех. вспом. под.
	private double maxAuxLiftLimitSwitch;
	private double firstCraneMovLimitSwitch;			//Концевой выключатель мех. пер. крана 1
	private double maxFirstCraneMovLimitSwitch;
	private double secondCraneMovLimitSwitch;			//Концевой выключатель мех. пер. крана 2
	private double maxSecondCraneMovLimitSwitch;
	private double firstCarriageMovLimitSwitch;			//Концевой выключатель мех. пер. тел. 1
	private double maxFirstCarriageMovLimitSwitch;
	private double secondCarriageMovLimitSwitch;			//Концевой выключатель мех. пер. тел. 2
	private double maxSecondCarriageMovLimitSwitch;
	private double doorBlockLimitSwitch;				//Концевой выключатель блокировки двери
	private double maxDoorBlockLimitSwitch;
	//Электродвигатели
	private double mainLiftElmotor;					//Электродв. мех. гл. под.
	private double maxMainLiftElmotor;
	private double auxLiftElmotor;					//Электродв. мех. вспом. под.
	private double maxAuxLiftElmotor;
	private double firstCraneMovElmotor;				//Электродв. мех. пер. кр. 1
	private double maxFirstCraneMovElmotor;
	private double secondCraneMovElmotor;				//Электродв. мех. пер. кр. 2
	private double maxSecondCraneMovElmotor;
	private double carriageMovElmotor;				//Электродв. мех. пер. тележки
	private double maxCarriageMovElmotor;
	//Гидротолкатели
	private double mainLiftBrake;					//Гидротолк. тормоза мех. гл. под.
	private double maxMainLiftBrake;
	private double auxLiftBrake;					//Гидротолк. тормоза мех. вспом. под.
	private double maxAuxLiftBrake;
	private double firstCraneMovBrake;				//Гидротолк. тормоза мех. пер. кр. 1
	private double maxFirstCraneMovBrake;
	private double secondCraneMovBrake;				//Гидротолк. тормоза мех. пер. кр. 2
	private double maxSecondCraneMovBrake;
	private double carriageMovBrake;				//Гидротолк. тормоза мех. пер. тележки
	private double maxCarriageMovBrake;
	//Прочее
	private double safetyPanel;					//Защитная панель
	private double maxSafetyPanel;
	private double electricHeatingUnit;				//Электронагрев. прибор
	private double maxElectricHeatingUnit;
		
	private String contactResistInfo;				//Примечание
	private String contactResistMeasuringDevice;	 		//Прибор для измерений, строка
	private String contactResistExpertInfo;				//Данные о специалисте
 
	//------------------------------Протокол измерения сопротивления изоляции электрооборудования
	
	//Силовая цепь
	
	//от кранового рубильника до главного контактора
	private double contBreakerMainContactorInsulResistAo;		//Сопротивление изоляции до гл. контактора: A-O
	private double contBreakerMainContactorInsulResistBo;		//Сопротивление изоляции до гл. контактора: B-O
	private double contBreakerMainContactorInsulResistCo;		//Сопротивление изоляции до гл. контактора: C-O
	private double contBreakerMainContactorInsulResistAb;		//Сопротивление изоляции до гл. контактора: A-B
	private double contBreakerMainContactorInsulResistBc;		//Сопротивление изоляции до гл. контактора: B-C
	private double contBreakerMainContactorInsulResistCa;		//Сопротивление изоляции до гл. контактора: C-A
	private double maxContBreakerMainContactorInsulResist;		//Предельное значение до гл. контактора, число
	//от главного контактора до электродвиг. мех. главного подъема
	private double contMainLiftInsulResistAo;			//Сопротивление изоляции до электродв. мех. гл. под.: A-O
	private double contMainLiftInsulResistBo;			//Сопротивление изоляции до электродв. мех. гл. под.: B-O
	private double contMainLiftInsulResistCo;			//Сопротивление изоляции до электродв. мех. гл. под.: C-O
	private double contMainLiftInsulResistAb;			//Сопротивление изоляции до электродв. мех. гл. под.: A-B
	private double contMainLiftInsulResistBc;			//Сопротивление изоляции до электродв. мех. гл. под.: B-C
	private double contMainLiftInsulResistCa;			//Сопротивление изоляции до электродв. мех. гл. под.: C-A
	private double maxContMainLiftInsulResist;			//Предельное значение до электродв. мех. гл. под., число
	//от главного контактора до электродвиг. мех. вспомогательного подъема
	private double contAuxLiftingInsulResistAo;			//Сопротивление изоляции до электродв. мех. вспом. под.: A-O
	private double contAuxLiftingInsulResistBo;			//Сопротивление изоляции до электродв. мех. вспом. под.: B-O
	private double contAuxLiftingInsulResistCo;			//Сопротивление изоляции до электродв. мех. вспом. под.: C-O
	private double contAuxLiftingInsulResistAb;			//Сопротивление изоляции до электродв. мех. вспом. под.: A-B
	private double contAuxLiftingInsulResistBc;			//Сопротивление изоляции до электродв. мех. вспом. под.: B-C
	private double contAuxLiftingInsulResistCa;			//Сопротивление изоляции до электродв. мех. вспом. под.: C-A
	private double maxContAuxLiftingInsulResist;			//Предельное значение до электродв. мех. вспом. под., число
	//от главного контактора до электродвиг. мех. передвижения крана №1
	private double contFirstCraneMovInsulResistAo;			//Сопротивление изоляции до электродв. мех. пер. кр. 1: A-O
	private double contFirstCraneMovInsulResistBo;			//Сопротивление изоляции до электродв. мех. пер. кр. 1: B-O
	private double contFirstCraneMovInsulResistCo;			//Сопротивление изоляции до электродв. мех. пер. кр. 1: C-O
	private double contFirstCraneMovInsulResistAb;			//Сопротивление изоляции до электродв. мех. пер. кр. 1: A-B
	private double contFirstCraneMovInsulResistBc;			//Сопротивление изоляции до электродв. мех. пер. кр. 1: B-C
	private double contFirstCraneMovInsulResistCa;			//Сопротивление изоляции до электродв. мех. пер. кр. 1: C-A
	private double maxContFirstCraneMovInsulResist;			//Предельное значение до электродв. мех. пер. кр. 1, число
	//от главного контактора до электродвиг. мех. передвижения крана №2
	private double contSecondCraneMovInsulResistAo;			//Сопротивление изоляции до электродв. мех. пер. кр. 2: A-O
	private double contSecondCraneMovInsulResistBo;			//Сопротивление изоляции до электродв. мех. пер. кр. 2: B-O
	private double contSecondCraneMovInsulResistCo;			//Сопротивление изоляции до электродв. мех. пер. кр. 2: C-O
	private double contSecondCraneMovInsulResistAb;			//Сопротивление изоляции до электродв. мех. пер. кр. 2: A-B
	private double contSecondCraneMovInsulResistBc;			//Сопротивление изоляции до электродв. мех. пер. кр. 2: B-C
	private double contSecondCraneMovInsulResistCa;			//Сопротивление изоляции до электродв. мех. пер. кр. 2: C-A
	private double maxContSecondCraneMovInsulResist;		//Предельное значение до электродв. мех. пер. кр. 2, число
	//от главного контактора до электродвиг. мех. передвижения тележки
	private double contCarriageMovInsulResistAo;			//Сопротивление изоляции до электродв. мех. пер. тел.: A-O
	private double contCarriageMovInsulResistBo;			//Сопротивление изоляции до электродв. мех. пер. тел.: B-O
	private double contCarriageMovInsulResistCo;			//Сопротивление изоляции до электродв. мех. пер. тел.: C-O
	private double contCarriageMovInsulResistAb;			//Сопротивление изоляции до электродв. мех. пер. тел.: A-B
	private double contCarriageMovInsulResistBc;			//Сопротивление изоляции до электродв. мех. пер. тел.: B-C
	private double contCarriageMovInsulResistCa;			//Сопротивление изоляции до электродв. мех. пер. тел.: C-A
	private double maxContCarriageMovInsulResist;			//Предельное значение до электродв. мех. пер. тел., число
	
	//--------------------Цепи управления
	
	private double controlCircuitInsulResist;			//Сопротивление изоляции цепи управления
	private double maxControlCircuitInsulResist;			//Предельное значение, число
	
	//--------------------Электродвигатели механизмов
	
	//главного подъема
	private double mainLiftingStator;				//Сопротивление изоляции статора электр. мех. гл. под.
	private double maxMainLiftingStator;
	private double mainLiftingRotor;				//Сопротивление изоляции ротора электр. мех. гл. под.
	private double maxMainLiftingRotor;
	//вспомогательного подъема
	private double auxLiftingStator;				//Сопротивление изоляции статора электр. вспом. гл. под.
	private double maxAuxLiftingStator;
	private double auxLiftingRotor;					//Сопротивление изоляции ротора электр. вспом. гл. под.
	private double maxAuxLiftingRotor;
	//передвижения крана №1
	private double firstCraneMovStator;				//Сопротивление изоляции статора электр. мех. пер. кр. 1
	private double maxFirstCraneMovStator;
	private double firstCraneMovRotor;				//Сопротивление изоляции ротора электр. мех. пер. кр. 1
	private double maxFirstCraneMovRotor;
	//передвижения крана №2
	private double secondCraneMovStator;				//Сопротивление изоляции статора электр. мех. пер. кр. 2
	private double maxSecondCraneMovStator;
	private double secondCraneMovRotor;				//Сопротивление изоляции ротора электр. мех. пер. кр. 2
	private double maxSecondCraneMovRotor;
	//передвижения тележки
	private double carriageMovStator;				//Сопротивление изоляции статора электр. мех. пер. тел.
	private double maxCarriageMovStator;
	private double carriageMovRotor;				//Сопротивление изоляции ротора электр. мех. пер. тел.
	private double maxCarriageMovRotor;
	
	//--------------------Гидротолкатели тормозов механизмов
	
	//главного подъема
	private double mainLiftingInsulBrake;				//Сопротивление изоляции гидрот. тормоза мех. гл. под.
	private double maxMainLiftingInsulBrake;
	//вспомогательного подъема
	private double auxLiftingInsulBrake;				//Сопротивление изоляции гидрот. тормоза мех. вспом. под.
	private double maxAuxLiftingInsulBrake;
	//передвижения крана №1
	private double firstCraneMovInsulBrake;				//Сопротивление изоляции гидрот. тормоза мех. пер. кр. 1
	private double maxFirstCraneMovInsulBrake;
	//передвижения крана №2
	private double secondCraneMovInsulBrake;			//Сопротивление изоляции гидрот. тормоза мех. пер. кр. 2
	private double maxSecondCraneMovInsulBrake;
	//передвижения тележки
	private double carriageMovInsulBrake;				//Сопротивление изоляции гидрот. тормоза мех. пер. тележки
	private double maxCarriageMovInsulBrake;
	
	//--------------------Дополнительная информация
	
	private String insulResistInfo;					//Примечание
	private String insulResistMeasuringDevice;	 		//Прибор для измерений, строка
	private String insulResistExpertInfo;				//Данные о специалисте
	
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}

	public Resistance() {
		super();
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
	 * @return the mainLiftController
	 */
	public double getMainLiftController() {
		return mainLiftController;
	}

	/**
	 * @param mainLiftController the mainLiftController to set
	 */
	public void setMainLiftController(double mainLiftController) {
		this.mainLiftController = mainLiftController;
	}

	/**
	 * @return the maxMainLiftController
	 */
	public double getMaxMainLiftController() {
		return maxMainLiftController;
	}

	/**
	 * @param maxMainLiftController the maxMainLiftController to set
	 */
	public void setMaxMainLiftController(double maxMainLiftController) {
		this.maxMainLiftController = maxMainLiftController;
	}

	/**
	 * @return the auxLiftController
	 */
	public double getAuxLiftController() {
		return auxLiftController;
	}

	/**
	 * @param auxLiftController the auxLiftController to set
	 */
	public void setAuxLiftController(double auxLiftController) {
		this.auxLiftController = auxLiftController;
	}

	/**
	 * @return the maxAuxLiftController
	 */
	public double getMaxAuxLiftController() {
		return maxAuxLiftController;
	}

	/**
	 * @param maxAuxLiftController the maxAuxLiftController to set
	 */
	public void setMaxAuxLiftController(double maxAuxLiftController) {
		this.maxAuxLiftController = maxAuxLiftController;
	}

	/**
	 * @return the craneMovController
	 */
	public double getCraneMovController() {
		return craneMovController;
	}

	/**
	 * @param craneMovController the craneMovController to set
	 */
	public void setCraneMovController(double craneMovController) {
		this.craneMovController = craneMovController;
	}

	/**
	 * @return the maxCraneMovController
	 */
	public double getMaxCraneMovController() {
		return maxCraneMovController;
	}

	/**
	 * @param maxCraneMovController the maxCraneMovController to set
	 */
	public void setMaxCraneMovController(double maxCraneMovController) {
		this.maxCraneMovController = maxCraneMovController;
	}

	/**
	 * @return the carriageMovementController
	 */
	public double getCarriageMovementController() {
		return carriageMovementController;
	}

	/**
	 * @param carriageMovementController the carriageMovementController to set
	 */
	public void setCarriageMovementController(double carriageMovementController) {
		this.carriageMovementController = carriageMovementController;
	}

	/**
	 * @return the maxCarriageMovementController
	 */
	public double getMaxCarriageMovementController() {
		return maxCarriageMovementController;
	}

	/**
	 * @param maxCarriageMovementController the maxCarriageMovementController to set
	 */
	public void setMaxCarriageMovementController(
			double maxCarriageMovementController) {
		this.maxCarriageMovementController = maxCarriageMovementController;
	}

	/**
	 * @return the mainLiftLimitLwitch
	 */
	public double getMainLiftLimitLwitch() {
		return mainLiftLimitLwitch;
	}

	/**
	 * @param mainLiftLimitLwitch the mainLiftLimitLwitch to set
	 */
	public void setMainLiftLimitLwitch(double mainLiftLimitLwitch) {
		this.mainLiftLimitLwitch = mainLiftLimitLwitch;
	}

	/**
	 * @return the maxMainLiftLimitSwitch
	 */
	public double getMaxMainLiftLimitSwitch() {
		return maxMainLiftLimitSwitch;
	}

	/**
	 * @param maxMainLiftLimitSwitch the maxMainLiftLimitSwitch to set
	 */
	public void setMaxMainLiftLimitSwitch(double maxMainLiftLimitSwitch) {
		this.maxMainLiftLimitSwitch = maxMainLiftLimitSwitch;
	}

	/**
	 * @return the auxLiftLimitSwitch
	 */
	public double getAuxLiftLimitSwitch() {
		return auxLiftLimitSwitch;
	}

	/**
	 * @param auxLiftLimitSwitch the auxLiftLimitSwitch to set
	 */
	public void setAuxLiftLimitSwitch(double auxLiftLimitSwitch) {
		this.auxLiftLimitSwitch = auxLiftLimitSwitch;
	}

	/**
	 * @return the maxAuxLiftLimitSwitch
	 */
	public double getMaxAuxLiftLimitSwitch() {
		return maxAuxLiftLimitSwitch;
	}

	/**
	 * @param maxAuxLiftLimitSwitch the maxAuxLiftLimitSwitch to set
	 */
	public void setMaxAuxLiftLimitSwitch(double maxAuxLiftLimitSwitch) {
		this.maxAuxLiftLimitSwitch = maxAuxLiftLimitSwitch;
	}

	/**
	 * @return the firstCraneMovLimitSwitch
	 */
	public double getFirstCraneMovLimitSwitch() {
		return firstCraneMovLimitSwitch;
	}

	/**
	 * @param firstCraneMovLimitSwitch the firstCraneMovLimitSwitch to set
	 */
	public void setFirstCraneMovLimitSwitch(double firstCraneMovLimitSwitch) {
		this.firstCraneMovLimitSwitch = firstCraneMovLimitSwitch;
	}



	/**
	 * @return the maxFirstCraneMovLimitSwitch
	 */
	public double getMaxFirstCraneMovLimitSwitch() {
		return maxFirstCraneMovLimitSwitch;
	}

	/**
	 * @param maxFirstCraneMovLimitSwitch the maxFirstCraneMovLimitSwitch to set
	 */
	public void setMaxFirstCraneMovLimitSwitch(double maxFirstCraneMovLimitSwitch) {
		this.maxFirstCraneMovLimitSwitch = maxFirstCraneMovLimitSwitch;
	}

	/**
	 * @return the secondCraneMovLimitSwitch
	 */
	public double getSecondCraneMovLimitSwitch() {
		return secondCraneMovLimitSwitch;
	}

	/**
	 * @param secondCraneMovLimitSwitch the secondCraneMovLimitSwitch to set
	 */
	public void setSecondCraneMovLimitSwitch(double secondCraneMovLimitSwitch) {
		this.secondCraneMovLimitSwitch = secondCraneMovLimitSwitch;
	}

	/**
	 * @return the maxSecondCraneMovLimitSwitch
	 */
	public double getMaxSecondCraneMovLimitSwitch() {
		return maxSecondCraneMovLimitSwitch;
	}

	/**
	 * @param maxSecondCraneMovLimitSwitch the maxSecondCraneMovLimitSwitch to set
	 */
	public void setMaxSecondCraneMovLimitSwitch(double maxSecondCraneMovLimitSwitch) {
		this.maxSecondCraneMovLimitSwitch = maxSecondCraneMovLimitSwitch;
	}

	/**
	 * @return the firstCarriageMovLimitSwitch
	 */
	public double getFirstCarriageMovLimitSwitch() {
		return firstCarriageMovLimitSwitch;
	}

	/**
	 * @param firstCarriageMovLimitSwitch the firstCarriageMovLimitSwitch to set
	 */
	public void setFirstCarriageMovLimitSwitch(double firstCarriageMovLimitSwitch) {
		this.firstCarriageMovLimitSwitch = firstCarriageMovLimitSwitch;
	}

	/**
	 * @return the maxFirstCarriageMovLimitSwitch
	 */
	public double getMaxFirstCarriageMovLimitSwitch() {
		return maxFirstCarriageMovLimitSwitch;
	}

	/**
	 * @param maxFirstCarriageMovLimitSwitch the maxFirstCarriageMovLimitSwitch to set
	 */
	public void setMaxFirstCarriageMovLimitSwitch(
			double maxFirstCarriageMovLimitSwitch) {
		this.maxFirstCarriageMovLimitSwitch = maxFirstCarriageMovLimitSwitch;
	}

	/**
	 * @return the secondCarriageMovLimitSwitch
	 */
	public double getSecondCarriageMovLimitSwitch() {
		return secondCarriageMovLimitSwitch;
	}

	/**
	 * @param secondCarriageMovLimitSwitch the secondCarriageMovLimitSwitch to set
	 */
	public void setSecondCarriageMovLimitSwitch(double secondCarriageMovLimitSwitch) {
		this.secondCarriageMovLimitSwitch = secondCarriageMovLimitSwitch;
	}

	/**
	 * @return the maxSecondCarriageMovLimitSwitch
	 */
	public double getMaxSecondCarriageMovLimitSwitch() {
		return maxSecondCarriageMovLimitSwitch;
	}

	/**
	 * @param maxSecondCarriageMovLimitSwitch the maxSecondCarriageMovLimitSwitch to set
	 */
	public void setMaxSecondCarriageMovLimitSwitch(
			double maxSecondCarriageMovLimitSwitch) {
		this.maxSecondCarriageMovLimitSwitch = maxSecondCarriageMovLimitSwitch;
	}

	/**
	 * @return the doorBlockLimitSwitch
	 */
	public double getDoorBlockLimitSwitch() {
		return doorBlockLimitSwitch;
	}

	/**
	 * @param doorBlockLimitSwitch the doorBlockLimitSwitch to set
	 */
	public void setDoorBlockLimitSwitch(double doorBlockLimitSwitch) {
		this.doorBlockLimitSwitch = doorBlockLimitSwitch;
	}

	/**
	 * @return the maxDoorBlockLimitSwitch
	 */
	public double getMaxDoorBlockLimitSwitch() {
		return maxDoorBlockLimitSwitch;
	}

	/**
	 * @param maxDoorBlockLimitSwitch the maxDoorBlockLimitSwitch to set
	 */
	public void setMaxDoorBlockLimitSwitch(double maxDoorBlockLimitSwitch) {
		this.maxDoorBlockLimitSwitch = maxDoorBlockLimitSwitch;
	}

	/**
	 * @return the mainLiftElmotor
	 */
	public double getMainLiftElmotor() {
		return mainLiftElmotor;
	}

	/**
	 * @param mainLiftElmotor the mainLiftElmotor to set
	 */
	public void setMainLiftElmotor(double mainLiftElmotor) {
		this.mainLiftElmotor = mainLiftElmotor;
	}

	/**
	 * @return the maxMainLiftElmotor
	 */
	public double getMaxMainLiftElmotor() {
		return maxMainLiftElmotor;
	}

	/**
	 * @param maxMainLiftElmotor the maxMainLiftElmotor to set
	 */
	public void setMaxMainLiftElmotor(double maxMainLiftElmotor) {
		this.maxMainLiftElmotor = maxMainLiftElmotor;
	}

	/**
	 * @return the auxLiftElmotor
	 */
	public double getAuxLiftElmotor() {
		return auxLiftElmotor;
	}

	/**
	 * @param auxLiftElmotor the auxLiftElmotor to set
	 */
	public void setAuxLiftElmotor(double auxLiftElmotor) {
		this.auxLiftElmotor = auxLiftElmotor;
	}

	/**
	 * @return the maxAuxLiftElmotor
	 */
	public double getMaxAuxLiftElmotor() {
		return maxAuxLiftElmotor;
	}

	/**
	 * @param maxAuxLiftElmotor the maxAuxLiftElmotor to set
	 */
	public void setMaxAuxLiftElmotor(double maxAuxLiftElmotor) {
		this.maxAuxLiftElmotor = maxAuxLiftElmotor;
	}

	/**
	 * @return the firstCraneMovElmotor
	 */
	public double getFirstCraneMovElmotor() {
		return firstCraneMovElmotor;
	}

	/**
	 * @param firstCraneMovElmotor the firstCraneMovElmotor to set
	 */
	public void setFirstCraneMovElmotor(double firstCraneMovElmotor) {
		this.firstCraneMovElmotor = firstCraneMovElmotor;
	}

	/**
	 * @return the maxFirstCraneMovElmotor
	 */
	public double getMaxFirstCraneMovElmotor() {
		return maxFirstCraneMovElmotor;
	}

	/**
	 * @param maxFirstCraneMovElmotor the maxFirstCraneMovElmotor to set
	 */
	public void setMaxFirstCraneMovElmotor(double maxFirstCraneMovElmotor) {
		this.maxFirstCraneMovElmotor = maxFirstCraneMovElmotor;
	}

	/**
	 * @return the secondCraneMovElmotor
	 */
	public double getSecondCraneMovElmotor() {
		return secondCraneMovElmotor;
	}

	/**
	 * @param secondCraneMovElmotor the secondCraneMovElmotor to set
	 */
	public void setSecondCraneMovElmotor(double secondCraneMovElmotor) {
		this.secondCraneMovElmotor = secondCraneMovElmotor;
	}

	/**
	 * @return the maxSecondCraneMovElmotor
	 */
	public double getMaxSecondCraneMovElmotor() {
		return maxSecondCraneMovElmotor;
	}

	/**
	 * @param maxSecondCraneMovElmotor the maxSecondCraneMovElmotor to set
	 */
	public void setMaxSecondCraneMovElmotor(double maxSecondCraneMovElmotor) {
		this.maxSecondCraneMovElmotor = maxSecondCraneMovElmotor;
	}

	/**
	 * @return the carriageMovElmotor
	 */
	public double getCarriageMovElmotor() {
		return carriageMovElmotor;
	}

	/**
	 * @param carriageMovElmotor the carriageMovElmotor to set
	 */
	public void setCarriageMovElmotor(double carriageMovElmotor) {
		this.carriageMovElmotor = carriageMovElmotor;
	}

	/**
	 * @return the maxCarriageMovElmotor
	 */
	public double getMaxCarriageMovElmotor() {
		return maxCarriageMovElmotor;
	}

	/**
	 * @param maxCarriageMovElmotor the maxCarriageMovElmotor to set
	 */
	public void setMaxCarriageMovElmotor(double maxCarriageMovElmotor) {
		this.maxCarriageMovElmotor = maxCarriageMovElmotor;
	}

	/**
	 * @return the mainLiftBrake
	 */
	public double getMainLiftBrake() {
		return mainLiftBrake;
	}

	/**
	 * @param mainLiftBrake the mainLiftBrake to set
	 */
	public void setMainLiftBrake(double mainLiftBrake) {
		this.mainLiftBrake = mainLiftBrake;
	}

	/**
	 * @return the maxMainLiftBrake
	 */
	public double getMaxMainLiftBrake() {
		return maxMainLiftBrake;
	}

	/**
	 * @param maxMainLiftBrake the maxMainLiftBrake to set
	 */
	public void setMaxMainLiftBrake(double maxMainLiftBrake) {
		this.maxMainLiftBrake = maxMainLiftBrake;
	}

	/**
	 * @return the auxLiftBrake
	 */
	public double getAuxLiftBrake() {
		return auxLiftBrake;
	}

	/**
	 * @param auxLiftBrake the auxLiftBrake to set
	 */
	public void setAuxLiftBrake(double auxLiftBrake) {
		this.auxLiftBrake = auxLiftBrake;
	}

	/**
	 * @return the maxAuxLiftBrake
	 */
	public double getMaxAuxLiftBrake() {
		return maxAuxLiftBrake;
	}

	/**
	 * @param maxAuxLiftBrake the maxAuxLiftBrake to set
	 */
	public void setMaxAuxLiftBrake(double maxAuxLiftBrake) {
		this.maxAuxLiftBrake = maxAuxLiftBrake;
	}

	/**
	 * @return the firstCraneMovBrake
	 */
	public double getFirstCraneMovBrake() {
		return firstCraneMovBrake;
	}

	/**
	 * @param firstCraneMovBrake the firstCraneMovBrake to set
	 */
	public void setFirstCraneMovBrake(double firstCraneMovBrake) {
		this.firstCraneMovBrake = firstCraneMovBrake;
	}

	/**
	 * @return the maxFirstCraneMovBrake
	 */
	public double getMaxFirstCraneMovBrake() {
		return maxFirstCraneMovBrake;
	}

	/**
	 * @param maxFirstCraneMovBrake the maxFirstCraneMovBrake to set
	 */
	public void setMaxFirstCraneMovBrake(double maxFirstCraneMovBrake) {
		this.maxFirstCraneMovBrake = maxFirstCraneMovBrake;
	}

	/**
	 * @return the secondCraneMovBrake
	 */
	public double getSecondCraneMovBrake() {
		return secondCraneMovBrake;
	}

	/**
	 * @param secondCraneMovBrake the secondCraneMovBrake to set
	 */
	public void setSecondCraneMovBrake(double secondCraneMovBrake) {
		this.secondCraneMovBrake = secondCraneMovBrake;
	}

	/**
	 * @return the maxSecondCraneMovBrake
	 */
	public double getMaxSecondCraneMovBrake() {
		return maxSecondCraneMovBrake;
	}

	/**
	 * @param maxSecondCraneMovBrake the maxSecondCraneMovBrake to set
	 */
	public void setMaxSecondCraneMovBrake(double maxSecondCraneMovBrake) {
		this.maxSecondCraneMovBrake = maxSecondCraneMovBrake;
	}

	/**
	 * @return the carriageMovBrake
	 */
	public double getCarriageMovBrake() {
		return carriageMovBrake;
	}

	/**
	 * @param carriageMovBrake the carriageMovBrake to set
	 */
	public void setCarriageMovBrake(double carriageMovBrake) {
		this.carriageMovBrake = carriageMovBrake;
	}

	/**
	 * @return the maxCarriageMovBrake
	 */
	public double getMaxCarriageMovBrake() {
		return maxCarriageMovBrake;
	}

	/**
	 * @param maxCarriageMovBrake the maxCarriageMovBrake to set
	 */
	public void setMaxCarriageMovBrake(double maxCarriageMovBrake) {
		this.maxCarriageMovBrake = maxCarriageMovBrake;
	}

	/**
	 * @return the safetyPanel
	 */
	public double getSafetyPanel() {
		return safetyPanel;
	}

	/**
	 * @param safetyPanel the safetyPanel to set
	 */
	public void setSafetyPanel(double safetyPanel) {
		this.safetyPanel = safetyPanel;
	}

	/**
	 * @return the maxSafetyPanel
	 */
	public double getMaxSafetyPanel() {
		return maxSafetyPanel;
	}

	/**
	 * @param maxSafetyPanel the maxSafetyPanel to set
	 */
	public void setMaxSafetyPanel(double maxSafetyPanel) {
		this.maxSafetyPanel = maxSafetyPanel;
	}

	/**
	 * @return the electricHeatingUnit
	 */
	public double getElectricHeatingUnit() {
		return electricHeatingUnit;
	}

	/**
	 * @param electricHeatingUnit the electricHeatingUnit to set
	 */
	public void setElectricHeatingUnit(double electricHeatingUnit) {
		this.electricHeatingUnit = electricHeatingUnit;
	}

	/**
	 * @return the maxElectricHeatingUnit
	 */
	public double getMaxElectricHeatingUnit() {
		return maxElectricHeatingUnit;
	}

	/**
	 * @param maxElectricHeatingUnit the maxElectricHeatingUnit to set
	 */
	public void setMaxElectricHeatingUnit(double maxElectricHeatingUnit) {
		this.maxElectricHeatingUnit = maxElectricHeatingUnit;
	}

	/**
	 * @return the contactResistInfo
	 */
	public String getContactResistInfo() {
		return contactResistInfo;
	}

	/**
	 * @param contactResistInfo the contactResistInfo to set
	 */
	public void setContactResistInfo(String contactResistInfo) {
		this.contactResistInfo = contactResistInfo;
	}

	/**
	 * @return the contactResistMeasuringDevice
	 */
	public String getContactResistMeasuringDevice() {
		return contactResistMeasuringDevice;
	}

	/**
	 * @param contactResistMeasuringDevice the contactResistMeasuringDevice to set
	 */
	public void setContactResistMeasuringDevice(String contactResistMeasuringDevice) {
		this.contactResistMeasuringDevice = contactResistMeasuringDevice;
	}

	/**
	 * @return the contactResistExpertInfo
	 */
	public String getContactResistExpertInfo() {
		return contactResistExpertInfo;
	}

	/**
	 * @param contactResistExpertInfo the contactResistExpertInfo to set
	 */
	public void setContactResistExpertInfo(String contactResistExpertInfo) {
		this.contactResistExpertInfo = contactResistExpertInfo;
	}

	/**
	 * @return the contBreakerMainContactorInsulResistAo
	 */
	public double getContBreakerMainContactorInsulResistAo() {
		return contBreakerMainContactorInsulResistAo;
	}

	/**
	 * @param contBreakerMainContactorInsulResistAo the contBreakerMainContactorInsulResistAo to set
	 */
	public void setContBreakerMainContactorInsulResistAo(
			double contBreakerMainContactorInsulResistAo) {
		this.contBreakerMainContactorInsulResistAo = contBreakerMainContactorInsulResistAo;
	}

	/**
	 * @return the contBreakerMainContactorInsulResistBo
	 */
	public double getContBreakerMainContactorInsulResistBo() {
		return contBreakerMainContactorInsulResistBo;
	}

	/**
	 * @param contBreakerMainContactorInsulResistBo the contBreakerMainContactorInsulResistBo to set
	 */
	public void setContBreakerMainContactorInsulResistBo(
			double contBreakerMainContactorInsulResistBo) {
		this.contBreakerMainContactorInsulResistBo = contBreakerMainContactorInsulResistBo;
	}

	/**
	 * @return the contBreakerMainContactorInsulResistCo
	 */
	public double getContBreakerMainContactorInsulResistCo() {
		return contBreakerMainContactorInsulResistCo;
	}

	/**
	 * @param contBreakerMainContactorInsulResistCo the contBreakerMainContactorInsulResistCo to set
	 */
	public void setContBreakerMainContactorInsulResistCo(
			double contBreakerMainContactorInsulResistCo) {
		this.contBreakerMainContactorInsulResistCo = contBreakerMainContactorInsulResistCo;
	}

	/**
	 * @return the contBreakerMainContactorInsulResistAb
	 */
	public double getContBreakerMainContactorInsulResistAb() {
		return contBreakerMainContactorInsulResistAb;
	}

	/**
	 * @param contBreakerMainContactorInsulResistAb the contBreakerMainContactorInsulResistAb to set
	 */
	public void setContBreakerMainContactorInsulResistAb(
			double contBreakerMainContactorInsulResistAb) {
		this.contBreakerMainContactorInsulResistAb = contBreakerMainContactorInsulResistAb;
	}

	/**
	 * @return the contBreakerMainContactorInsulResistBc
	 */
	public double getContBreakerMainContactorInsulResistBc() {
		return contBreakerMainContactorInsulResistBc;
	}

	/**
	 * @param contBreakerMainContactorInsulResistBc the contBreakerMainContactorInsulResistBc to set
	 */
	public void setContBreakerMainContactorInsulResistBc(
			double contBreakerMainContactorInsulResistBc) {
		this.contBreakerMainContactorInsulResistBc = contBreakerMainContactorInsulResistBc;
	}

	/**
	 * @return the contBreakerMainContactorInsulResistCa
	 */
	public double getContBreakerMainContactorInsulResistCa() {
		return contBreakerMainContactorInsulResistCa;
	}

	/**
	 * @param contBreakerMainContactorInsulResistCa the contBreakerMainContactorInsulResistCa to set
	 */
	public void setContBreakerMainContactorInsulResistCa(
			double contBreakerMainContactorInsulResistCa) {
		this.contBreakerMainContactorInsulResistCa = contBreakerMainContactorInsulResistCa;
	}

	/**
	 * @return the maxContBreakerMainContactorInsulResist
	 */
	public double getMaxContBreakerMainContactorInsulResist() {
		return maxContBreakerMainContactorInsulResist;
	}

	/**
	 * @param maxContBreakerMainContactorInsulResist the maxContBreakerMainContactorInsulResist to set
	 */
	public void setMaxContBreakerMainContactorInsulResist(
			double maxContBreakerMainContactorInsulResist) {
		this.maxContBreakerMainContactorInsulResist = maxContBreakerMainContactorInsulResist;
	}

	/**
	 * @return the contMainLiftInsulResistAo
	 */
	public double getContMainLiftInsulResistAo() {
		return contMainLiftInsulResistAo;
	}

	/**
	 * @param contMainLiftInsulResistAo the contMainLiftInsulResistAo to set
	 */
	public void setContMainLiftInsulResistAo(double contMainLiftInsulResistAo) {
		this.contMainLiftInsulResistAo = contMainLiftInsulResistAo;
	}

	/**
	 * @return the contMainLiftInsulResistBo
	 */
	public double getContMainLiftInsulResistBo() {
		return contMainLiftInsulResistBo;
	}

	/**
	 * @param contMainLiftInsulResistBo the contMainLiftInsulResistBo to set
	 */
	public void setContMainLiftInsulResistBo(double contMainLiftInsulResistBo) {
		this.contMainLiftInsulResistBo = contMainLiftInsulResistBo;
	}

	/**
	 * @return the contMainLiftInsulResistCo
	 */
	public double getContMainLiftInsulResistCo() {
		return contMainLiftInsulResistCo;
	}

	/**
	 * @param contMainLiftInsulResistCo the contMainLiftInsulResistCo to set
	 */
	public void setContMainLiftInsulResistCo(double contMainLiftInsulResistCo) {
		this.contMainLiftInsulResistCo = contMainLiftInsulResistCo;
	}

	/**
	 * @return the contMainLiftInsulResistAb
	 */
	public double getContMainLiftInsulResistAb() {
		return contMainLiftInsulResistAb;
	}

	/**
	 * @param contMainLiftInsulResistAb the contMainLiftInsulResistAb to set
	 */
	public void setContMainLiftInsulResistAb(double contMainLiftInsulResistAb) {
		this.contMainLiftInsulResistAb = contMainLiftInsulResistAb;
	}

	/**
	 * @return the contMainLiftInsulResistBc
	 */
	public double getContMainLiftInsulResistBc() {
		return contMainLiftInsulResistBc;
	}

	/**
	 * @param contMainLiftInsulResistBc the contMainLiftInsulResistBc to set
	 */
	public void setContMainLiftInsulResistBc(double contMainLiftInsulResistBc) {
		this.contMainLiftInsulResistBc = contMainLiftInsulResistBc;
	}

	/**
	 * @return the contMainLiftInsulResistCa
	 */
	public double getContMainLiftInsulResistCa() {
		return contMainLiftInsulResistCa;
	}

	/**
	 * @param contMainLiftInsulResistCa the contMainLiftInsulResistCa to set
	 */
	public void setContMainLiftInsulResistCa(double contMainLiftInsulResistCa) {
		this.contMainLiftInsulResistCa = contMainLiftInsulResistCa;
	}

	/**
	 * @return the maxContMainLiftInsulResist
	 */
	public double getMaxContMainLiftInsulResist() {
		return maxContMainLiftInsulResist;
	}

	/**
	 * @param maxContMainLiftInsulResist the maxContMainLiftInsulResist to set
	 */
	public void setMaxContMainLiftInsulResist(double maxContMainLiftInsulResist) {
		this.maxContMainLiftInsulResist = maxContMainLiftInsulResist;
	}

	/**
	 * @return the contAuxLiftingInsulResistAo
	 */
	public double getContAuxLiftingInsulResistAo() {
		return contAuxLiftingInsulResistAo;
	}

	/**
	 * @param contAuxLiftingInsulResistAo the contAuxLiftingInsulResistAo to set
	 */
	public void setContAuxLiftingInsulResistAo(double contAuxLiftingInsulResistAo) {
		this.contAuxLiftingInsulResistAo = contAuxLiftingInsulResistAo;
	}

	/**
	 * @return the contAuxLiftingInsulResistBo
	 */
	public double getContAuxLiftingInsulResistBo() {
		return contAuxLiftingInsulResistBo;
	}

	/**
	 * @param contAuxLiftingInsulResistBo the contAuxLiftingInsulResistBo to set
	 */
	public void setContAuxLiftingInsulResistBo(double contAuxLiftingInsulResistBo) {
		this.contAuxLiftingInsulResistBo = contAuxLiftingInsulResistBo;
	}

	/**
	 * @return the contAuxLiftingInsulResistCo
	 */
	public double getContAuxLiftingInsulResistCo() {
		return contAuxLiftingInsulResistCo;
	}

	/**
	 * @param contAuxLiftingInsulResistCo the contAuxLiftingInsulResistCo to set
	 */
	public void setContAuxLiftingInsulResistCo(double contAuxLiftingInsulResistCo) {
		this.contAuxLiftingInsulResistCo = contAuxLiftingInsulResistCo;
	}

	/**
	 * @return the contAuxLiftingInsulResistAb
	 */
	public double getContAuxLiftingInsulResistAb() {
		return contAuxLiftingInsulResistAb;
	}

	/**
	 * @param contAuxLiftingInsulResistAb the contAuxLiftingInsulResistAb to set
	 */
	public void setContAuxLiftingInsulResistAb(double contAuxLiftingInsulResistAb) {
		this.contAuxLiftingInsulResistAb = contAuxLiftingInsulResistAb;
	}

	/**
	 * @return the contAuxLiftingInsulResistBc
	 */
	public double getContAuxLiftingInsulResistBc() {
		return contAuxLiftingInsulResistBc;
	}

	/**
	 * @param contAuxLiftingInsulResistBc the contAuxLiftingInsulResistBc to set
	 */
	public void setContAuxLiftingInsulResistBc(double contAuxLiftingInsulResistBc) {
		this.contAuxLiftingInsulResistBc = contAuxLiftingInsulResistBc;
	}

	/**
	 * @return the contAuxLiftingInsulResistCa
	 */
	public double getContAuxLiftingInsulResistCa() {
		return contAuxLiftingInsulResistCa;
	}

	/**
	 * @param contAuxLiftingInsulResistCa the contAuxLiftingInsulResistCa to set
	 */
	public void setContAuxLiftingInsulResistCa(double contAuxLiftingInsulResistCa) {
		this.contAuxLiftingInsulResistCa = contAuxLiftingInsulResistCa;
	}

	/**
	 * @return the maxContAuxLiftingInsulResist
	 */
	public double getMaxContAuxLiftingInsulResist() {
		return maxContAuxLiftingInsulResist;
	}

	/**
	 * @param maxContAuxLiftingInsulResist the maxContAuxLiftingInsulResist to set
	 */
	public void setMaxContAuxLiftingInsulResist(double maxContAuxLiftingInsulResist) {
		this.maxContAuxLiftingInsulResist = maxContAuxLiftingInsulResist;
	}

	/**
	 * @return the contFirstCraneMovInsulResistAo
	 */
	public double getContFirstCraneMovInsulResistAo() {
		return contFirstCraneMovInsulResistAo;
	}

	/**
	 * @param contFirstCraneMovInsulResistAo the contFirstCraneMovInsulResistAo to set
	 */
	public void setContFirstCraneMovInsulResistAo(
			double contFirstCraneMovInsulResistAo) {
		this.contFirstCraneMovInsulResistAo = contFirstCraneMovInsulResistAo;
	}

	/**
	 * @return the contFirstCraneMovInsulResistBo
	 */
	public double getContFirstCraneMovInsulResistBo() {
		return contFirstCraneMovInsulResistBo;
	}

	/**
	 * @param contFirstCraneMovInsulResistBo the contFirstCraneMovInsulResistBo to set
	 */
	public void setContFirstCraneMovInsulResistBo(
			double contFirstCraneMovInsulResistBo) {
		this.contFirstCraneMovInsulResistBo = contFirstCraneMovInsulResistBo;
	}

	/**
	 * @return the contFirstCraneMovInsulResistCo
	 */
	public double getContFirstCraneMovInsulResistCo() {
		return contFirstCraneMovInsulResistCo;
	}

	/**
	 * @param contFirstCraneMovInsulResistCo the contFirstCraneMovInsulResistCo to set
	 */
	public void setContFirstCraneMovInsulResistCo(
			double contFirstCraneMovInsulResistCo) {
		this.contFirstCraneMovInsulResistCo = contFirstCraneMovInsulResistCo;
	}

	/**
	 * @return the contFirstCraneMovInsulResistAb
	 */
	public double getContFirstCraneMovInsulResistAb() {
		return contFirstCraneMovInsulResistAb;
	}

	/**
	 * @param contFirstCraneMovInsulResistAb the contFirstCraneMovInsulResistAb to set
	 */
	public void setContFirstCraneMovInsulResistAb(
			double contFirstCraneMovInsulResistAb) {
		this.contFirstCraneMovInsulResistAb = contFirstCraneMovInsulResistAb;
	}

	/**
	 * @return the contFirstCraneMovInsulResistBc
	 */
	public double getContFirstCraneMovInsulResistBc() {
		return contFirstCraneMovInsulResistBc;
	}

	/**
	 * @param contFirstCraneMovInsulResistBc the contFirstCraneMovInsulResistBc to set
	 */
	public void setContFirstCraneMovInsulResistBc(
			double contFirstCraneMovInsulResistBc) {
		this.contFirstCraneMovInsulResistBc = contFirstCraneMovInsulResistBc;
	}

	/**
	 * @return the contFirstCraneMovInsulResistCa
	 */
	public double getContFirstCraneMovInsulResistCa() {
		return contFirstCraneMovInsulResistCa;
	}

	/**
	 * @param contFirstCraneMovInsulResistCa the contFirstCraneMovInsulResistCa to set
	 */
	public void setContFirstCraneMovInsulResistCa(
			double contFirstCraneMovInsulResistCa) {
		this.contFirstCraneMovInsulResistCa = contFirstCraneMovInsulResistCa;
	}

	/**
	 * @return the maxContFirstCraneMovInsulResist
	 */
	public double getMaxContFirstCraneMovInsulResist() {
		return maxContFirstCraneMovInsulResist;
	}

	/**
	 * @param maxContFirstCraneMovInsulResist the maxContFirstCraneMovInsulResist to set
	 */
	public void setMaxContFirstCraneMovInsulResist(
			double maxContFirstCraneMovInsulResist) {
		this.maxContFirstCraneMovInsulResist = maxContFirstCraneMovInsulResist;
	}

	/**
	 * @return the contSecondCraneMovInsulResistAo
	 */
	public double getContSecondCraneMovInsulResistAo() {
		return contSecondCraneMovInsulResistAo;
	}

	/**
	 * @param contSecondCraneMovInsulResistAo the contSecondCraneMovInsulResistAo to set
	 */
	public void setContSecondCraneMovInsulResistAo(
			double contSecondCraneMovInsulResistAo) {
		this.contSecondCraneMovInsulResistAo = contSecondCraneMovInsulResistAo;
	}

	/**
	 * @return the contSecondCraneMovInsulResistBo
	 */
	public double getContSecondCraneMovInsulResistBo() {
		return contSecondCraneMovInsulResistBo;
	}

	/**
	 * @param contSecondCraneMovInsulResistBo the contSecondCraneMovInsulResistBo to set
	 */
	public void setContSecondCraneMovInsulResistBo(
			double contSecondCraneMovInsulResistBo) {
		this.contSecondCraneMovInsulResistBo = contSecondCraneMovInsulResistBo;
	}

	/**
	 * @return the contSecondCraneMovInsulResistCo
	 */
	public double getContSecondCraneMovInsulResistCo() {
		return contSecondCraneMovInsulResistCo;
	}

	/**
	 * @param contSecondCraneMovInsulResistCo the contSecondCraneMovInsulResistCo to set
	 */
	public void setContSecondCraneMovInsulResistCo(
			double contSecondCraneMovInsulResistCo) {
		this.contSecondCraneMovInsulResistCo = contSecondCraneMovInsulResistCo;
	}

	/**
	 * @return the contSecondCraneMovInsulResistAb
	 */
	public double getContSecondCraneMovInsulResistAb() {
		return contSecondCraneMovInsulResistAb;
	}

	/**
	 * @param contSecondCraneMovInsulResistAb the contSecondCraneMovInsulResistAb to set
	 */
	public void setContSecondCraneMovInsulResistAb(
			double contSecondCraneMovInsulResistAb) {
		this.contSecondCraneMovInsulResistAb = contSecondCraneMovInsulResistAb;
	}

	/**
	 * @return the contSecondCraneMovInsulResistBc
	 */
	public double getContSecondCraneMovInsulResistBc() {
		return contSecondCraneMovInsulResistBc;
	}

	/**
	 * @param contSecondCraneMovInsulResistBc the contSecondCraneMovInsulResistBc to set
	 */
	public void setContSecondCraneMovInsulResistBc(
			double contSecondCraneMovInsulResistBc) {
		this.contSecondCraneMovInsulResistBc = contSecondCraneMovInsulResistBc;
	}

	/**
	 * @return the contSecondCraneMovInsulResistCa
	 */
	public double getContSecondCraneMovInsulResistCa() {
		return contSecondCraneMovInsulResistCa;
	}

	/**
	 * @param contSecondCraneMovInsulResistCa the contSecondCraneMovInsulResistCa to set
	 */
	public void setContSecondCraneMovInsulResistCa(
			double contSecondCraneMovInsulResistCa) {
		this.contSecondCraneMovInsulResistCa = contSecondCraneMovInsulResistCa;
	}

	/**
	 * @return the maxContSecondCraneMovInsulResist
	 */
	public double getMaxContSecondCraneMovInsulResist() {
		return maxContSecondCraneMovInsulResist;
	}

	/**
	 * @param maxContSecondCraneMovInsulResist the maxContSecondCraneMovInsulResist to set
	 */
	public void setMaxContSecondCraneMovInsulResist(
			double maxContSecondCraneMovInsulResist) {
		this.maxContSecondCraneMovInsulResist = maxContSecondCraneMovInsulResist;
	}

	/**
	 * @return the contCarriageMovInsulResistAo
	 */
	public double getContCarriageMovInsulResistAo() {
		return contCarriageMovInsulResistAo;
	}

	/**
	 * @param contCarriageMovInsulResistAo the contCarriageMovInsulResistAo to set
	 */
	public void setContCarriageMovInsulResistAo(double contCarriageMovInsulResistAo) {
		this.contCarriageMovInsulResistAo = contCarriageMovInsulResistAo;
	}

	/**
	 * @return the contCarriageMovInsulResistBo
	 */
	public double getContCarriageMovInsulResistBo() {
		return contCarriageMovInsulResistBo;
	}

	/**
	 * @param contCarriageMovInsulResistBo the contCarriageMovInsulResistBo to set
	 */
	public void setContCarriageMovInsulResistBo(double contCarriageMovInsulResistBo) {
		this.contCarriageMovInsulResistBo = contCarriageMovInsulResistBo;
	}

	/**
	 * @return the contCarriageMovInsulResistCo
	 */
	public double getContCarriageMovInsulResistCo() {
		return contCarriageMovInsulResistCo;
	}

	/**
	 * @param contCarriageMovInsulResistCo the contCarriageMovInsulResistCo to set
	 */
	public void setContCarriageMovInsulResistCo(double contCarriageMovInsulResistCo) {
		this.contCarriageMovInsulResistCo = contCarriageMovInsulResistCo;
	}

	/**
	 * @return the contCarriageMovInsulResistAb
	 */
	public double getContCarriageMovInsulResistAb() {
		return contCarriageMovInsulResistAb;
	}

	/**
	 * @param contCarriageMovInsulResistAb the contCarriageMovInsulResistAb to set
	 */
	public void setContCarriageMovInsulResistAb(double contCarriageMovInsulResistAb) {
		this.contCarriageMovInsulResistAb = contCarriageMovInsulResistAb;
	}

	/**
	 * @return the contCarriageMovInsulResistBc
	 */
	public double getContCarriageMovInsulResistBc() {
		return contCarriageMovInsulResistBc;
	}

	/**
	 * @param contCarriageMovInsulResistBc the contCarriageMovInsulResistBc to set
	 */
	public void setContCarriageMovInsulResistBc(double contCarriageMovInsulResistBc) {
		this.contCarriageMovInsulResistBc = contCarriageMovInsulResistBc;
	}

	/**
	 * @return the contCarriageMovInsulResistCa
	 */
	public double getContCarriageMovInsulResistCa() {
		return contCarriageMovInsulResistCa;
	}

	/**
	 * @param contCarriageMovInsulResistCa the contCarriageMovInsulResistCa to set
	 */
	public void setContCarriageMovInsulResistCa(double contCarriageMovInsulResistCa) {
		this.contCarriageMovInsulResistCa = contCarriageMovInsulResistCa;
	}

	/**
	 * @return the maxContCarriageMovInsulResist
	 */
	public double getMaxContCarriageMovInsulResist() {
		return maxContCarriageMovInsulResist;
	}

	/**
	 * @param maxContCarriageMovInsulResist the maxContCarriageMovInsulResist to set
	 */
	public void setMaxContCarriageMovInsulResist(
			double maxContCarriageMovInsulResist) {
		this.maxContCarriageMovInsulResist = maxContCarriageMovInsulResist;
	}

	/**
	 * @return the controlCircuitInsulResist
	 */
	public double getControlCircuitInsulResist() {
		return controlCircuitInsulResist;
	}

	/**
	 * @param controlCircuitInsulResist the controlCircuitInsulResist to set
	 */
	public void setControlCircuitInsulResist(double controlCircuitInsulResist) {
		this.controlCircuitInsulResist = controlCircuitInsulResist;
	}

	/**
	 * @return the maxControlCircuitInsulResist
	 */
	public double getMaxControlCircuitInsulResist() {
		return maxControlCircuitInsulResist;
	}

	/**
	 * @param maxControlCircuitInsulResist the maxControlCircuitInsulResist to set
	 */
	public void setMaxControlCircuitInsulResist(double maxControlCircuitInsulResist) {
		this.maxControlCircuitInsulResist = maxControlCircuitInsulResist;
	}

	/**
	 * @return the mainLiftingStator
	 */
	public double getMainLiftingStator() {
		return mainLiftingStator;
	}

	/**
	 * @param mainLiftingStator the mainLiftingStator to set
	 */
	public void setMainLiftingStator(double mainLiftingStator) {
		this.mainLiftingStator = mainLiftingStator;
	}

	/**
	 * @return the maxMainLiftingStator
	 */
	public double getMaxMainLiftingStator() {
		return maxMainLiftingStator;
	}

	/**
	 * @param maxMainLiftingStator the maxMainLiftingStator to set
	 */
	public void setMaxMainLiftingStator(double maxMainLiftingStator) {
		this.maxMainLiftingStator = maxMainLiftingStator;
	}

	/**
	 * @return the mainLiftingRotor
	 */
	public double getMainLiftingRotor() {
		return mainLiftingRotor;
	}

	/**
	 * @param mainLiftingRotor the mainLiftingRotor to set
	 */
	public void setMainLiftingRotor(double mainLiftingRotor) {
		this.mainLiftingRotor = mainLiftingRotor;
	}

	/**
	 * @return the maxMainLiftingRotor
	 */
	public double getMaxMainLiftingRotor() {
		return maxMainLiftingRotor;
	}

	/**
	 * @param maxMainLiftingRotor the maxMainLiftingRotor to set
	 */
	public void setMaxMainLiftingRotor(double maxMainLiftingRotor) {
		this.maxMainLiftingRotor = maxMainLiftingRotor;
	}

	/**
	 * @return the auxLiftingStator
	 */
	public double getAuxLiftingStator() {
		return auxLiftingStator;
	}

	/**
	 * @param auxLiftingStator the auxLiftingStator to set
	 */
	public void setAuxLiftingStator(double auxLiftingStator) {
		this.auxLiftingStator = auxLiftingStator;
	}

	/**
	 * @return the maxAuxLiftingStator
	 */
	public double getMaxAuxLiftingStator() {
		return maxAuxLiftingStator;
	}

	/**
	 * @param maxAuxLiftingStator the maxAuxLiftingStator to set
	 */
	public void setMaxAuxLiftingStator(double maxAuxLiftingStator) {
		this.maxAuxLiftingStator = maxAuxLiftingStator;
	}

	/**
	 * @return the auxLiftingRotor
	 */
	public double getAuxLiftingRotor() {
		return auxLiftingRotor;
	}

	/**
	 * @param auxLiftingRotor the auxLiftingRotor to set
	 */
	public void setAuxLiftingRotor(double auxLiftingRotor) {
		this.auxLiftingRotor = auxLiftingRotor;
	}

	/**
	 * @return the maxAuxLiftingRotor
	 */
	public double getMaxAuxLiftingRotor() {
		return maxAuxLiftingRotor;
	}

	/**
	 * @param maxAuxLiftingRotor the maxAuxLiftingRotor to set
	 */
	public void setMaxAuxLiftingRotor(double maxAuxLiftingRotor) {
		this.maxAuxLiftingRotor = maxAuxLiftingRotor;
	}

	/**
	 * @return the firstCraneMovStator
	 */
	public double getFirstCraneMovStator() {
		return firstCraneMovStator;
	}

	/**
	 * @param firstCraneMovStator the firstCraneMovStator to set
	 */
	public void setFirstCraneMovStator(double firstCraneMovStator) {
		this.firstCraneMovStator = firstCraneMovStator;
	}

	/**
	 * @return the maxFirstCraneMovStator
	 */
	public double getMaxFirstCraneMovStator() {
		return maxFirstCraneMovStator;
	}

	/**
	 * @param maxFirstCraneMovStator the maxFirstCraneMovStator to set
	 */
	public void setMaxFirstCraneMovStator(double maxFirstCraneMovStator) {
		this.maxFirstCraneMovStator = maxFirstCraneMovStator;
	}

	/**
	 * @return the firstCraneMovRotor
	 */
	public double getFirstCraneMovRotor() {
		return firstCraneMovRotor;
	}

	/**
	 * @param firstCraneMovRotor the firstCraneMovRotor to set
	 */
	public void setFirstCraneMovRotor(double firstCraneMovRotor) {
		this.firstCraneMovRotor = firstCraneMovRotor;
	}

	/**
	 * @return the maxFirstCraneMovRotor
	 */
	public double getMaxFirstCraneMovRotor() {
		return maxFirstCraneMovRotor;
	}

	/**
	 * @param maxFirstCraneMovRotor the maxFirstCraneMovRotor to set
	 */
	public void setMaxFirstCraneMovRotor(double maxFirstCraneMovRotor) {
		this.maxFirstCraneMovRotor = maxFirstCraneMovRotor;
	}

	/**
	 * @return the secondCraneMovStator
	 */
	public double getSecondCraneMovStator() {
		return secondCraneMovStator;
	}

	/**
	 * @param secondCraneMovStator the secondCraneMovStator to set
	 */
	public void setSecondCraneMovStator(double secondCraneMovStator) {
		this.secondCraneMovStator = secondCraneMovStator;
	}

	/**
	 * @return the maxSecondCraneMovStator
	 */
	public double getMaxSecondCraneMovStator() {
		return maxSecondCraneMovStator;
	}

	/**
	 * @param maxSecondCraneMovStator the maxSecondCraneMovStator to set
	 */
	public void setMaxSecondCraneMovStator(double maxSecondCraneMovStator) {
		this.maxSecondCraneMovStator = maxSecondCraneMovStator;
	}

	/**
	 * @return the secondCraneMovRotor
	 */
	public double getSecondCraneMovRotor() {
		return secondCraneMovRotor;
	}

	/**
	 * @param secondCraneMovRotor the secondCraneMovRotor to set
	 */
	public void setSecondCraneMovRotor(double secondCraneMovRotor) {
		this.secondCraneMovRotor = secondCraneMovRotor;
	}

	/**
	 * @return the maxSecondCraneMovRotor
	 */
	public double getMaxSecondCraneMovRotor() {
		return maxSecondCraneMovRotor;
	}

	/**
	 * @param maxSecondCraneMovRotor the maxSecondCraneMovRotor to set
	 */
	public void setMaxSecondCraneMovRotor(double maxSecondCraneMovRotor) {
		this.maxSecondCraneMovRotor = maxSecondCraneMovRotor;
	}

	/**
	 * @return the carriageMovStator
	 */
	public double getCarriageMovStator() {
		return carriageMovStator;
	}

	/**
	 * @param carriageMovStator the carriageMovStator to set
	 */
	public void setCarriageMovStator(double carriageMovStator) {
		this.carriageMovStator = carriageMovStator;
	}

	/**
	 * @return the maxCarriageMovStator
	 */
	public double getMaxCarriageMovStator() {
		return maxCarriageMovStator;
	}

	/**
	 * @param maxCarriageMovStator the maxCarriageMovStator to set
	 */
	public void setMaxCarriageMovStator(double maxCarriageMovStator) {
		this.maxCarriageMovStator = maxCarriageMovStator;
	}

	/**
	 * @return the carriageMovRotor
	 */
	public double getCarriageMovRotor() {
		return carriageMovRotor;
	}

	/**
	 * @param carriageMovRotor the carriageMovRotor to set
	 */
	public void setCarriageMovRotor(double carriageMovRotor) {
		this.carriageMovRotor = carriageMovRotor;
	}

	/**
	 * @return the maxCarriageMovRotor
	 */
	public double getMaxCarriageMovRotor() {
		return maxCarriageMovRotor;
	}

	/**
	 * @param maxCarriageMovRotor the maxCarriageMovRotor to set
	 */
	public void setMaxCarriageMovRotor(double maxCarriageMovRotor) {
		this.maxCarriageMovRotor = maxCarriageMovRotor;
	}

	/**
	 * @return the mainLiftingInsulBrake
	 */
	public double getMainLiftingInsulBrake() {
		return mainLiftingInsulBrake;
	}

	/**
	 * @param mainLiftingInsulBrake the mainLiftingInsulBrake to set
	 */
	public void setMainLiftingInsulBrake(double mainLiftingInsulBrake) {
		this.mainLiftingInsulBrake = mainLiftingInsulBrake;
	}

	/**
	 * @return the maxMainLiftingInsulBrake
	 */
	public double getMaxMainLiftingInsulBrake() {
		return maxMainLiftingInsulBrake;
	}

	/**
	 * @param maxMainLiftingInsulBrake the maxMainLiftingInsulBrake to set
	 */
	public void setMaxMainLiftingInsulBrake(double maxMainLiftingInsulBrake) {
		this.maxMainLiftingInsulBrake = maxMainLiftingInsulBrake;
	}

	/**
	 * @return the auxLiftingInsulBrake
	 */
	public double getAuxLiftingInsulBrake() {
		return auxLiftingInsulBrake;
	}

	/**
	 * @param auxLiftingInsulBrake the auxLiftingInsulBrake to set
	 */
	public void setAuxLiftingInsulBrake(double auxLiftingInsulBrake) {
		this.auxLiftingInsulBrake = auxLiftingInsulBrake;
	}

	/**
	 * @return the maxAuxLiftingInsulBrake
	 */
	public double getMaxAuxLiftingInsulBrake() {
		return maxAuxLiftingInsulBrake;
	}

	/**
	 * @param maxAuxLiftingInsulBrake the maxAuxLiftingInsulBrake to set
	 */
	public void setMaxAuxLiftingInsulBrake(double maxAuxLiftingInsulBrake) {
		this.maxAuxLiftingInsulBrake = maxAuxLiftingInsulBrake;
	}

	/**
	 * @return the firstCraneMovInsulBrake
	 */
	public double getFirstCraneMovInsulBrake() {
		return firstCraneMovInsulBrake;
	}

	/**
	 * @param firstCraneMovInsulBrake the firstCraneMovInsulBrake to set
	 */
	public void setFirstCraneMovInsulBrake(double firstCraneMovInsulBrake) {
		this.firstCraneMovInsulBrake = firstCraneMovInsulBrake;
	}

	/**
	 * @return the maxFirstCraneMovInsulBrake
	 */
	public double getMaxFirstCraneMovInsulBrake() {
		return maxFirstCraneMovInsulBrake;
	}

	/**
	 * @param maxFirstCraneMovInsulBrake the maxFirstCraneMovInsulBrake to set
	 */
	public void setMaxFirstCraneMovInsulBrake(double maxFirstCraneMovInsulBrake) {
		this.maxFirstCraneMovInsulBrake = maxFirstCraneMovInsulBrake;
	}

	/**
	 * @return the secondCraneMovInsulBrake
	 */
	public double getSecondCraneMovInsulBrake() {
		return secondCraneMovInsulBrake;
	}

	/**
	 * @param secondCraneMovInsulBrake the secondCraneMovInsulBrake to set
	 */
	public void setSecondCraneMovInsulBrake(double secondCraneMovInsulBrake) {
		this.secondCraneMovInsulBrake = secondCraneMovInsulBrake;
	}

	/**
	 * @return the maxSecondCraneMovInsulBrake
	 */
	public double getMaxSecondCraneMovInsulBrake() {
		return maxSecondCraneMovInsulBrake;
	}

	/**
	 * @param maxSecondCraneMovInsulBrake the maxSecondCraneMovInsulBrake to set
	 */
	public void setMaxSecondCraneMovInsulBrake(double maxSecondCraneMovInsulBrake) {
		this.maxSecondCraneMovInsulBrake = maxSecondCraneMovInsulBrake;
	}

	/**
	 * @return the carriageMovInsulBrake
	 */
	public double getCarriageMovInsulBrake() {
		return carriageMovInsulBrake;
	}

	/**
	 * @param carriageMovInsulBrake the carriageMovInsulBrake to set
	 */
	public void setCarriageMovInsulBrake(double carriageMovInsulBrake) {
		this.carriageMovInsulBrake = carriageMovInsulBrake;
	}

	/**
	 * @return the maxCarriageMovInsulBrake
	 */
	public double getMaxCarriageMovInsulBrake() {
		return maxCarriageMovInsulBrake;
	}

	/**
	 * @param maxCarriageMovInsulBrake the maxCarriageMovInsulBrake to set
	 */
	public void setMaxCarriageMovInsulBrake(double maxCarriageMovInsulBrake) {
		this.maxCarriageMovInsulBrake = maxCarriageMovInsulBrake;
	}

	/**
	 * @return the insulResistInfo
	 */
	public String getInsulResistInfo() {
		return insulResistInfo;
	}

	/**
	 * @param insulResistInfo the insulResistInfo to set
	 */
	public void setInsulResistInfo(String insulResistInfo) {
		this.insulResistInfo = insulResistInfo;
	}

	/**
	 * @return the insulResistMeasuringDevice
	 */
	public String getInsulResistMeasuringDevice() {
		return insulResistMeasuringDevice;
	}

	/**
	 * @param insulResistMeasuringDevice the insulResistMeasuringDevice to set
	 */
	public void setInsulResistMeasuringDevice(String insulResistMeasuringDevice) {
		this.insulResistMeasuringDevice = insulResistMeasuringDevice;
	}

	/**
	 * @return the insulResistExpertInfo
	 */
	public String getInsulResistExpertInfo() {
		return insulResistExpertInfo;
	}

	/**
	 * @param insulResistExpertInfo the insulResistExpertInfo to set
	 */
	public void setInsulResistExpertInfo(String insulResistExpertInfo) {
		this.insulResistExpertInfo = insulResistExpertInfo;
	}
 
	
}
