package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoMaxNumberWithoutSorting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter " + size + " elements in an array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered array is ");
		System.out.println(Arrays.toString(arr));
		
		int firstMax=arr[0];
		int secondMax = arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			}
			else if(arr[i] > secondMax || secondMax == firstMax) {
				secondMax = arr[i];
			}
		}
		
		System.out.println("first maximum number is = "+firstMax);
		System.out.println("Second maximum number is = "+secondMax);
			
		sc.close();
	}

}
