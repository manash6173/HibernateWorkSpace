package com.manash.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.hibernate.Session;

import com.manash.domain.Employee;
import com.manash.utility.Hibernateutil;

public class LoadObjectTest {

	public static void main(String[] args) {
		Session session=null;
		try {
		//get session object from Hibernate utility class
	     session=Hibernateutil.getSession();
	     //get employee by id
	     Employee emp=session.load(Employee.class, 10);
	    	//System.out.println(emp);
	     Method method[]=emp.getClass().getDeclaredMethods();
	     for(Method m:method) {
	    	 System.out.println(m.getName());
	     }
	     System.out.println("===============================");
	     Constructor constructors[]=emp.getClass().getDeclaredConstructors();
	     for(Constructor c:constructors) {
	    	 System.out.println(c.getName());
	     }
	     System.out.println("============================");
	     Field fields[]=emp.getClass().getFields();
	     for(Field f:fields) {
	    	 System.out.println(f.toString());
	     }
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
