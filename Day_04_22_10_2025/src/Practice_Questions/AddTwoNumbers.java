package Practice_Questions;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to add.");
		System.out.print("Enter first number : ");
		
		double num1 = sc.nextDouble();
		System.out.print("\nEnter second number : ");
		double num2 = sc.nextDouble();
		
		double sum = num1+num2;
		
		System.out.println("Addition of "+num1+" + "+num2+" is : "+sum);

	}

}
