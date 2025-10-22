package Practice_Questions;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to print multiplication table : ");
		int num = sc.nextInt();
		
		printMulTable(num);

	}

	private static void printMulTable(int num) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		
	}

}
