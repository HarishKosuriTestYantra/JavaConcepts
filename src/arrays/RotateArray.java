package arrays;

import java.util.Scanner;

public class RotateArray {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter size of an array");
		int size = sc.nextInt();
	
		int[] arr = new int[size];
		arr = enterArrayValues(size);
		System.out.println("Entered array is ");
		printArray(arr);
		System.out.println("Enter rotated key value");
		int key = sc.nextInt();
		System.out.println("Right rotated array is ");
		printArray(rightRotation(arr, key));
		
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
	
	public static int[] rightRotation(int[] arr, int key)
	{
		
		for(int j=0; j<key; j++) {
			int temp;
			temp = arr[0];
			for (int k = 1; k < arr.length; k++) {
				arr[k-1] = arr[k];
			}
			arr[arr.length-1] = temp;
		}
		
		return arr;
	}
	
	

}
