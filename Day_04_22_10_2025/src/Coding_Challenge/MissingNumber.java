package Coding_Challenge;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		//int arrSum = 0;
		
		int arrSum   = acceptArrayElements(arr,n,sc);
		
		int missingNum = findMissingNum(arr,n,arrSum);
		
		
		System.out.println("The missing number from array is : "+missingNum);
		
		sc.close();

	}

	private static int findMissingNum(int[] arr, int n, int arrSum) {
		int nNumSum = 0;
		for(int i = 1; i <= n+1; i++) {
			nNumSum +=i;
		}
	
		return (nNumSum - arrSum);
	}

	private static int acceptArrayElements(int[] arr, int n, Scanner sc) {
		System.out.println("Enter "+n+" distinct numbers from 0 to "+n+"\n");
		int arrSum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("Enter number "+(i+1)+" : ");
			arr[i]= sc.nextInt();
			
			arrSum+=arr[i];
		
		}
		return arrSum;
	}

}
