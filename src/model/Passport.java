package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jcolibri.cbrcore.Attribute;

//@Entity
public class Passport implements jcolibri.cbrcore.CaseComponent{
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 

	//Crane passport data
	private double hoistingCapacityMain; 		//Г/п, т  Мех-ма гл. подъема
	private double hoistingCapacityAux; 		//Г/п, т Мех-ма вспом. подъема
	private String classGroup;			//Группа классиф.
	private double hoistingHeight; 			//Высота подъема, м
	private double width;	 			//Пролет, м
	private double base; 				//База, м
	private double loadLiftingSpeed;		//Скорость, м/мин  Подъема груза
	private double crabLiftingSpeed;		//Скорость, м/мин	Передв. тележки		
	private double craneLiftingSpeed;		//Скорость, м/мин	Передв. крана
	private double wheelLoad;			//Нагрузка на колеса, т
	private double craneMass;			//Масса крана, т
	private double airTemperatureMax;		//Темпер. окр. среды, С	Наиб.
	private double airTemperatureMin;		//Темпер. окр. среды, С	Наим.
	private String mainBeamMaterial;		//Сведения о материалах, из котор. главные балки	[Марка: Ст3, ГОСТ: 350-500]
	private String endGirderMaterial;		//Сведения о материалах, из котор. концевые балки	[Марка: Ст3, ГОСТ: 350-500]
	private String bogieFrameMaterial;		//Сведения о материалах, из котор. рама тележки	[Марка: Ст3, ГОСТ: 350-500]  
	
	//Crane main info
	private String type;				//Тип	Мост. электр.
	private String model; 				//Модель
	private String maker; 				//Завод-изгот.
	private Date   dueDate;				//Дата изгот.
	private String makerNumber;			//Завод. №
	private String regNumber;			//Регистрац. №
	private Date   startDate;			//Дата ввода в эксплуат.
	private String purpose; 			//Назначение	Монтаж и демонтаж под. машин	ПТР
	private String locality; 			//Местонах. крана
	private String installObject;			//Объект установки крана
	private int    inspectionsAmount;		//К-во предыд. обследований
	
	//Характер работы+расчет фактич. РР
	private int 	totalWorkTime;			//Общее время работы с начала эксплуатации, лет
	private int 	lifeTime;	 		//Установленный срок службы крана, лет
	private int 	hoistingCapacity;		//Паспортная г/п крана, т
	private int 	cargoPerDay; 			//К-во переваливаемого за сутки груза, т
	private String 	workInfo;			//Краткое описание работ, строка
	private int 	cycleQuantity;			//Суммарное к-во циклов работы в сутки, число
	private String 	operationModeGroup;		//Фактич. группа РР, рассчитывается по формуле
	private int 	workTemperaturePassport;	//Темпер. условия работы	Паспортные, градусы
	private int 	workTemperatureCurrent;		//Темпер. условия работы	Фактические, градусы
	private String 	environmentInfo;		//Х-ка среды, в котор. работ. кран	Нормальная
	private String 	placementLocation;		//Место установки крана:	На открытом воздухе	Под навесом	Отапливаемое помещ.	Неотапливаемое помещ.
	private String 	expertInfo;			//Данные о специалисте
	
	
	/*
	 * Х-ка суточного использования крана, таблица
		Масса груза, т
		К-во циклов, число
		Примечания, строка
	 *	 
	 */
	
