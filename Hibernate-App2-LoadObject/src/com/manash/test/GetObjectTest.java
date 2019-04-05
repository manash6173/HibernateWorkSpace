package com.manash.test;

import org.hibernate.Session;

import com.manash.domain.Employee;
import com.manash.utility.Hibernateutil;

public class GetObjectTest {

	public static void main(String[] args) {
		Session session=null;
		try {
		//get session object from Hibernate utility class
	     session=Hibernateutil.getSession();
	     //get employee by id
	     Employee emp=session.get(Employee.class, 107);
	     /*if(emp!=null)
	    	 System.out.println(emp);
	     else
	    	 System.out.println("Record/Object not found");*/
	     
		}//try
		catch(Exception e) {
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
