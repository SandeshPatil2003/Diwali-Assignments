package Practice_Questions;
import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num  = 0;
		do {
		System.out.print("Enter number of even numbers you want to sum : ");
		 num = sc.nextInt();
	
		if(num < 0) {
			System.out.println("Please enter valid value of even numbers to add");
		}
		else {
		int sum=sumOfEvenNumbers(num);
		
		System.out.println("Sum of "+num+" even number is : "+sum);
		}
		}while(num < 0);
		
		sc.close();
	}

	private static int sumOfEvenNumbers(int num) {
		
		int sum = 0;
		for(int i=1;i<=num*2;i++) {
			if(i%2 == 0) {
				sum+= i;
			}
		}
		return sum;
	}

}
