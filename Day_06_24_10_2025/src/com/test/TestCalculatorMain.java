package com.test;

import java.util.Scanner;

import com.exception.WrongOperatorException;
import com.study.Calculator;

public class TestCalculatorMain {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to calculator\n");
		System.out.println("Enter two numbers and operator to perform calculation.\n");
		
		System.out.println("Enter first number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number : ");
		int num2=sc.nextInt();
		
		System.out.println("Now enter the operator : ");
		String op=sc.next();
		
		int result=0;
		
		try {
			result = Calculator.calculate(num1, num2, op);
		} catch (WrongOperatorException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Result is : "+result);
		
		
	}
}
