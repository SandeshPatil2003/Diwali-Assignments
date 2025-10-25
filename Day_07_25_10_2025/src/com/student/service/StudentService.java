package com.student.service;

import java.util.List;

import com.student.beans.Student;
import com.student.exception.LowAttendanceException;

public interface StudentService {

	void validateAttendance(Student s) throws LowAttendanceException;

	void calculateGrade(Student s);

	void addStudent(Student s);

	void sortByA_P();

	List<Student> getStudents();

	boolean writeToFile();

}
