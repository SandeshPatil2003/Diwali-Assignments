package com.employee.beans;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
	
	private int empId;
	private String empName;
	private String empRole;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = "Developer";
	}
	
	
	public Employee(int empId, String empName, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
	}
	
	public Employee(int id) {
		 this.empId = id;
	}

	@Override
	public int hashCode() {
		return empId;
	}
	@Override
	public boolean equals(Object obj) {

		Employee ob = (Employee) obj;
		return empId == ob.empId;
	}
	
	
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
	}

}
