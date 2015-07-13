package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

      private static final SessionFactory sessionFactory;
      
      static {
          try {
              	  // Create the SessionFactory from hibernate.cfg.xml
            
        	  //Было до применения аннотаций так
        	   sessionFactory = new Configuration().configure().buildSessionFactory();
              
        	  //Для использования аннотация и XML-маппинга одновременно 
        	  //хотя с Configuration().configure().buildSessionFactory(); аннотации тоже работали!!! на Resistance.java
        	  //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
          
                      	  
          } catch (Throwable ex) {
              // Make sure you log the exception, as it might be swallowed
              System.err.println("Initial SessionFactory creation failed." + ex);
              throw new ExceptionInInitializerError(ex);
          }
      }

      public static SessionFactory getSessionFactory() {
          return sessionFactory;
      }
      
}


