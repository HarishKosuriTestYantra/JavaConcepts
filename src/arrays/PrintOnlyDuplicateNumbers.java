package arrays;

import java.util.Arrays;

public class PrintOnlyDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] a = { 1, 5, 6, 4, 7, 1, 5, 6, 1, 1, 2, 4, 88, 8, 5,10,11,12,13,14, 7, 9, 4, 5, 7, 7, 4,88, 1, 2, 6, 5, 8,99 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		int count = 1;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			} else if(count>1){
				System.out.println(a[i]+" repeated "+count+" times");
				count = 1;
			}
		}
		if (count > 1) {
			System.out.println(a[a.length-1]+" repeated "+count+" times");
		}
		

	}

}
