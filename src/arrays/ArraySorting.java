package arrays;

import java.util.Scanner;

public class ArraySorting {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter size of an array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		arr = enterArrayValues(size);
		System.out.println("Unsorted array is ");
		printArray(arr);

		int[] sortedArr = sort(arr);
		System.out.println("Sorted array is ");
		printArray(sortedArr);
		printArray(sort(arr));
//
//		int[] bsortedArr = bubleSort(arr);
//		System.out.println("Sorted array is ");
//		printArray(bsortedArr);
		
//		int max = secondGreatestNumberUsingSort(arr);
//		System.out.println("Second greatest number is "+max);

	}

	public static int[] enterArrayValues(int size) {
		int[] arr = new int[size];

		System.out.println("enter " + size + " elements in an array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static int[] sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}

		}
		return arr;
	}

	public static int[] bubleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j++]) {
					int temp = arr[j];
					arr[j] = arr[j++];
					arr[j++] = temp;
				}
			}
			if (flag) {
				break;
			}
		}
		return arr;
	}
	
	public static int secondGreatestNumberUsingSort(int[] arr)
	{
		
		int[] sortedArray = sort(arr);
		System.out.println("sorted array is ");
		printArray(sortedArray);
		return sortedArray[sortedArray.length-2];
	}

}
