package config;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;



public class HibernateDao {
	
	public static void saveOrUpdate(SessionFactory sessionFactory, Object obj) {
		Session session = null;
		
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(obj);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.flush(); 
				session.close();				
			}
		}
	
    }
	
	public static void delete(SessionFactory sessionFactory, Object obj) {
		  Session session = null;
		  try {
			  session = sessionFactory.openSession();
			  session.beginTransaction();
			  session.delete(obj);
			  session.getTransaction().commit();
		  } catch (Exception e) {
			  session.getTransaction().rollback();
			  e.printStackTrace();
		  } finally {
			  if (session != null) {
				  session.flush(); 
				  session.close();				
			  }
		  }
	  }
	
	  public static void deleteAll(SessionFactory sessionFactory, Class clazz) {     
		  Session session = null;
		  try {
			  session = sessionFactory.openSession();                  
			  session.beginTransaction();
			  session.createQuery("delete from " + clazz.getName()).executeUpdate();
			  session.getTransaction().commit();      
		  } catch (Exception e) {
			  session.getTransaction().rollback();
			  e.printStackTrace();
		  } finally {
			  if (session != null) {
				  session.flush(); 
				  session.close();				
			  }
		  }
	  } 
	
	public static List findAll(SessionFactory sessionFactory, Class clazz) {
		  Session session = null;
		  List objects = null;

		  try {
			  session = sessionFactory.openSession();	//будем открывать новую сессию вместо getCurrentSession();
			  session.beginTransaction();

			  Query queryResult = session.createQuery("from " + clazz.getName());
			  objects = queryResult.list();
			
			  /*
			  for (int i=0;i<objects.size();i++) {
				  Metallware obj = (Metallware) objects.get(i);
				  System.out.println(obj.toString());
			  }
			  */
			  			  
			  session.getTransaction().commit();
		  } catch (Exception e) {
			  session.getTransaction().rollback();
			  e.printStackTrace(); //if (transaction != null) transaction.rollback();
		  } finally {
			  if (session != null) {
				  session.flush(); 
				  session.close();				
			  }
		  }
		  return objects;
	  }
	
	  public static Object findByPK(SessionFactory sessionFactory, Class clazz, Long id) {
		  Session session = null;
		  Object obj = null;
		  try {
			  session = sessionFactory.openSession();
			  session.beginTransaction();
				  
			  obj = session.load(clazz, id);
			  
			  session.getTransaction().commit();
		  } catch (Exception e) {
			  session.getTransaction().rollback();
			  e.printStackTrace();
		  } finally {
			  if (session != null) {
				  session.flush();
				  /*
				   * Если не закомментировать эту строку - была ошибка при использовании объекта, найденного по первичному ключу:
				   * 1937 [main] ERROR org.hibernate.LazyInitializationException - could not initialize proxy - no Session
				   * Решил проблему так:
				   * http://stackoverflow.com/questions/345705/hibernate-lazyinitializationexception-could-not-initialize-proxy
				   * Я добавил <hibernate-mapping default-lazy="false"> в CBRCase.hbm.xml
				   */
				  session.close();				
			  }
		  }
		  return obj;
	  }
	  
	  public static List findByString(SessionFactory sessionFactory, Class clazz, String str) {                
		  Session session = null;
		  List obj = null;
		  try {
			  session = sessionFactory.openSession();
			  session.beginTransaction();

			  obj = session.createCriteria(clazz)
			  .add( Restrictions.like("comments", "%" + str +  "%") ) //здесь "comments" - поде, в котором будет искаться подстрока
			  .addOrder(Order.asc("id"))                              //сортировка по "id" по возростанию  
			  .list();                                                  

			  session.getTransaction().commit();
		  } catch (Exception e) {
			  session.getTransaction().rollback();
			  e.printStackTrace();
		  } finally {
			  if (session != null) {
				  session.flush(); 
				  session.close();				
			  }
		  }
		  return obj;
	  }
	
	  
	  public static double roundDownScale(double aValue, int Scale)
	  {
	    BigDecimal decimal = new BigDecimal(aValue);
	    decimal = decimal.setScale(Scale,BigDecimal.ROUND_DOWN);
	    double result = decimal.doubleValue();
	    return result;
	  }
	
}
