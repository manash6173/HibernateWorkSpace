package com.manash.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manash.domain.EmployeeInfo;

public class SaveObjectTest {

	public static void main(String[] args) {
		Configuration cfg =null;
		SessionFactory factory =null;
		Session session = null;
		Transaction txn = null;
		// bootStrap hibernate application
		 cfg = new Configuration();
		// add Hibernate configuration file
		cfg.configure("com/manash/config/hibernate.cfg.xml");
		// build SessionFactory object
		factory = cfg.buildSessionFactory();
		// open HttpSessio
		session = factory.openSession();
		
		// create domain class object
		EmployeeInfo info = new EmployeeInfo();
		// set values into EmployeeInfo object
		info.setEmpNo(1003);
		info.setEname("Smith");
		info.setJob("clerk");
		info.setSalary(50000);
		boolean flag = false;
		try {
			// get transaction object from session
			txn = session.beginTransaction();
			// save object
			session.save(info);
			flag = true;
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} finally {
			if (flag == true) {
				txn.commit();
				System.out.println("Object saved");
			}
			else {
				txn.rollback();
				System.out.println("Object not saved");
			}
			// close session object
			session.close();
			// close factory object
			factory.close();
		} // finally
 	}// main
}// class
