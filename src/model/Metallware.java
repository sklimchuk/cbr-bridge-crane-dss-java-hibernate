package model;

import javax.persistence.Entity;
import javax.persistence.Id;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

//@Entity
public class Metallware implements CaseComponent{ 
// All precedent components should implement CaseComponent
	
	//@Id
	private long id; 

	//Leveling the top sheet of the main beams
	private double pointA1; 	//Beam А, point 1
	private double pointA2; 	//Beam А, point 2
	private double pointA3;		//Beam А, point 3
	private double pointB1;		//Beam Б, point 1
	private double pointB2;		//Beam Б, point 2
	private double pointB3;		//Beam Б, point 3
	
	//Ultrasonic thickness control of the end beams
	private double initialThickness; 	//Planted sheet thickness end of the beam
	private double point1; 			//The device readings at point 1 and so on
	private double point2;
	private double point3;
	private double point4;
	private double point5;
	private double point6;
	private double point7;
	private double point8;
	private double point9;
	private double point10;
	private double point11;
	private double point12;
	private double point13;
	private double point14;
	private double point15;
	private double point16;
	private double point17;
	private double point18;
	private double point19;
	private double point20;
	private double point21;
	private double point22;
	private double point23;
	private double point24;
	
	//The deviation of the main elements
	private double progib;
	private double maxProgib;  
	private double iskrivlenie;
	private double maxIskrivlenie;
	private double skruchivanie;
	private double maxSkruchivanie;
	private double vjazkost;
	private double maxVjazkost;

	//Form deviations of the base elements of metalware
	private double nonstraightAxisBeams; 			//Deviation from straightness axis beams	
	private double maxNonstraightnessAxisBeams;
	private double gridSurfaceCurvature;			//The curvature of the grating element
	private double maxGridSurfaceCurvature;
	private double diagCrossSectionDiff; 			//Difference between the cross-sectional diagonals	
	private double maxDiagCrossSectionDiff;
	private double deformations;				//Local deformations	
	private double maxDeformations;
	
