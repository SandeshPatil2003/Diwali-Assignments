package com.student.service;

import java.util.List;

import com.student.beans.Student;
import com.student.dao.*;
import com.student.exception.LowAttendanceException;

public class StudentServiceImpl implements StudentService{
	
	StudentDao sdao = new StudentDaoImpl();

	@Override
	public void validateAttendance(Student s) throws LowAttendanceException {
		  if (s.getAttendance_percentage() < 60) {
		        throw new LowAttendanceException(
		            "Attendance below 60% for student: " + s.getSname()
		        );
		    }
		
	}

	@Override
	public void calculateGrade(Student s) {
		 double score = s.getScore();
	        if (score >= 90) s.setGrade(null);
	        else if (score >= 75) s.setGrade("B");
	        else if (score >= 60) s.setGrade("C");
	        else s.setGrade("D");
		
	}

	@Override
	public void addStudent(Student s) {
		sdao.addStudent(s);
		
	}

	@Override
	public void sortByA_P() {
		sdao.sortByA_P();
		
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return sdao.getStudents();
	}

	@Override
	public boolean writeToFile() {
		// TODO Auto-generated method stub
		return sdao.writeToFile();
	}

}
