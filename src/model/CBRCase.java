package model;

import java.util.Date;
import java.util.Set;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

/**
 * Bean storing the CBRCase for the Crane diagnosis data base
 * @author Klimchuk S.A.
 * @version 1.0
 */

public class CBRCase implements CaseComponent {

	private long id; 
	// <!-- CaseDescription --> 
	private String 	Comments;
	private String 	agreement;			
	private Date 	inspectionDate; 		
	private String 	craneState; 			
	private int 	railDifference;			
	private String 	inspectionCause;		
	
	//<!-- FK from subordinate tables -->
	private Passport 	Passport; 	
	private Resistance 	Resistance;
	private Visual 		Visual; 
	private Metallware 	Metallware;
	
	//<!-- CaseSolution -->
	private String 	result;						
	private String 	generalState; 					
	private int 	eliminatedDefects; 				//defects number fixed during operational inspection
	private int 	needEliminateDefects;				//defects number should be fixed before operational inspection
	private boolean staticTestPassed;				
	private boolean dynamicTestPassed;				
	private boolean idleTestPassed;					
	private Date 	nextInspectionDate;				
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CBRCase [id=" + id + ", Comments=" + Comments + ", agreement="
				+ agreement + ", inspectionDate=" + inspectionDate
				+ ", craneState=" + craneState + ", railDifference="
				+ railDifference + ", inspectionCause=" + inspectionCause
				+ ", Passport=" + Passport + ", Resistance=" + Resistance
				+ ", Visual=" + Visual + ", Metallware=" + Metallware
				+ ", result=" + result + ", generalState=" + generalState
				+ ", eliminatedDefects=" + eliminatedDefects
				+ ", needEliminateDefects=" + needEliminateDefects
				+ ", staticTestPassed=" + staticTestPassed
				+ ", dynamicTestPassed=" + dynamicTestPassed
				+ ", idleTestPassed=" + idleTestPassed
				+ ", nextInspectionDate=" + nextInspectionDate + "]";
	}

	public CBRCase() {
		super();
	}

	public Attribute getIdAttribute() {
		return new Attribute("id", this.getClass());
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
	 * @return the comments
	 */
	public String getComments() {
		return Comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		Comments = comments;
	}
	
	/**
	 * @return the agreement
	 */
	public String getAgreement() {
		return agreement;
	}

	/**
	 * @param agreement the agreement to set
	 */
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	/**
	 * @return the inspectionDate
	 */
	public Date getInspectionDate() {
		return inspectionDate;
	}

	/**
	 * @param inspectionDate the inspectionDate to set
	 */
	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	/**
	 * @return the craneState
	 */
	public String getCraneState() {
		return craneState;
	}

	/**
	 * @param craneState the craneState to set
	 */
	public void setCraneState(String craneState) {
		this.craneState = craneState;
	}

	/**
	 * @return the railDifference
	 */
	public int getRailDifference() {
		return railDifference;
	}

	/**
	 * @param railDifference the railDifference to set
	 */
	public void setRailDifference(int railDifference) {
		this.railDifference = railDifference;
	}

	/**
	 * @return the inspectionCause
	 */
	public String getInspectionCause() {
		return inspectionCause;
	}

	/**
	 * @param inspectionCause the inspectionCause to set
	 */
	public void setInspectionCause(String inspectionCause) {
		this.inspectionCause = inspectionCause;
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

	/**
	 * @return the visual
	 */
	public Visual getVisual() {
		return Visual;
	}

	/**
	 * @param visual the visual to set
	 */
	public void setVisual(Visual visual) {
		Visual = visual;
	}

	/**
	 * @return the passport
	 */
	public Passport getPassport() {
		return Passport;
	}

	/**
	 * @param passport the passport to set
	 */
	public void setPassport(Passport passport) {
		Passport = passport;
	}

	/**
	 * @return the resistance
	 */
	public Resistance getResistance() {
		return Resistance;
	}

	/**
	 * @param resistance the resistance to set
	 */
	public void setResistance(Resistance resistance) {
		Resistance = resistance;
	}

	/**
	 * @return the metallware
	 */
	public Metallware getMetallware() {
		return Metallware;
	}

	/**
	 * @param metallware the metallware to set
	 */
	public void setMetallware(Metallware metallware) {
		Metallware = metallware;
	}

}
