package com.manash.domain;

import java.io.Serializable;

/**
 * This is the hibernate domain class 
 * @author manash
 *@version 1.0
 *
 */
public class Employee implements Serializable {
	
	private int empno;
	private String ename;
	private String job;
	private int sal;
	
	public Employee() {
		System.out.println("Employee:0-param constructor");
	}	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}

}
