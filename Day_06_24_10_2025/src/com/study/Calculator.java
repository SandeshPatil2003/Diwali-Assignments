package com.study;

import java.util.Set;

import com.exception.WrongOperatorException;

public class Calculator {
	
	public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
		Set<String> validOperators  = Set.of("+", "-", "*", "/", "%");
		
		if(!validOperators.contains(operator))
			throw new WrongOperatorException("Invalid operator");
		
		switch(operator) {
		case "+" -> {
			return number1 + number2;
		}
		case "-" -> {
			return number1 - number2;
		}
		case "*" -> {
			return number1 * number2;
		}
		case "/" -> {
			return number1 / number2;
		}
		case "%" -> {
			return number1 % number2;
		}
		default -> throw new WrongOperatorException("Invalid operator: " + operator);
		}
		//return 0;
		
	}

}
