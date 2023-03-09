package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissNumFromOneToTen {

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
		
//		int[] temp = {1,2,3,4,5,6,7,8,9};
//		
//		
//
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]/10 == 0 )
//			{
//				for (int j = 0; j < temp.length; j++) {
//					if(arr[i] == temp[j])
//					{
//						temp[j] = 0;
//					}
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(temp));
		
		
		
		
		for (int i = 1; i <= 10; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag =false;
					break;
				}
			}
			if (flag) {
				System.out.print(i+" ");
			}
		}

		sc.close();
	}

}
