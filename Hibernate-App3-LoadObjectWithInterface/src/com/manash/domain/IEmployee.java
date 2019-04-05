package com.manash.domain;

import java.io.Serializable;

public interface IEmployee extends Serializable {
	public int getEmpno();

	public void setEmpno(int empno);

	public String getEname();

	public void setEname(String ename);

	public String getJob();

	public void setJob(String job);

	public int getSal();

	public void setSal(int sal);

}