	public Passport() {
		super();
	}

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Passport [id=" + id + ", hoistingCapacityMain="
				+ hoistingCapacityMain + ", hoistingCapacityAux="
				+ hoistingCapacityAux + ", classGroup=" + classGroup
				+ ", hoistingHeight=" + hoistingHeight + ", width=" + width
				+ ", base=" + base + ", loadLiftingSpeed=" + loadLiftingSpeed
				+ ", crabLiftingSpeed=" + crabLiftingSpeed
				+ ", craneLiftingSpeed=" + craneLiftingSpeed + ", wheelLoad="
				+ wheelLoad + ", craneMass=" + craneMass
				+ ", airTemperatureMax=" + airTemperatureMax
				+ ", airTemperatureMin=" + airTemperatureMin
				+ ", mainBeamMaterial=" + mainBeamMaterial
				+ ", endGirderMaterial=" + endGirderMaterial
				+ ", bogieFrameMaterial=" + bogieFrameMaterial + ", type="
				+ type + ", model=" + model + ", maker=" + maker + ", dueDate="
				+ dueDate + ", makerNumber=" + makerNumber + ", regNumber="
				+ regNumber + ", startDate=" + startDate + ", purpose="
				+ purpose + ", locality=" + locality + ", installObject="
				+ installObject + ", inspectionsAmount=" + inspectionsAmount
				+ ", totalWorkTime=" + totalWorkTime + ", lifeTime=" + lifeTime
				+ ", hoistingCapacity=" + hoistingCapacity + ", cargoPerDay="
				+ cargoPerDay + ", workInfo=" + workInfo + ", cycleQuantity="
				+ cycleQuantity + ", operationModeGroup=" + operationModeGroup
				+ ", workTemperaturePassport=" + workTemperaturePassport
				+ ", workTemperatureCurrent=" + workTemperatureCurrent
				+ ", environmentInfo=" + environmentInfo
				+ ", placementLocation=" + placementLocation + ", expertInfo="
				+ expertInfo + "]";
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
	 * @return the hoistingCapacityMain
	 */
	public double getHoistingCapacityMain() {
		return hoistingCapacityMain;
	}

	/**
	 * @param hoistingCapacityMain the hoistingCapacityMain to set
	 */
	public void setHoistingCapacityMain(double hoistingCapacityMain) {
		this.hoistingCapacityMain = hoistingCapacityMain;
	}

	/**
	 * @return the hoistingCapacityAux
	 */
	public double getHoistingCapacityAux() {
		return hoistingCapacityAux;
	}

	/**
	 * @param hoistingCapacityAux the hoistingCapacityAux to set
	 */
	public void setHoistingCapacityAux(double hoistingCapacityAux) {
		this.hoistingCapacityAux = hoistingCapacityAux;
	}

	/**
	 * @return the classGroup
	 */
	public String getClassGroup() {
		return classGroup;
	}

	/**
	 * @param classGroup the classGroup to set
	 */
	public void setClassGroup(String classGroup) {
		this.classGroup = classGroup;
	}

	/**
	 * @return the hoistingHeight
	 */
	public double getHoistingHeight() {
		return hoistingHeight;
	}

	/**
	 * @param hoistingHeight the hoistingHeight to set
	 */
	public void setHoistingHeight(double hoistingHeight) {
		this.hoistingHeight = hoistingHeight;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the loadLiftingSpeed
	 */
	public double getLoadLiftingSpeed() {
		return loadLiftingSpeed;
	}

	/**
	 * @param loadLiftingSpeed the loadLiftingSpeed to set
	 */
	public void setLoadLiftingSpeed(double loadLiftingSpeed) {
		this.loadLiftingSpeed = loadLiftingSpeed;
	}

	/**
	 * @return the crabLiftingSpeed
	 */
	public double getCrabLiftingSpeed() {
		return crabLiftingSpeed;
	}

	/**
	 * @param crabLiftingSpeed the crabLiftingSpeed to set
	 */
	public void setCrabLiftingSpeed(double crabLiftingSpeed) {
		this.crabLiftingSpeed = crabLiftingSpeed;
	}

	/**
	 * @return the craneLiftingSpeed
	 */
	public double getCraneLiftingSpeed() {
		return craneLiftingSpeed;
	}

	/**
	 * @param craneLiftingSpeed the craneLiftingSpeed to set
	 */
	public void setCraneLiftingSpeed(double craneLiftingSpeed) {
		this.craneLiftingSpeed = craneLiftingSpeed;
	}

	/**
	 * @return the wheelLoad
	 */
	public double getWheelLoad() {
		return wheelLoad;
	}

	/**
	 * @param wheelLoad the wheelLoad to set
	 */
	public void setWheelLoad(double wheelLoad) {
		this.wheelLoad = wheelLoad;
	}

	/**
	 * @return the craneMass
	 */
	public double getCraneMass() {
		return craneMass;
	}

	/**
	 * @param craneMass the craneMass to set
	 */
	public void setCraneMass(double craneMass) {
		this.craneMass = craneMass;
	}

	/**
	 * @return the airTemperatureMax
	 */
	public double getAirTemperatureMax() {
		return airTemperatureMax;
	}

	/**
	 * @param airTemperatureMax the airTemperatureMax to set
	 */
	public void setAirTemperatureMax(double airTemperatureMax) {
		this.airTemperatureMax = airTemperatureMax;
	}

	/**
	 * @return the airTemperatureMin
	 */
	public double getAirTemperatureMin() {
		return airTemperatureMin;
	}

	/**
	 * @param airTemperatureMin the airTemperatureMin to set
	 */
	public void setAirTemperatureMin(double airTemperatureMin) {
		this.airTemperatureMin = airTemperatureMin;
	}

	/**
	 * @return the mainBeamMaterial
	 */
	public String getMainBeamMaterial() {
		return mainBeamMaterial;
	}

	/**
	 * @param mainBeamMaterial the mainBeamMaterial to set
	 */
	public void setMainBeamMaterial(String mainBeamMaterial) {
		this.mainBeamMaterial = mainBeamMaterial;
	}

	/**
	 * @return the endGirderMaterial
	 */
	public String getEndGirderMaterial() {
		return endGirderMaterial;
	}

	/**
	 * @param endGirderMaterial the endGirderMaterial to set
	 */
	public void setEndGirderMaterial(String endGirderMaterial) {
		this.endGirderMaterial = endGirderMaterial;
	}

	/**
	 * @return the bogieFrameMaterial
	 */
	public String getBogieFrameMaterial() {
		return bogieFrameMaterial;
	}

	/**
	 * @param bogieFrameMaterial the bogieFrameMaterial to set
	 */
	public void setBogieFrameMaterial(String bogieFrameMaterial) {
		this.bogieFrameMaterial = bogieFrameMaterial;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * @param maker the maker to set
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the makerNumber
	 */
	public String getMakerNumber() {
		return makerNumber;
	}

	/**
	 * @param makerNumber the makerNumber to set
	 */
	public void setMakerNumber(String makerNumber) {
		this.makerNumber = makerNumber;
	}

	/**
	 * @return the regNumber
	 */
	public String getRegNumber() {
		return regNumber;
	}

	/**
	 * @param regNumber the regNumber to set
	 */
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the purpose
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * @param locality the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * @return the installObject
	 */
	public String getInstallObject() {
		return installObject;
	}

	/**
	 * @param installObject the installObject to set
	 */
	public void setInstallObject(String installObject) {
		this.installObject = installObject;
	}

	/**
	 * @return the inspectionsAmount
	 */
	public int getInspectionsAmount() {
		return inspectionsAmount;
	}

	/**
	 * @param inspectionsAmount the inspectionsAmount to set
	 */
	public void setInspectionsAmount(int inspectionsAmount) {
		this.inspectionsAmount = inspectionsAmount;
	}

	/**
	 * @return the totalWorkTime
	 */
	public int getTotalWorkTime() {
		return totalWorkTime;
	}

	/**
	 * @param totalWorkTime the totalWorkTime to set
	 */
	public void setTotalWorkTime(int totalWorkTime) {
		this.totalWorkTime = totalWorkTime;
	}

	/**
	 * @return the lifeTime
	 */
	public int getLifeTime() {
		return lifeTime;
	}

	/**
	 * @param lifeTime the lifeTime to set
	 */
	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}

	/**
	 * @return the hoistingCapacity
	 */
	public int getHoistingCapacity() {
		return hoistingCapacity;
	}

	/**
	 * @param hoistingCapacity the hoistingCapacity to set
	 */
	public void setHoistingCapacity(int hoistingCapacity) {
		this.hoistingCapacity = hoistingCapacity;
	}

	/**
	 * @return the cargoPerDay
	 */
	public int getCargoPerDay() {
		return cargoPerDay;
	}

	/**
	 * @param cargoPerDay the cargoPerDay to set
	 */
	public void setCargoPerDay(int cargoPerDay) {
		this.cargoPerDay = cargoPerDay;
	}

	/**
	 * @return the workInfo
	 */
	public String getWorkInfo() {
		return workInfo;
	}

	/**
	 * @param workInfo the workInfo to set
	 */
	public void setWorkInfo(String workInfo) {
		this.workInfo = workInfo;
	}

	/**
	 * @return the cycleQuantity
	 */
	public int getCycleQuantity() {
		return cycleQuantity;
	}

	/**
	 * @param cycleQuantity the cycleQuantity to set
	 */
	public void setCycleQuantity(int cycleQuantity) {
		this.cycleQuantity = cycleQuantity;
	}

	/**
	 * @return the operationModeGroup
	 */
	public String getOperationModeGroup() {
		return operationModeGroup;
	}

	/**
	 * @param operationModeGroup the operationModeGroup to set
	 */
	public void setOperationModeGroup(String operationModeGroup) {
		this.operationModeGroup = operationModeGroup;
	}

	/**
	 * @return the workTemperaturePassport
	 */
	public int getWorkTemperaturePassport() {
		return workTemperaturePassport;
	}

	/**
	 * @param workTemperaturePassport the workTemperaturePassport to set
	 */
	public void setWorkTemperaturePassport(int workTemperaturePassport) {
		this.workTemperaturePassport = workTemperaturePassport;
	}

	/**
	 * @return the workTemperatureCurrent
	 */
	public int getWorkTemperatureCurrent() {
		return workTemperatureCurrent;
	}

	/**
	 * @param workTemperatureCurrent the workTemperatureCurrent to set
	 */
	public void setWorkTemperatureCurrent(int workTemperatureCurrent) {
		this.workTemperatureCurrent = workTemperatureCurrent;
	}

	/**
	 * @return the environmentInfo
	 */
	public String getEnvironmentInfo() {
		return environmentInfo;
	}

	/**
	 * @param environmentInfo the environmentInfo to set
	 */
	public void setEnvironmentInfo(String environmentInfo) {
		this.environmentInfo = environmentInfo;
	}

	/**
	 * @return the placementLocation
	 */
	public String getPlacementLocation() {
		return placementLocation;
	}

	/**
	 * @param placementLocation the placementLocation to set
	 */
	public void setPlacementLocation(String placementLocation) {
		this.placementLocation = placementLocation;
	}

	/**
	 * @return the expertInfo
	 */
	public String getExpertInfo() {
		return expertInfo;
	}

	/**
	 * @param expertInfo the expertInfo to set
	 */
	public void setExpertInfo(String expertInfo) {
		this.expertInfo = expertInfo;
	}





	 
	
}
