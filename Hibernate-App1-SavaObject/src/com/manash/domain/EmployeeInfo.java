package com.manash.domain;

import java.io.Serializable;

public class EmployeeInfo implements Serializable{
	private int empNo;
	private String ename;
	private String job;
	private float salary;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", salary=" + salary + "]";
	}

}
