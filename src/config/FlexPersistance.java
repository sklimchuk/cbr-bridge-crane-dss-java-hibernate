package config;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.hibernate.SessionFactory;

import model.CBRCase;
import model.DefectsSheet;
import model.Metallware;
import model.Passport;
import model.Resistance;
import model.Visual;

public class FlexPersistance {
	
	public Metallware getMetallware(){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Metallware m = new Metallware();
		m = (Metallware) HibernateDao.findByPK(sf, Metallware.class, 31L);
		return m;
	}
	
	public void saveMetallware(Metallware m) throws IOException{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Metallware mw = null;
		HibernateDao.saveOrUpdate(sf, m);
	}
	
	public void updateMetallware(Metallware m, long updNum) throws IOException{
		SessionFactory sf = HibernateUtil.getSessionFactory();
	
		Metallware mw = null;
		long id = 0;
			
		mw = (Metallware) HibernateDao.findByPK(sf, Metallware.class, updNum);
		id = mw.getId();
		mw = m;
		mw.setId(id);
		HibernateDao.saveOrUpdate(sf, mw);

	}
	
	public void saveCBRCase(CBRCase c, Metallware m, Visual v, Passport p, Resistance r) throws IOException{
				
		SessionFactory sf = HibernateUtil.getSessionFactory();
		//CBRCase c = new CBRCase();
		//c.setComments("Create");
		
		//Metallware m = new Metallware();
		
		//<!-- FK из подчиненных таблиц -->
		int num = 5;
		c.setPassport(p);		//(Passport) HibernateDao.findByPK(sf, Passport.class, Long.valueOf(num)));
		c.setResistance(r);		//(Resistance) HibernateDao.findByPK(sf, Resistance.class, Long.valueOf(num)));
		/*
		 * Если я явно не буду устанавливать c.setMetallware и подобные, то будут ошибки типа:
		 * org.hibernate.AssertionFailure : null id in model.CBRCase entry (don't flush the Session after an exception occurs)
		 */
		c.setMetallware(m);	//(Metallware) HibernateDao.findByPK(sf, Metallware.class, Long.valueOf(num)));
		c.setVisual(v);		//(Visual) HibernateDao.findByPK(sf, Visual.class, Long.valueOf(num)));
		
		HibernateDao.saveOrUpdate(sf, c);
	}
		
	public List getAllRecords(int num){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		List objects = null;
		switch(num){
			case 0: objects = HibernateDao.findAll(sf, CBRCase.class);
				break;
			case 1: objects = HibernateDao.findAll(sf, Metallware.class);
				break;
			case 2: objects = HibernateDao.findAll(sf, Passport.class);
				break;
			case 3: objects = HibernateDao.findAll(sf, Resistance.class);
				break;
			case 4: objects = HibernateDao.findAll(sf, Visual.class);
				break;
			case 5: objects = HibernateDao.findAll(sf, DefectsSheet.class);
				break;
				
		}
						
		return objects;
	}
	
}
