package com.manash.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * This is a utility class to BootStrap the hibernate application and to get session object.
 * @author manash
 * @version 1.0
 *
 */
public class Hibernateutil {
	private static SessionFactory factory=null;
	static {
		try {
		//create configuration class
		Configuration cfg=new Configuration();
		//invoke configure method to pass configure file info
		cfg.configure("com/manash/config/hibernate.cfg.xml");
		//build sessionFactory
		factory=cfg.buildSessionFactory();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to get session object from sessionFactory
	 * 
	 * @return Session
	 * @throws Exception
	 */
	public static Session getSession() throws Exception{
		//open session 
		Session session=null;
		session=factory.openSession();
		//return session object
		return session;
	}
	/**
	 * This Method is used to close session object 
	 * @param ses
	 */
	public static void closeSession(Session ses) {
		//close session object
		ses.close();
	}
	/**
	 * This Method is used to close sessionFactory
	 */
	public static void closeFactory() {
		//close session factory
		factory.close();
	}

}
 