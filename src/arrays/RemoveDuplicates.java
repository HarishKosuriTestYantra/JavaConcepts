package arrays;

import java.util.Scanner;

public class RemoveDuplicates {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter size of an array");
		int size = sc.nextInt();
	
		int[] arr = new int[size];
		arr = enterArrayValues(size);
		System.out.println("Entered array is ");
		printArray(arr);
		
		System.out.println("sorted array is");
		printArray(sort(arr));
	
		removeDuplicates(sort(arr));
		
	}
	
	public static int[] enterArrayValues(int size)
	{	
		int[] arr = new int[size];
		
		System.out.println("enter "+size+" elements in an array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void removeDuplicates(int[] arr)
	{
		int k = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				arr[k] = arr[i];
				k++;
			}
		}
		arr[k] = arr[arr.length-1];
		
		System.out.println("Unique elements in array is");
		for (int i = 0; i < k+1; i++) {
			System.out.print(arr[i]+" ");
		}
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
	

}
