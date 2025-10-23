package com.employee.service;
import java.util.List;
import java.util.Scanner;

import com.employee.beans.Employee;
import com.employee.dao.*;
public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao edao = new EmployeeDaoImpl();

	@Override
	public boolean addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee id : ");
		int eId = sc.nextInt();	
		
		sc.nextLine();// to consume extra line
		
		System.out.print("Enter Name of employee : ");
		sc.next();
		String eName = sc.nextLine();
		
		sc.nextLine();// to consume extra line
		System.out.print("Enter employee role : ");
		String eRole = sc.nextLine();
		
		Employee e = new Employee(eId,eName,eRole);
		
		return edao.save(e);
	}

	@Override
	public boolean removeEmployee(int id) {
		
		return edao.removeEmployee(id);
	}

	@Override
	public List<Employee> displayAll() {
		return edao.getAllEmployees();
		
		
	}

	@Override
	public List<Employee> displayEmployeesSortedById() {
		return edao.sortEmployeesByID();
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		return edao.findEmpByName(name);
	}

	@Override
	public boolean writeToFile(String fname) {
		
		return edao.writeToFile(fname);
	}



}
