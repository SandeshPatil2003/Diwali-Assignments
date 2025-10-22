package Practice_Questions;

import java.util.Scanner;

public class GcdAndLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers to calculate their GCD and LCM");
		
		System.out.print("Enter first number :");
		int num1 = sc.nextInt();
		
		System.out.print("\nNow enter the second number :");
		int num2 = sc.nextInt();
		
		int gcd = getGCD(num1,num2);
		int lcm = getLCM(num1,num2,gcd);
		System.out.println("\nThe Greatest Common Divisor of "+num1+" and "+num2+" is : "+gcd);
		System.out.println("The Least Common Multiple of "+num1+" and "+num2+" is : "+lcm);
		
		sc.close();

	}

	private static int getLCM(int num1, int num2, int gcd) {
		
		return (num1 * num2)/gcd;
	}

	private static int getGCD(int num1, int num2) {
		int gcd=0;
		for(int i = 1;i<=num1 && i<=num2; i++) {
			if(num1%i == 0 && num2%i ==0) {
				gcd=i;
			}
		}
		return gcd;
	}

}
