package config;

import java.lang.reflect.Field;

import model.Metallware;
import model.Passport;
import model.Resistance;
import model.Visual;
import jcolibri.CaseDescription;
import jcolibri.CaseSolution;
import jcolibri.cbrcore.Attribute;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
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

public class SimilarityUtil {
		
	/*
	 * Пока сделаю метрики подобия только для групп неисправностей, все остальное будет справочными параметрами.
	 * Для Passport - не буду пока включать метрики подобия, т.к. это не диагностические параметры.
	 * DefectsSheet - для отчетов. 
	 */
			
	public NNConfig CaseSimilarity(){
		
		NNConfig simConfig = new NNConfig();
		simConfig.setDescriptionSimFunction(new Average());
		
		CaseDescription caseDesc = new CaseDescription();
		Class clazzDesc = caseDesc.getClass();		//CaseDescription.class; 
		LocalSimilarityFunction lsDesc = null;
		double wDesc = 1;
		
		for(Field field : caseDesc.getClass().getDeclaredFields()) {
                   
			if(field.getType().getName().equals("model.Resistance"))
			{
				Resistance r = new Resistance();
				Class clazzR = r.getClass();	//Resistance.class;
				LocalSimilarityFunction lsR = null;
				double wR = 1;
				Attribute aR = null;
				for(Field fieldR : r.getClass().getDeclaredFields()) 
				{
					aR = new Attribute(fieldR.getName(), clazzR);
					lsR = setLocSimByType(fieldR.getType().getName());
		    		simConfig.addMapping(aR, lsR);
		    		simConfig.setWeight(aR, wR);
					
				}
			}
			if(field.getType().getName().equals("model.Visual"))
			{
				Visual v = new Visual();
				Class clazzV = v.getClass();	//Visual.class;
				LocalSimilarityFunction lsV = null;
				double wV = 1;
				Attribute aV = null;
				for(Field fieldV : v.getClass().getDeclaredFields()) 
				{
					aV = new Attribute(fieldV.getName(), clazzV);
					lsV = setLocSimByType(fieldV.getType().getName());
		    		simConfig.addMapping(aV, lsV);
		    		simConfig.setWeight(aV, wV);
					
				}
			}
			if(field.getType().getName().equals("model.Metallware"))
			{
				Metallware m = new Metallware();
				Class clazzM = m.getClass();	//Metallware.class;
				LocalSimilarityFunction lsM = null;
				double wM = 1;
				Attribute aM = null;
				for(Field fieldM : m.getClass().getDeclaredFields()) 
				{
					aM = new Attribute(fieldM.getName(), clazzM);
					lsM = setLocSimByType(fieldM.getType().getName());
		    		simConfig.addMapping(aM, lsM);
		    		simConfig.setWeight(aM, wM);
					
				}
			}
			else
			{
				//System.out.println("");
				//------------------------------------------Заполняем CaseDescription
				Attribute aDesc = new Attribute(field.getName(), clazzDesc);
				lsDesc = setLocSimByType(field.getType().getName());
	    			simConfig.addMapping(aDesc, lsDesc);
	    			simConfig.setWeight(aDesc, wDesc);
			}
					
    		
		}
		
		
		/*
		//------------------------------------------Заполняем CaseSolution
		CaseSolution caseSol = new CaseSolution();
		Class clazzSol = caseSol.getClass();//CaseDescription.class; 
		LocalSimilarityFunction lsSol = null;
		double wSol = 1;
		
		for(Field fieldSol : caseSol.getClass().getDeclaredFields()) {
			
			//05.02.2011 12:42:03 jcolibri.cbrcore.Attribute <init>
			//SEVERE: java.lang.NoSuchFieldException: id_dAttribute: id_d Class:jcolibri.CaseDescription
			 
			if ((fieldSol.getName() == "id_d") 
					|| (fieldSol.getName() == "result") 
					|| (fieldSol.getName() == "generalState"))
			{
				continue;
			}
			
			Attribute aSol = new Attribute(fieldSol.getName(), clazzDesc);
			lsSol = setLocSimByType(fieldSol.getType().getName());
    		simConfig.addMapping(aSol, lsSol);
    		simConfig.setWeight(aSol, wSol);
		}
		*/
		
		return simConfig;
	}
	
	private LocalSimilarityFunction setLocSimByType(String name){
		
		LocalSimilarityFunction ls = null;
		if(name.equals("java.lang.String"))
		{
			ls = setLocSim("Equal", 0);
			//System.out.println("java.lang.String");
		}	
		else if(name.equals("double"))
		{
			ls = setLocSim("Interval", 300);
		}	
		else if(name.equals("int"))
		{
			ls = setLocSim("Interval", 300);
			//System.out.println("int");
		}	
		else if(name.equals("boolean"))
		{
			ls = setLocSim("Interval", 2);
		}
		else if(name.equals("java.util.Date"))
		{
			//Как сравнивать даты?
		}
		else
		{
			//System.out.println("Simil Function not found");
		}
		
		return ls;
		
	}
	
	
	private LocalSimilarityFunction setLocSim(String name, double param)	//было: int param)
	{
		if(name.equals("Equal"))
			return new Equal();
		else if(name.equals("Interval"))
			return new Interval(param);
		
		else if(name.equals("Threshold"))
			return new Threshold(param);
		else if(name.equals("EnumCyclicDistance"))
			return new EnumCyclicDistance();
		else if(name.equals("EnumDistance"))
			return new EnumDistance();
		else if(name.equals("OntCosine"))
			return new OntCosine();
		else if(name.equals("OntDeep"))
			return new OntDeep();
		else if(name.equals("OntDeepBasic"))
			return new OntDeepBasic();
		else if(name.equals("OntDetail"))
			return new OntDetail();
		else
		{
			System.out.println("Simil Function not found");
			return null;
		}
	}
	
	
}










