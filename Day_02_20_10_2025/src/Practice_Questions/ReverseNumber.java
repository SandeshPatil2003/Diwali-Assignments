package Practice_Questions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number to reverse : ");
		int num = sc.nextInt();

		int revNum = reverseNumber(num);
		
		System.out.println(+num+" reversed is : "+revNum);
		
		sc.close();

	}

	private static int reverseNumber(int num) {
		int rem = 0;
		int rev = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}

}
