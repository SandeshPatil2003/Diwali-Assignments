package Practice_Questions;

import java.util.Scanner;

public class ArmstrongChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
		System.out.print("Enter positive number to check if it is armstrong : ");
		num = sc.nextInt();
		if(num < 0) {
			System.out.println("Please enter a positive number (Armstrong numbers cannot be negative).");
		}
		else {
		boolean status = isArmstrong(num);
		if(status) {
			System.out.println(+num+" is Armstrong.");
		}
		else {
			System.out.println(+num+" is not Armstrong.");
		}
		}
		}while(num < 0);
		
		sc.close();

	}

	private static boolean isArmstrong(int num) {
		
		int temp = num;
		int rem = 0;
		int cnt = 0;
		int sum = 0;
		
		while(temp != 0) {
			cnt++;
			temp /= 10;
			rem = temp % 10;
			
		}
		temp = num;
		
		while(temp != 0) {
			rem = temp % 10;
			sum +=power(rem,cnt); 
			temp /= 10;
		}
		
		if(num == sum)
			return true;
		return false;
	}

	private static int power(int rem, int cnt) {
		int power = 1;
		
		for(int i =0;i<cnt;i++) {
			power *= rem;
		}
		return power;
	}

}
