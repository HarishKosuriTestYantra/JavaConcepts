package arrays;

import java.util.Scanner;

public class ArrayMethods {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("enter size of an array");
		int size = sc.nextInt();
	
		int[] arr = new int[size];
		arr = enterArrayValues(size);
		System.out.println("Entered array is ");
		printArray(arr);

//		firstLastNumber(arr);
//		addEvenOddIndex(arr);
//		printArray(reverseArray(arr));
//		int[] copyArr = copyArrayToAnother(arr);
//		printArray(copyArr);
//		printArray(revArrayStartEnd(arr));
//		int great = greaterInArray(arr);
//		int small = smallerInArray(arr);
//		System.out.println("greater is "+great+", smaller is "+small);
		

	}
	
	public static void addEvenOddIndex(int[] arr)
	{
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2 == 0)
			{
				evenSum += arr[i];
			}
			else
			{
				oddSum += arr[i];
			}
		}
		
		System.out.println("sum of even index is "+evenSum);
		System.out.println("sum of odd index is "+oddSum);
	}
	
	public static void firstLastNumber(int[] arr)
	{
		System.out.println("First element of array is "+arr[0]);
		System.out.println("Last element of array is "+arr[arr.length-1]);
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
	
	public static int[] reverseArray(int[] arr)
	{
		int[] revArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			revArr[arr.length-i-1] = arr[i];
		}
		
		return revArr;
		
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
	
	public static int[] copyArrayToAnother(int[] arr)
	{
		int[] copyArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			copyArr[i] = arr[i];
		}
		
		return copyArr;
		
	}
	
	
	public static int[] revArrayStartEnd(int[] arr)
	{
		int start = 0;
		int end = arr.length - 1;
		
		for (int i = 0; i < arr.length; i++) {
			if(start < end)
			{
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
			}
			start++;
			end--;
			
		}
		return arr;
	}
	
	public static int greaterInArray(int[] arr)
	{
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int smallerInArray(int[] arr)
	{
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= min)
			{
				min = arr[i];
			}
		}
		return min;
	}
	
	public void add()
	{
		
	}
	
	public void sub()
	{
		add();
	}
	

}
