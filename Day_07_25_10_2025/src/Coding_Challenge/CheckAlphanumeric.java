package Coding_Challenge;

import java.util.Scanner;

public class CheckAlphanumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter string : ");
		sc.next();
		String str = sc.nextLine();
	
		
		if(isAlphanumeric(str)) {
			System.out.println("String is Alphanumeric");
		}
		else {
			System.out.println("String is not Alphanumeric");
		}

	}

	private static boolean isAlphanumeric(String str) {
		
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(!(ch<='A' && ch>='Z') || (ch<='a' && ch>='z') || (ch<='0' && ch>='9')) {
				return false;
			}
		}
		return true;
	}

}
