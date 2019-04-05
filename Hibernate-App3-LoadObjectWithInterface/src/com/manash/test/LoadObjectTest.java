package com.manash.test;



import org.hibernate.Session;

import com.manash.domain.Employee;
import com.manash.domain.IEmployee;
import com.manash.utility.Hibernateutil;

public class LoadObjectTest {

	public static void main(String[] args) {
		Session session=null;
		try {
		//get session object from Hibernate utility class
	     session=Hibernateutil.getSession();
	     //get employee by id
	     IEmployee emp=session.load(Employee.class, 107);
	    	System.out.println(emp);
	    
		}//try
		catch(Exception e) {
			System.out.println("Record/Object not found");
			e.printStackTrace();
		}
		finally {
			//close session object
			Hibernateutil.closeSession(session);
			//close sessionFactory object
			Hibernateutil.closeFactory();
		}//finally
	}//main
}//class
