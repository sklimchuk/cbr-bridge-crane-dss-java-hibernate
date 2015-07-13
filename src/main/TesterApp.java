package main;

import model.CBRCase;
import model.Metallware;
import model.Passport;
import model.Resistance;
import model.Visual;

import org.hibernate.SessionFactory;

import config.HibernateDao;
import config.HibernateUtil;

public class TesterApp {
	
	public static void main(String[] args){
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		CBRCase c = new CBRCase();
		c.setComments("Create");
		
		Metallware m = null;
		
		m = (Metallware) HibernateDao.findByPK(sf, Metallware.class, Long.valueOf(3));
		m.setId(0);
		HibernateDao.saveOrUpdate(sf, m);
		
		/*
		Metallware m = new Metallware();
		
		//<!-- FK из подчиненных таблиц -->
		int num = 5;
		c.setPassport((Passport) HibernateDao.findByPK(sf, Passport.class, Long.valueOf(num)));
		c.setResistance((Resistance) HibernateDao.findByPK(sf, Resistance.class, Long.valueOf(num)));
		c.setMetallware(m);	//(Metallware) HibernateDao.findByPK(sf, Metallware.class, Long.valueOf(num)));
		c.setVisual((Visual) HibernateDao.findByPK(sf, Visual.class, Long.valueOf(num)));
		
		HibernateDao.saveOrUpdate(sf, c);
		*/
		
	}
	
}
