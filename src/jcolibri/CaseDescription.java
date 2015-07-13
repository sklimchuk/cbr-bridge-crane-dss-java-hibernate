
package jcolibri;

import java.util.Date;

import model.*;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class CaseDescription implements CaseComponent {

	private long id; 
	// <!-- CaseDescription -->
	private String 	Comments;
	private String 	agreement;			//№ договора
	private Date 	inspectionDate; 		//Дата обследования
	private String 	craneState; 			//Состояние крана при обследовании
	private int 	railDifference;			//Разность отметок крановых рельсов в месте проведения обследования
	private String 	inspectionCause;		//Причина проведения обследования
	
	//<!-- FK из подчиненных таблиц --
	private Passport 	Passport;
	private Resistance 	Resistance;
	private Visual 		Visual; 
	private Metallware 	Metallware;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CaseDescription [id=" + id + ", Comments=" + Comments
				+ ", agreement=" + agreement + ", inspectionDate="
				+ inspectionDate + ", craneState=" + craneState
				+ ", railDifference=" + railDifference + ", inspectionCause="
				+ inspectionCause + ", Passport=" + Passport + ", Resistance="
				+ Resistance + ", Visual=" + Visual + ", Metallware="
				+ Metallware + "]";
	}

	public CaseDescription() {
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
