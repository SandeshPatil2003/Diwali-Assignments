package com.student.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.student.beans.Student;

public class StudentDaoImpl implements StudentDao {
	List<Student> slist = new ArrayList<>();
	
	@Override
	public void addStudent(Student s) {
		slist.add(s);
		
		
	}

	@Override
	public void sortByA_P() {
		// TODO Auto-generated method stub
		Collections.sort(slist);
		
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return slist;
	}

	@Override
	public boolean writeToFile() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student_data.txt"))){
			oos.writeObject(slist);
			return true;
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
