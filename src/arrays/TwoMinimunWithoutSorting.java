package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoMinimunWithoutSorting {

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

		int firstMin = arr[0];
		int secondMin = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstMin) {
				secondMin = firstMin;
				firstMin = arr[i];
			} else if (arr[i] < secondMin || firstMin == secondMin) {
				secondMin = arr[i];
			}
		}

		System.out.println("first minimum number is = " + firstMin);
		System.out.println("Second minimum number is = " + secondMin);

		sc.close();

	}

}
