package Coding_Challenge;

import java.util.Scanner;

public class MergeSortedArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of first array: ");
		int n1 = sc.nextInt();
		int nums1[] = new int[n1];
		
		acceptArrayElements(nums1,sc);
		
		

		System.out.print("Enter size of second array: ");
		int n2 = sc.nextInt();
		int nums2[] = new int[n2];
		
		acceptArrayElements(nums2,sc);
		

		int mergArr []= new int [nums1.length+nums2.length]; 
		
		mergTwoArray(nums1,nums2,mergArr);
      
		displayMergedArray(mergArr);

	}

	private static void displayMergedArray(int[] mergArr) {
		
		  System.out.println("Merged Array ");
			for(int n=0; n<mergArr.length;n++) {
				System.out.print(mergArr[n] + " ");
			}
		
	}

	private static void mergTwoArray(int[] nums1, int[] nums2, int[] mergArr) {
int i=0,j=0,k=0;
		
		while(i < nums1.length && j < nums2.length) {
			if(nums1[i]<=nums2[j]) {
				mergArr[k]=nums1[i];
				k++;
				i++;
			}else {
				mergArr[k]=nums2[j];
				k++;
				j++;
			}
		
		}
		 
        while (i < nums1.length) {
            mergArr[k] = nums1[i];
            k++;
            i++;
        }

       
        while (j < nums2.length) {
            mergArr[k] = nums2[j];
            k++;
            j++;
        }
		
	}

	private static void acceptArrayElements(int[] arr, Scanner sc) {
		System.out.println("Enter array elements.\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter array element "+(i+1)+" :");
			arr[i] = sc.nextInt();
		}
		
	}

}