	//Visual inspection of main metalware elements
	private double geomMainBeam;				//Geometrical dimensions of the main metalware beams
	private double maxGeomMainBeam;
	private double geomEndGirder;				//Geometrical dimensions of the end metalware beams
	private double maxGeomEndGirder;
	private double geomCarriage;				//Geometrical dimensions of the carriage
	private double maxGeomCarriage;
	private double geomRail;				//Geometrical dimensions of the rail track
	private double maxGeomRail;	
	private double cracks;					//All kinds of cracks
	private double maxCracks;	
	private double metallUndercut;				
	private double maxMetallUndercut;
	private double metallScore;  				
	private double maxMetallScore;
	private double metallExfoliation; 			
	private double maxMetallExfoliation;
	private double corrosion;				
	private double maxCorrosion;
	private double drainPortAbsence; 			
	private double maxDrainPortAbsence;
	private double screwBoltWear; 				
	private double maxScrewBoltWear;
	private double anticorrosiveCoatState;			
	private double maxAnticorrosiveCoatState;
	private double signalColouringAbsence; 			
	private double maxSignalColouringAbsence;
	private double fixPlankAbsence;				
	private double maxFixPlankAbsence;
	
	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
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
	 * @return the pointA1
	 */
	public double getPointA1() {
		return pointA1;
	}
	/**
	 * @param pointA1 the pointA1 to set
	 */
	public void setPointA1(double pointA1) {
		this.pointA1 = pointA1;
	}
	/**
	 * @return the pointA2
	 */
	public double getPointA2() {
		return pointA2;
	}
	/**
	 * @param pointA2 the pointA2 to set
	 */
	public void setPointA2(double pointA2) {
		this.pointA2 = pointA2;
	}
	/**
	 * @return the pointA3
	 */
	public double getPointA3() {
		return pointA3;
	}
	/**
	 * @param pointA3 the pointA3 to set
	 */
	public void setPointA3(double pointA3) {
		this.pointA3 = pointA3;
	}
	/**
	 * @return the pointB1
	 */
	public double getPointB1() {
		return pointB1;
	}
	/**
	 * @param pointB1 the pointB1 to set
	 */
	public void setPointB1(double pointB1) {
		this.pointB1 = pointB1;
	}
	/**
	 * @return the pointB2
	 */
	public double getPointB2() {
		return pointB2;
	}
	/**
	 * @param pointB2 the pointB2 to set
	 */
	public void setPointB2(double pointB2) {
		this.pointB2 = pointB2;
	}
	/**
	 * @return the pointB3
	 */
	public double getPointB3() {
		return pointB3;
	}
	/**
	 * @param pointB3 the pointB3 to set
	 */
	public void setPointB3(double pointB3) {
		this.pointB3 = pointB3;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Metallware [id=" + id + ", pointA1=" + pointA1 + ", pointA2="
				+ pointA2 + ", pointA3=" + pointA3 + ", pointB1=" + pointB1
				+ ", pointB2=" + pointB2 + ", pointB3=" + pointB3
				+ ", initialThickness=" + initialThickness + ", point1="
				+ point1 + ", point2=" + point2 + ", point3=" + point3
				+ ", point4=" + point4 + ", point5=" + point5 + ", point6="
				+ point6 + ", point7=" + point7 + ", point8=" + point8
				+ ", point9=" + point9 + ", point10=" + point10 + ", point11="
				+ point11 + ", point12=" + point12 + ", point13=" + point13
				+ ", point14=" + point14 + ", point15=" + point15
				+ ", point16=" + point16 + ", point17=" + point17
				+ ", point18=" + point18 + ", point19=" + point19
				+ ", point20=" + point20 + ", point21=" + point21
				+ ", point22=" + point22 + ", point23=" + point23
				+ ", point24=" + point24 + ", progib=" + progib
				+ ", maxProgib=" + maxProgib + ", iskrivlenie=" + iskrivlenie
				+ ", maxIskrivlenie=" + maxIskrivlenie + ", skruchivanie="
				+ skruchivanie + ", maxSkruchivanie=" + maxSkruchivanie
				+ ", vjazkost=" + vjazkost + ", maxVjazkost=" + maxVjazkost
				+ ", nonstraightAxisBeams=" + nonstraightAxisBeams
				+ ", maxNonstraightnessAxisBeams="
				+ maxNonstraightnessAxisBeams + ", gridSurfaceCurvature="
				+ gridSurfaceCurvature + ", maxGridSurfaceCurvature="
				+ maxGridSurfaceCurvature + ", diagCrossSectionDiff="
				+ diagCrossSectionDiff + ", maxDiagCrossSectionDiff="
				+ maxDiagCrossSectionDiff + ", deformations=" + deformations
				+ ", maxDeformations=" + maxDeformations + ", geomMainBeam="
				+ geomMainBeam + ", maxGeomMainBeam=" + maxGeomMainBeam
				+ ", geomEndGirder=" + geomEndGirder + ", maxGeomEndGirder="
				+ maxGeomEndGirder + ", geomCarriage=" + geomCarriage
				+ ", maxGeomCarriage=" + maxGeomCarriage + ", geomRail="
				+ geomRail + ", maxGeomRail=" + maxGeomRail + ", cracks="
				+ cracks + ", maxCracks=" + maxCracks + ", metallUndercut="
				+ metallUndercut + ", maxMetallUndercut=" + maxMetallUndercut
				+ ", metallScore=" + metallScore + ", maxMetallScore="
				+ maxMetallScore + ", metallExfoliation=" + metallExfoliation
				+ ", maxMetallExfoliation=" + maxMetallExfoliation
				+ ", corrosion=" + corrosion + ", maxCorrosion=" + maxCorrosion
				+ ", drainPortAbsence=" + drainPortAbsence
				+ ", maxDrainPortAbsence=" + maxDrainPortAbsence
				+ ", screwBoltWear=" + screwBoltWear + ", maxScrewBoltWear="
				+ maxScrewBoltWear + ", anticorrosiveCoatState="
				+ anticorrosiveCoatState + ", maxAnticorrosiveCoatState="
				+ maxAnticorrosiveCoatState + ", signalColouringAbsence="
				+ signalColouringAbsence + ", maxSignalColouringAbsence="
				+ maxSignalColouringAbsence + ", fixPlankAbsence="
				+ fixPlankAbsence + ", maxFixPlankAbsence="
				+ maxFixPlankAbsence + "]";
	}
	public Metallware() {
		super();
	}
	
	/**
	 * @return the initialThickness
	 */
	public double getInitialThickness() {
		return initialThickness;
	}


	/**
	 * @param initialThickness the initialThickness to set
	 */
	public void setInitialThickness(double initialThickness) {
		this.initialThickness = initialThickness;
	}


	/**
	 * @return the point1
	 */
	public double getPoint1() {
		return point1;
	}
	/**
	 * @param point1 the point1 to set
	 */
	public void setPoint1(double point1) {
		this.point1 = point1;
	}
	/**
	 * @return the point2
	 */
	public double getPoint2() {
		return point2;
	}
	/**
	 * @param point2 the point2 to set
	 */
	public void setPoint2(double point2) {
		this.point2 = point2;
	}
	/**
	 * @return the point3
	 */
	public double getPoint3() {
		return point3;
	}
	/**
	 * @param point3 the point3 to set
	 */
	public void setPoint3(double point3) {
		this.point3 = point3;
	}
	/**
	 * @return the point4
	 */
	public double getPoint4() {
		return point4;
	}
	/**
	 * @param point4 the point4 to set
	 */
	public void setPoint4(double point4) {
		this.point4 = point4;
	}
	/**
	 * @return the point5
	 */
	public double getPoint5() {
		return point5;
	}
	/**
	 * @param point5 the point5 to set
	 */
	public void setPoint5(double point5) {
		this.point5 = point5;
	}
	/**
	 * @return the point6
	 */
	public double getPoint6() {
		return point6;
	}
	/**
	 * @param point6 the point6 to set
	 */
	public void setPoint6(double point6) {
		this.point6 = point6;
	}
	/**
	 * @return the point7
	 */
	public double getPoint7() {
		return point7;
	}
	/**
	 * @param point7 the point7 to set
	 */
	public void setPoint7(double point7) {
		this.point7 = point7;
	}
	/**
	 * @return the point8
	 */
	public double getPoint8() {
		return point8;
	}
	/**
	 * @param point8 the point8 to set
	 */
	public void setPoint8(double point8) {
		this.point8 = point8;
	}
	/**
	 * @return the point9
	 */
	public double getPoint9() {
		return point9;
	}
	/**
	 * @param point9 the point9 to set
	 */
	public void setPoint9(double point9) {
		this.point9 = point9;
	}
	/**
	 * @return the point10
	 */
	public double getPoint10() {
		return point10;
	}
	/**
	 * @param point10 the point10 to set
	 */
	public void setPoint10(double point10) {
		this.point10 = point10;
	}
	/**
	 * @return the point11
	 */
	public double getPoint11() {
		return point11;
	}
	/**
	 * @param point11 the point11 to set
	 */
	public void setPoint11(double point11) {
		this.point11 = point11;
	}
	/**
	 * @return the point12
	 */
	public double getPoint12() {
		return point12;
	}
	/**
	 * @param point12 the point12 to set
	 */
	public void setPoint12(double point12) {
		this.point12 = point12;
	}
	/**
	 * @return the point13
	 */
	public double getPoint13() {
		return point13;
	}
	/**
	 * @param point13 the point13 to set
	 */
	public void setPoint13(double point13) {
		this.point13 = point13;
	}
	/**
	 * @return the point14
	 */
	public double getPoint14() {
		return point14;
	}
	/**
	 * @param point14 the point14 to set
	 */
	public void setPoint14(double point14) {
		this.point14 = point14;
	}
	/**
	 * @return the point15
	 */
	public double getPoint15() {
		return point15;
	}
	/**
	 * @param point15 the point15 to set
	 */
	public void setPoint15(double point15) {
		this.point15 = point15;
	}
	/**
	 * @return the point16
	 */
	public double getPoint16() {
		return point16;
	}
	/**
	 * @param point16 the point16 to set
	 */
	public void setPoint16(double point16) {
		this.point16 = point16;
	}
	/**
	 * @return the point17
	 */
	public double getPoint17() {
		return point17;
	}
	/**
	 * @param point17 the point17 to set
	 */
	public void setPoint17(double point17) {
		this.point17 = point17;
	}
	/**
	 * @return the point18
	 */
	public double getPoint18() {
		return point18;
	}
	/**
	 * @param point18 the point18 to set
	 */
	public void setPoint18(double point18) {
		this.point18 = point18;
	}
	/**
	 * @return the point19
	 */
	public double getPoint19() {
		return point19;
	}
	/**
	 * @param point19 the point19 to set
	 */
	public void setPoint19(double point19) {
		this.point19 = point19;
	}
	/**
	 * @return the point20
	 */
	public double getPoint20() {
		return point20;
	}
	/**
	 * @param point20 the point20 to set
	 */
	public void setPoint20(double point20) {
		this.point20 = point20;
	}
	/**
	 * @return the point21
	 */
	public double getPoint21() {
		return point21;
	}
	/**
	 * @param point21 the point21 to set
	 */
	public void setPoint21(double point21) {
		this.point21 = point21;
	}
	/**
	 * @return the point22
	 */
	public double getPoint22() {
		return point22;
	}
	/**
	 * @param point22 the point22 to set
	 */
	public void setPoint22(double point22) {
		this.point22 = point22;
	}
	/**
	 * @return the point23
	 */
	public double getPoint23() {
		return point23;
	}
	/**
	 * @param point23 the point23 to set
	 */
	public void setPoint23(double point23) {
		this.point23 = point23;
	}
	/**
	 * @return the point24
	 */
	public double getPoint24() {
		return point24;
	}
	/**
	 * @param point24 the point24 to set
	 */
	public void setPoint24(double point24) {
		this.point24 = point24;
	}


	/**
	 * @return the progib
	 */
	public double getProgib() {
		return progib;
	}


	/**
	 * @param progib the progib to set
	 */
	public void setProgib(double progib) {
		this.progib = progib;
	}


	/**
	 * @return the maxProgib
	 */
	public double getMaxProgib() {
		return maxProgib;
	}


	/**
	 * @param maxProgib the maxProgib to set
	 */
	public void setMaxProgib(double maxProgib) {
		this.maxProgib = maxProgib;
	}


	/**
	 * @return the iskrivlenie
	 */
	public double getIskrivlenie() {
		return iskrivlenie;
	}


	/**
	 * @param iskrivlenie the iskrivlenie to set
	 */
	public void setIskrivlenie(double iskrivlenie) {
		this.iskrivlenie = iskrivlenie;
	}


	/**
	 * @return the maxIskrivlenie
	 */
	public double getMaxIskrivlenie() {
		return maxIskrivlenie;
	}


	/**
	 * @param maxIskrivlenie the maxIskrivlenie to set
	 */
	public void setMaxIskrivlenie(double maxIskrivlenie) {
		this.maxIskrivlenie = maxIskrivlenie;
	}


	/**
	 * @return the skruchivanie
	 */
	public double getSkruchivanie() {
		return skruchivanie;
	}


	/**
	 * @param skruchivanie the skruchivanie to set
	 */
	public void setSkruchivanie(double skruchivanie) {
		this.skruchivanie = skruchivanie;
	}


	/**
	 * @return the maxSkruchivanie
	 */
	public double getMaxSkruchivanie() {
		return maxSkruchivanie;
	}


	/**
	 * @param maxSkruchivanie the maxSkruchivanie to set
	 */
	public void setMaxSkruchivanie(double maxSkruchivanie) {
		this.maxSkruchivanie = maxSkruchivanie;
	}


	/**
	 * @return the vjazkost
	 */
	public double getVjazkost() {
		return vjazkost;
	}


	/**
	 * @param vjazkost the vjazkost to set
	 */
	public void setVjazkost(double vjazkost) {
		this.vjazkost = vjazkost;
	}


	/**
	 * @return the maxVjazkost
	 */
	public double getMaxVjazkost() {
		return maxVjazkost;
	}


	/**
	 * @param maxVjazkost the maxVjazkost to set
	 */
	public void setMaxVjazkost(double maxVjazkost) {
		this.maxVjazkost = maxVjazkost;
	}


	/**
	 * @return the nonstraightAxisBeams
	 */
	public double getNonstraightAxisBeams() {
		return nonstraightAxisBeams;
	}


	/**
	 * @param nonstraightAxisBeams the nonstraightAxisBeams to set
	 */
	public void setNonstraightAxisBeams(double nonstraightAxisBeams) {
		this.nonstraightAxisBeams = nonstraightAxisBeams;
	}


	/**
	 * @return the maxNonstraightnessAxisBeams
	 */
	public double getMaxNonstraightnessAxisBeams() {
		return maxNonstraightnessAxisBeams;
	}


	/**
	 * @param maxNonstraightnessAxisBeams the maxNonstraightnessAxisBeams to set
	 */
	public void setMaxNonstraightnessAxisBeams(double maxNonstraightnessAxisBeams) {
		this.maxNonstraightnessAxisBeams = maxNonstraightnessAxisBeams;
	}


	/**
	 * @return the gridSurfaceCurvature
	 */
	public double getGridSurfaceCurvature() {
		return gridSurfaceCurvature;
	}


	/**
	 * @param gridSurfaceCurvature the gridSurfaceCurvature to set
	 */
	public void setGridSurfaceCurvature(double gridSurfaceCurvature) {
		this.gridSurfaceCurvature = gridSurfaceCurvature;
	}


	/**
	 * @return the maxGridSurfaceCurvature
	 */
	public double getMaxGridSurfaceCurvature() {
		return maxGridSurfaceCurvature;
	}


	/**
	 * @param maxGridSurfaceCurvature the maxGridSurfaceCurvature to set
	 */
	public void setMaxGridSurfaceCurvature(double maxGridSurfaceCurvature) {
		this.maxGridSurfaceCurvature = maxGridSurfaceCurvature;
	}


	/**
	 * @return the diagCrossSectionDiff
	 */
	public double getDiagCrossSectionDiff() {
		return diagCrossSectionDiff;
	}


	/**
	 * @param diagCrossSectionDiff the diagCrossSectionDiff to set
	 */
	public void setDiagCrossSectionDiff(double diagCrossSectionDiff) {
		this.diagCrossSectionDiff = diagCrossSectionDiff;
	}


	/**
	 * @return the maxDiagCrossSectionDiff
	 */
	public double getMaxDiagCrossSectionDiff() {
		return maxDiagCrossSectionDiff;
	}


	/**
	 * @param maxDiagCrossSectionDiff the maxDiagCrossSectionDiff to set
	 */
	public void setMaxDiagCrossSectionDiff(double maxDiagCrossSectionDiff) {
		this.maxDiagCrossSectionDiff = maxDiagCrossSectionDiff;
	}


	/**
	 * @return the deformations
	 */
	public double getDeformations() {
		return deformations;
	}


	/**
	 * @param deformations the deformations to set
	 */
	public void setDeformations(double deformations) {
		this.deformations = deformations;
	}


	/**
	 * @return the maxDeformations
	 */
	public double getMaxDeformations() {
		return maxDeformations;
	}


	/**
	 * @param maxDeformations the maxDeformations to set
	 */
	public void setMaxDeformations(double maxDeformations) {
		this.maxDeformations = maxDeformations;
	}


	/**
	 * @return the geomMainBeam
	 */
	public double getGeomMainBeam() {
		return geomMainBeam;
	}


	/**
	 * @param geomMainBeam the geomMainBeam to set
	 */
	public void setGeomMainBeam(double geomMainBeam) {
		this.geomMainBeam = geomMainBeam;
	}


	/**
	 * @return the maxGeomMainBeam
	 */
	public double getMaxGeomMainBeam() {
		return maxGeomMainBeam;
	}


	/**
	 * @param maxGeomMainBeam the maxGeomMainBeam to set
	 */
	public void setMaxGeomMainBeam(double maxGeomMainBeam) {
		this.maxGeomMainBeam = maxGeomMainBeam;
	}


	/**
	 * @return the geomEndGirder
	 */
	public double getGeomEndGirder() {
		return geomEndGirder;
	}


	/**
	 * @param geomEndGirder the geomEndGirder to set
	 */
	public void setGeomEndGirder(double geomEndGirder) {
		this.geomEndGirder = geomEndGirder;
	}


	/**
	 * @return the maxGeomEndGirder
	 */
	public double getMaxGeomEndGirder() {
		return maxGeomEndGirder;
	}


	/**
	 * @param maxGeomEndGirder the maxGeomEndGirder to set
	 */
	public void setMaxGeomEndGirder(double maxGeomEndGirder) {
		this.maxGeomEndGirder = maxGeomEndGirder;
	}


	/**
	 * @return the geomCarriage
	 */
	public double getGeomCarriage() {
		return geomCarriage;
	}


	/**
	 * @param geomCarriage the geomCarriage to set
	 */
	public void setGeomCarriage(double geomCarriage) {
		this.geomCarriage = geomCarriage;
	}


	/**
	 * @return the maxGeomCarriage
	 */
	public double getMaxGeomCarriage() {
		return maxGeomCarriage;
	}


	/**
	 * @param maxGeomCarriage the maxGeomCarriage to set
	 */
	public void setMaxGeomCarriage(double maxGeomCarriage) {
		this.maxGeomCarriage = maxGeomCarriage;
	}


	/**
	 * @return the geomRail
	 */
	public double getGeomRail() {
		return geomRail;
	}


	/**
	 * @param geomRail the geomRail to set
	 */
	public void setGeomRail(double geomRail) {
		this.geomRail = geomRail;
	}


	/**
	 * @return the maxGeomRail
	 */
	public double getMaxGeomRail() {
		return maxGeomRail;
	}


	/**
	 * @param maxGeomRail the maxGeomRail to set
	 */
	public void setMaxGeomRail(double maxGeomRail) {
		this.maxGeomRail = maxGeomRail;
	}


	/**
	 * @return the cracks
	 */
	public double getCracks() {
		return cracks;
	}


	/**
	 * @param cracks the cracks to set
	 */
	public void setCracks(double cracks) {
		this.cracks = cracks;
	}


	/**
	 * @return the maxCracks
	 */
	public double getMaxCracks() {
		return maxCracks;
	}


	/**
	 * @param maxCracks the maxCracks to set
	 */
	public void setMaxCracks(double maxCracks) {
		this.maxCracks = maxCracks;
	}


	/**
	 * @return the metallUndercut
	 */
	public double getMetallUndercut() {
		return metallUndercut;
	}


	/**
	 * @param metallUndercut the metallUndercut to set
	 */
	public void setMetallUndercut(double metallUndercut) {
		this.metallUndercut = metallUndercut;
	}


	/**
	 * @return the maxMetallUndercut
	 */
	public double getMaxMetallUndercut() {
		return maxMetallUndercut;
	}


	/**
	 * @param maxMetallUndercut the maxMetallUndercut to set
	 */
	public void setMaxMetallUndercut(double maxMetallUndercut) {
		this.maxMetallUndercut = maxMetallUndercut;
	}


	/**
	 * @return the metallScore
	 */
	public double getMetallScore() {
		return metallScore;
	}


	/**
	 * @param metallScore the metallScore to set
	 */
	public void setMetallScore(double metallScore) {
		this.metallScore = metallScore;
	}


	/**
	 * @return the maxMetallScore
	 */
	public double getMaxMetallScore() {
		return maxMetallScore;
	}


	/**
	 * @param maxMetallScore the maxMetallScore to set
	 */
	public void setMaxMetallScore(double maxMetallScore) {
		this.maxMetallScore = maxMetallScore;
	}


	/**
	 * @return the metallExfoliation
	 */
	public double getMetallExfoliation() {
		return metallExfoliation;
	}


	/**
	 * @param metallExfoliation the metallExfoliation to set
	 */
	public void setMetallExfoliation(double metallExfoliation) {
		this.metallExfoliation = metallExfoliation;
	}


	/**
	 * @return the maxMetallExfoliation
	 */
	public double getMaxMetallExfoliation() {
		return maxMetallExfoliation;
	}


	/**
	 * @param maxMetallExfoliation the maxMetallExfoliation to set
	 */
	public void setMaxMetallExfoliation(double maxMetallExfoliation) {
		this.maxMetallExfoliation = maxMetallExfoliation;
	}


	/**
	 * @return the corrosion
	 */
	public double getCorrosion() {
		return corrosion;
	}


	/**
	 * @param corrosion the corrosion to set
	 */
	public void setCorrosion(double corrosion) {
		this.corrosion = corrosion;
	}


	/**
	 * @return the maxCorrosion
	 */
	public double getMaxCorrosion() {
		return maxCorrosion;
	}


	/**
	 * @param maxCorrosion the maxCorrosion to set
	 */
	public void setMaxCorrosion(double maxCorrosion) {
		this.maxCorrosion = maxCorrosion;
	}


	/**
	 * @return the drainPortAbsence
	 */
	public double getDrainPortAbsence() {
		return drainPortAbsence;
	}


	/**
	 * @param drainPortAbsence the drainPortAbsence to set
	 */
	public void setDrainPortAbsence(double drainPortAbsence) {
		this.drainPortAbsence = drainPortAbsence;
	}


	/**
	 * @return the maxDrainPortAbsence
	 */
	public double getMaxDrainPortAbsence() {
		return maxDrainPortAbsence;
	}


	/**
	 * @param maxDrainPortAbsence the maxDrainPortAbsence to set
	 */
	public void setMaxDrainPortAbsence(double maxDrainPortAbsence) {
		this.maxDrainPortAbsence = maxDrainPortAbsence;
	}


	/**
	 * @return the screwBoltWear
	 */
	public double getScrewBoltWear() {
		return screwBoltWear;
	}


	/**
	 * @param screwBoltWear the screwBoltWear to set
	 */
	public void setScrewBoltWear(double screwBoltWear) {
		this.screwBoltWear = screwBoltWear;
	}


	/**
	 * @return the maxScrewBoltWear
	 */
	public double getMaxScrewBoltWear() {
		return maxScrewBoltWear;
	}


	/**
	 * @param maxScrewBoltWear the maxScrewBoltWear to set
	 */
	public void setMaxScrewBoltWear(double maxScrewBoltWear) {
		this.maxScrewBoltWear = maxScrewBoltWear;
	}


	/**
	 * @return the anticorrosiveCoatState
	 */
	public double getAnticorrosiveCoatState() {
		return anticorrosiveCoatState;
	}


	/**
	 * @param anticorrosiveCoatState the anticorrosiveCoatState to set
	 */
	public void setAnticorrosiveCoatState(double anticorrosiveCoatState) {
		this.anticorrosiveCoatState = anticorrosiveCoatState;
	}


	/**
	 * @return the maxAnticorrosiveCoatState
	 */
	public double getMaxAnticorrosiveCoatState() {
		return maxAnticorrosiveCoatState;
	}


	/**
	 * @param maxAnticorrosiveCoatState the maxAnticorrosiveCoatState to set
	 */
	public void setMaxAnticorrosiveCoatState(double maxAnticorrosiveCoatState) {
		this.maxAnticorrosiveCoatState = maxAnticorrosiveCoatState;
	}


	/**
	 * @return the signalColouringAbsence
	 */
	public double getSignalColouringAbsence() {
		return signalColouringAbsence;
	}


	/**
	 * @param signalColouringAbsence the signalColouringAbsence to set
	 */
	public void setSignalColouringAbsence(double signalColouringAbsence) {
		this.signalColouringAbsence = signalColouringAbsence;
	}


	/**
	 * @return the maxSignalColouringAbsence
	 */
	public double getMaxSignalColouringAbsence() {
		return maxSignalColouringAbsence;
	}


	/**
	 * @param maxSignalColouringAbsence the maxSignalColouringAbsence to set
	 */
	public void setMaxSignalColouringAbsence(double maxSignalColouringAbsence) {
		this.maxSignalColouringAbsence = maxSignalColouringAbsence;
	}


	/**
	 * @return the fixPlankAbsence
	 */
	public double getFixPlankAbsence() {
		return fixPlankAbsence;
	}


	/**
	 * @param fixPlankAbsence the fixPlankAbsence to set
	 */
	public void setFixPlankAbsence(double fixPlankAbsence) {
		this.fixPlankAbsence = fixPlankAbsence;
	}


	/**
	 * @return the maxFixPlankAbsence
	 */
	public double getMaxFixPlankAbsence() {
		return maxFixPlankAbsence;
	}


	/**
	 * @param maxFixPlankAbsence the maxFixPlankAbsence to set
	 */
	public void setMaxFixPlankAbsence(double maxFixPlankAbsence) {
		this.maxFixPlankAbsence = maxFixPlankAbsence;
	}
	
}
