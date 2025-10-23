package com.employee.dao;

import com.employee.beans.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDaoImpl implements EmployeeDao {
	
	List<Employee> elist = new ArrayList<>();

	@Override
	public boolean save(Employee e) {
		return elist.add(e);
	}

	@Override
	public boolean removeEmployee(int id) {
		
		return elist.remove(new Employee(id));
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return elist;
	}

	@Override
	public List<Employee> sortEmployeesByID() {
		List<Employee> sortedList = new ArrayList<>(elist);
		 sortedList.sort((e1, e2) -> Integer.compare(e1.getEmpId(), e2.getEmpId()));
		return sortedList;
	}

	@Override
	public List<Employee> findEmpByName(String name) {
		List<Employee> temp= elist.stream()
                .filter(emp->emp.getEmpName().equals(name))
                .collect(Collectors.toList());
		return temp;
	}

	@Override
	public boolean writeToFile(String fname) {
		//File f = new File(fname);
		
//		if(f.exists()) {
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))) {
				
				for(Employee e:elist) {
					oos.writeObject(e);
				}
				return true;
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				System.out.println("File not found");
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("error writing file");
			}
			
//		}else {
//			
//		}
		return false;
	}


	

	
	

}
