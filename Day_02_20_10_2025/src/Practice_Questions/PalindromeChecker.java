package Practice_Questions;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number to check if it is palindrome : ");
		int num = sc.nextInt();

		boolean status = isPalindrome(num);

		if (status) {
			System.out.println(+num + " is Palindrome");
		} else {
			System.out.println(+num + " is not Palindrome");
		}

	}

	private static boolean isPalindrome(int num) {
		if (num < 0)
			return false;

		int temp = num;
		int rem = 0;
		int sum = 0;

		while (temp != 0) {
			rem = temp % 10;
			sum = sum * 10 + rem;
			temp /= 10;
		}
		if (num == sum)
			return true;

		return false;

	}

}
