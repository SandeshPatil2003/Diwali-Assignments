package com.employee.test;

import com.employee.service.*;
import com.employee.beans.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		
		int choice = 0;
		
		
		do{
			System.out.println("Welcome to Employee menu.");
			System.out.println("1. Add Employee to list\n2. Remove Employee list\n3. Show all Employee\n"
					+ "4. Show all Employee in sorted order (sort on the basis of empID)\n"
					+ "5. Find a Employee with empName\n"
					+ "6. Save all Employees into file\n"
					+ "7. Quit");
			
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1->{
				boolean status = eservice.addEmployee();
				if(status) {
					System.out.println("Employee added successfully.");
				}else {
					System.out.println("Failed to add employee.");
				}
			}
			case 2 -> {
				
				System.out.print("Enter the ID of the employee you want to remove: ");
				int id = sc.nextInt();
				boolean status = eservice.removeEmployee(id);
				if(status) {
					System.out.println("Employee remove successfully.");
				}else {
					System.out.println("Employee not found.");
				}
				
			}
			case 3 -> {
				List<Employee> list = eservice.displayAll();
				
				if(list.size()>0) {
					list.forEach(System.out::println);
				}
				else {
					System.out.println("Employee data not found");
				}
			}
			case 4 -> {
				
				List<Employee> list = eservice.displayEmployeesSortedById();
				
				if(list.size()>0) {
					list.forEach(System.out::println);
				}
				else {
					System.out.println("Employee data not found");
				}
				
			}
			case 5 -> {
				System.out.print("Enter name of employee to search : ");
				sc.nextLine();
				String name = sc.nextLine();
				List<Employee> lst = eservice.getEmployeeByName(name);
				if(lst.size()>0) {
					lst.forEach(System.out::println);
				}
				else {
					System.out.println("Employee data not found");
				}
				
			}
			case 6 -> {
				boolean status = eservice.writeToFile("emp_data.txt");
				if(status) {
					System.out.println("Data saved to file successfully!.");
				}else {
					System.out.println("unable to save data to file.");
				}

			}
			case 7 -> {
				System.out.println("Thanks for visiting!");
				sc.close();

			}
			}
			
			
		}while(choice != 7);

	}

}
