package com.employee.service;

import java.util.List;

import com.employee.beans.Employee;

public interface EmployeeService {

	boolean addEmployee();

	boolean removeEmployee(int id);

	List<Employee> displayAll();

	List<Employee> displayEmployeesSortedById();

	List<Employee>  getEmployeeByName(String name);


	boolean writeToFile(String fname);

}
