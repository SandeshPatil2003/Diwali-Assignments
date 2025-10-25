package com.student.dao;

import java.util.List;

import com.student.beans.Student;

public interface StudentDao {

	void addStudent(Student s);

	void sortByA_P();

	List<Student> getStudents();

	boolean writeToFile();

}
