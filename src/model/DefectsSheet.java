package model;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

//Other defects
public class DefectsSheet implements CaseComponent{
		
	private long id; 
	private int deviceCode;				
	private String defectInfo; 			
	private String expertRecommendations; 	
	private String expertInfo;				
	
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
	 * @return the deviceCode
	 */
	public int getDeviceCode() {
		return deviceCode;
	}
	/**
	 * @param deviceCode the deviceCode to set
	 */
	public void setDeviceCode(int deviceCode) {
		this.deviceCode = deviceCode;
	}
	/**
	 * @return the defectInfo
	 */
	public String getDefectInfo() {
		return defectInfo;
	}
	/**
	 * @param defectInfo the defectInfo to set
	 */
	public void setDefectInfo(String defectInfo) {
		this.defectInfo = defectInfo;
	}
	/**
	 * @return the expertRecommendations
	 */
	public String getExpertRecommendations() {
		return expertRecommendations;
	}
	/**
	 * @param expertRecommendations the expertRecommendations to set
	 */
	public void setExpertRecommendations(String expertRecommendations) {
		this.expertRecommendations = expertRecommendations;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefectsSheet [id=" + id + ", deviceCode=" + deviceCode
				+ ", defectInfo=" + defectInfo + ", expertRecommendations="
				+ expertRecommendations + ", expertInfo=" + expertInfo + "]";
	}
	public DefectsSheet() {
		super();
	}

	public DefectsSheet(int deviceCode, String defectInfo,
			String expertRecommendations, String expertInfo) {
		super();
		this.deviceCode = deviceCode;
		this.defectInfo = defectInfo;
		this.expertRecommendations = expertRecommendations;
		this.expertInfo = expertInfo;
	}
	public DefectsSheet(int deviceCode, String defectInfo,
			String expertRecommendations) {
		super();
		this.deviceCode = deviceCode;
		this.defectInfo = defectInfo;
		this.expertRecommendations = expertRecommendations;
	}
	@Override
	public Attribute getIdAttribute() {
		return new Attribute("id", this.getClass());
		
	}
	
}
