package com.employee.dao;

import java.util.List;

import com.employee.beans.Employee;

public interface EmployeeDao {


	boolean save(Employee e);

	boolean removeEmployee(int id);

	List<Employee> getAllEmployees();

	List<Employee> sortEmployeesByID();

	List<Employee> findEmpByName(String name);

	boolean writeToFile(String fname);



}
