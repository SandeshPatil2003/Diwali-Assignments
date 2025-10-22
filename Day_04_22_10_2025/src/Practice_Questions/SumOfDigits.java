package Practice_Questions;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to find the sum of its digits: ");
		int num = sc.nextInt();
		int sum = 0;
		if(num < 0) {
			int n = Math.abs(num);
			 sum = getSumOfDigits(n);
		}
		else {
		 sum = getSumOfDigits(num);
		}
		System.out.println("The sum of digits of "+num+" is : "+sum);
		sc.close();
		
		

	}

	private static int getSumOfDigits(int num) {
		int sum = 0;
		int rem = 0;
		
		while(num != 0) {
			rem = num % 10;
			sum +=rem;
			num /= 10;
		}
		return sum;
	}

}
