package config;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;

import org.hibernate.SessionFactory;


import model.CBRCase;
import model.Metallware;
import model.Passport;
import model.Resistance;
import model.Visual;

//import jcolibri.cbrcore.CBRCase;
import jcolibri.CaseDescription;
import jcolibri.CaseSolution;
import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.DataBaseConnector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.GlobalSimilarityFunction;
import jcolibri.method.retrieve.NNretrieval.similarity.LocalSimilarityFunction;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.EnumCyclicDistance;
import jcolibri.method.retrieve.NNretrieval.similarity.local.EnumDistance;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold;
import jcolibri.method.retrieve.NNretrieval.similarity.local.ontology.OntCosine;
import jcolibri.method.retrieve.NNretrieval.similarity.local.ontology.OntDeep;
import jcolibri.method.retrieve.NNretrieval.similarity.local.ontology.OntDeepBasic;
import jcolibri.method.retrieve.NNretrieval.similarity.local.ontology.OntDetail;
import jcolibri.method.retrieve.selection.SelectCases;
import jcolibri.test.test4.Region;
import jcolibri.test.test4.TravelDescription;
import jcolibri.test.test4.TravelSolution;

public class JColibriUtil {
	
	Connector   _connector;
	CBRCaseBase _caseBase;
		
	//Инициализация _connector из xml-файла и определение типа базы прецедентов для _caseBase
	public void configure() throws ExecutionException {
		try{
			_connector = new DataBaseConnector();
			_connector.initFromXMLfile(jcolibri.util.FileIO.findFile("jcolibri/databaseconfig.xml"));
			_caseBase  = new LinealCaseBase();
			} catch (Exception e){
				throw new ExecutionException(e);
		}
	}
	//Инициализация базы прецедентов
	public CBRCaseBase preCycle() throws ExecutionException {
		_caseBase.init(_connector);
		return _caseBase;
	}

	public void postCycle() throws ExecutionException {
		_connector.close();
	}

	//******************************************************************************************************************************************************
	//************************************************Выводим ВСЕ прецеденты из базы************************************************************************
	//******************************************************************************************************************************************************

	
	
	//******************************************************************************************************************************************************
	//**************************************Выводим ОТОБРАННЫЕ прецеденты по входным параметрам*************************************************************
	//******************************************************************************************************************************************************
	public Collection<RetrievalResult> getRetrievedCases(int numCases)
			throws ExecutionException, IOException {
		
		configure();
		preCycle(); 
		/********* NumericSim Retrieval **********/
		
		NNConfig simConfig = new NNConfig();
		SimilarityUtil su = new SimilarityUtil();
		simConfig = su.CaseSimilarity();
		
		//Временно query задам вручную: попробую задать универсальный тестовый прецедент:
		SessionFactory sf = HibernateUtil.getSessionFactory();
		CBRCase c = null;
		c = (CBRCase) HibernateDao.findByPK(sf, CBRCase.class, 3L);
				
		
		CaseDescription   cd  = new CaseDescription();
		cd.setComments(c.getComments());
		cd.setAgreement(c.getAgreement());
		cd.setInspectionDate(c.getInspectionDate());
		cd.setCraneState(c.getCraneState());
		cd.setRailDifference(c.getRailDifference());
		cd.setInspectionCause(c.getInspectionCause());
		
		CaseSolution cs = new CaseSolution();
		cs.setResult(c.getResult());
		cs.setGeneralState(c.getGeneralState());
		cs.setEliminatedDefects(c.getEliminatedDefects());
		cs.setNeedEliminateDefects(c.getNeedEliminateDefects());
		cs.setStaticTestPassed(c.isStaticTestPassed());
		cs.setDynamicTestPassed(c.isDynamicTestPassed());
		cs.setIdleTestPassed(c.isIdleTestPassed());
		cs.setNextInspectionDate(c.getNextInspectionDate());
		
		Metallware m = null;
		m = (Metallware) HibernateDao.findByPK(sf, Metallware.class, 3L);
		Passport p = null;
		p = (Passport) HibernateDao.findByPK(sf, Passport.class, 3L);
		Resistance r = null;
		r = (Resistance) HibernateDao.findByPK(sf, Resistance.class, 3L);
		Visual v = null;
		v = (Visual) HibernateDao.findByPK(sf, Visual.class, 3L);
		
		cd.setMetallware(m);
		cd.setPassport(p);
		cd.setResistance(r);
		cd.setVisual(v);
		
		CBRQuery q = new CBRQuery();
		q.setDescription(cd);
		//q.setSolution(cs); - не работает?
		
		/********* Execute NN ************/
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), q, simConfig);
		
		/********* Select cases **********/
		eval = SelectCases.selectTopKRR(eval, numCases); 	 

		postCycle();
		return eval;
	} 
	

	//Функция для округления. Может использоваться для округления Similarity
	//Scale = количество знаков после запятой
	public double setRounding(double aValue, int Scale)
	  {
	    BigDecimal decimal = new BigDecimal(aValue);
	    decimal = decimal.setScale(Scale,BigDecimal.ROUND_DOWN); //ROUND_UP
	    return decimal.doubleValue();
	  }
	
}
