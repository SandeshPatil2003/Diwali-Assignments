package Practice_Questions;

import java.util.Scanner;

public class PatternPrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows=0, choice = 0;
		
		
		while(true) {
		System.out.println("Choose a pattern to print\n");
		
		System.out.println("1.Number Half Pyramid\n"
				+ "2. Inverted Number Pyramid\n"
				+ "3. Full Numnber Pyramid\n"
				+ "4. Pascal's Triangle\n"
				+ "5. Exit");
		System.out.print("\nEnter your chooice : ");
		choice = sc.nextInt();
		
		if(choice == 5 ) {
			 System.out.println("Exiting...");
             break;
		}
		
		System.out.print("\nEnter Number of rows : ");
		 rows = sc.nextInt();
		
		switch(choice) {
		case 1 -> printHalfNumberPyramid(rows);
		
		case 2 -> printInvertedNumberPyramid(rows);
		
		case 3 -> printFullNumberPyramid(rows);
		
		case 4 -> printPascalsTriangle(rows);
		
		default -> System.out.println("Invalid choice!");
		}
		}
	}

	private static void printPascalsTriangle(int rows) {
		int val = 1;
		for(int i = 0;i<rows; i++) {
			for(int j=0;j<rows-i-1;j++) {
				System.out.print(" ");
			}
			val = 1;
			for(int j=0;j<=i;j++) {
				System.out.print(val+" ");
				val =val* (i-j) / (j+1);
			}
			System.out.println();
		}
	}

	private static void printInvertedNumberPyramid(int rows) {
		for (int i = rows; i > 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

	private static void printFullNumberPyramid(int rows) {
		for(int i = 0 ;i < rows;i++) {
			
			for(int j=0;j<rows-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
	}


	private static Object printHalfNumberPyramid(int rows) {
		for(int i = 0 ;i < rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		return null;
	}


}
