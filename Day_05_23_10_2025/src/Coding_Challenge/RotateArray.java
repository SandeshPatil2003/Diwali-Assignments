package Coding_Challenge;
import java.util.Scanner;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }


        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter number of steps to rotate (k): ");
        int k = sc.nextInt();


        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
        	System.out.print( nums[i] + " ");
        }
        rotate(nums, k);
        System.out.println("\nRotated array: ");
        for (int i = 0; i < n; i++) {
        	System.out.print( nums[i] + " ");
        }
    }
}

