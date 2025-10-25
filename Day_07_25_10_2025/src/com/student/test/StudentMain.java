package com.student.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.student.beans.Student;
import com.student.exception.LowAttendanceException;
import com.student.service.*;
import com.student.beans.*;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  StudentService service = new StudentServiceImpl();
		  System.out.println("Enter details for 10 students:");

	        for (int i = 1; i <= 10; i++) {
	            System.out.println("\nStudent " + i + ":");
	            System.out.print("Roll No: "); int roll = sc.nextInt(); sc.nextLine();
	            System.out.print("Name: "); String name = sc.nextLine();
	            System.out.print("Course: "); String course = sc.nextLine();
	            System.out.print("Attendance %: "); double attendance = sc.nextDouble();
	            System.out.print("Score: "); double score = sc.nextDouble();

	            Student s = new Student(roll, name, course, attendance, score);

	            try {
	                service.validateAttendance(s);   
	                service.calculateGrade(s);      
	                service.addStudent(s);               
	            } catch (LowAttendanceException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        
	        service.sortByA_P();
	        
	        boolean status = service.writeToFile();
	        
	        if(status) {
	        	System.out.println("Students saved to file successfully.");
	        }
	        else {
	        	System.out.println("Unable to save Students to file.");
	        }
	        
	        
	        List<Student> lst =   service.getStudents() ;
	        
	        System.out.println("\n--- Sorted Student List (By Attendance %) ---");
	        for (Student s : lst) {
	            System.out.println(s);
	        }

	}

}
