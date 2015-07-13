/**
 * IrisDescription.java
 * jCOLIBRI2 framework. 
 * @author Juan A. Recio-Garcнa.
 * GAIA - Group for Artificial Intelligence Applications
 * http://gaia.fdi.ucm.es
 * 03/05/2007
 */
package jcolibri;

import java.util.Date;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class CaseSolution implements CaseComponent {

	private long id_d; 						//поскольку в CBRCase private long id
	
	//<!-- CaseSolution -->
	private String 	result;
	private String 	generalState; 					//Общее состояние
	private int 	eliminatedDefects; 				//К-во дефектов, которые устранили при ЭО
	private int 	needEliminateDefects;				//К-во дефектов, которые нужно устранить до начала эксплуатации
	private boolean staticTestPassed;				//Статическое пройдено?
	private boolean dynamicTestPassed;				//Динамическое пройдено?
	private boolean idleTestPassed;					//На холостом ходу пройдено?
	private Date 	nextInspectionDate;				//Дата следующего обследования
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CaseSolution [id_d=" + id_d + ", result=" + result
				+ ", generalState=" + generalState + ", eliminatedDefects="
				+ eliminatedDefects + ", needEliminateDefects="
				+ needEliminateDefects + ", staticTestPassed="
				+ staticTestPassed + ", dynamicTestPassed=" + dynamicTestPassed
				+ ", idleTestPassed=" + idleTestPassed
				+ ", nextInspectionDate=" + nextInspectionDate + "]";
	}


	public Attribute getIdAttribute() {
		return new Attribute("id_d", this.getClass());
	}

	
	
	/**
	 * @return the id_d
	 */
	public long getId_d() {
		return id_d;
	}



	/**
	 * @param id_d the id_d to set
	 */
	public void setId_d(long id_d) {
		this.id_d = id_d;
	}


	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}


	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}


	/**
	 * @return the generalState
	 */
	public String getGeneralState() {
		return generalState;
	}


	/**
	 * @param generalState the generalState to set
	 */
	public void setGeneralState(String generalState) {
		this.generalState = generalState;
	}


	/**
	 * @return the eliminatedDefects
	 */
	public int getEliminatedDefects() {
		return eliminatedDefects;
	}


	/**
	 * @param eliminatedDefects the eliminatedDefects to set
	 */
	public void setEliminatedDefects(int eliminatedDefects) {
		this.eliminatedDefects = eliminatedDefects;
	}


	/**
	 * @return the needEliminateDefects
	 */
	public int getNeedEliminateDefects() {
		return needEliminateDefects;
	}


	/**
	 * @param needEliminateDefects the needEliminateDefects to set
	 */
	public void setNeedEliminateDefects(int needEliminateDefects) {
		this.needEliminateDefects = needEliminateDefects;
	}


	/**
	 * @return the staticTestPassed
	 */
	public boolean isStaticTestPassed() {
		return staticTestPassed;
	}


	/**
	 * @param staticTestPassed the staticTestPassed to set
	 */
	public void setStaticTestPassed(boolean staticTestPassed) {
		this.staticTestPassed = staticTestPassed;
	}


	/**
	 * @return the dynamicTestPassed
	 */
	public boolean isDynamicTestPassed() {
		return dynamicTestPassed;
	}


	/**
	 * @param dynamicTestPassed the dynamicTestPassed to set
	 */
	public void setDynamicTestPassed(boolean dynamicTestPassed) {
		this.dynamicTestPassed = dynamicTestPassed;
	}


	/**
	 * @return the idleTestPassed
	 */
	public boolean isIdleTestPassed() {
		return idleTestPassed;
	}


	/**
	 * @param idleTestPassed the idleTestPassed to set
	 */
	public void setIdleTestPassed(boolean idleTestPassed) {
		this.idleTestPassed = idleTestPassed;
	}


	/**
	 * @return the nextInspectionDate
	 */
	public Date getNextInspectionDate() {
		return nextInspectionDate;
	}


	/**
	 * @param nextInspectionDate the nextInspectionDate to set
	 */
	public void setNextInspectionDate(Date nextInspectionDate) {
		this.nextInspectionDate = nextInspectionDate;
	}


	
}
