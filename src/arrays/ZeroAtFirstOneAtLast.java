package arrays;

import java.util.Arrays;

public class ZeroAtFirstOneAtLast {
	public static void main(String[] args) {
		
		int a[] = {0,1,0,1,0,1,1,1,1,0};
		
		int start = 0;
		int end = a.length-1;
		int[] b =new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] != 0)
			{
				b[end] = a[i];
				end--;
			}
			else
			{
				b[start] = a[i];
				start++;
			}
		}
		
		System.out.println(Arrays.toString(b));
		myImp();
		
	}
	
	public static void myImp()
	{
int a[] = {0,1,0,1,0,1,8,8,1,1,1,0,8,8,4,4};
		
		int start = 0;
		int end = a.length-1;
		int[] b =new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 1)
			{
				b[end] = a[i];
				end--;
			}
			else if(a[i] == 0)
			{
				b[start] = a[i];
				start++;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			if(a[i] != 0 && a[i] != 1)
			{
				b[start] = a[i];
				start++;
			}
		}
		
		System.out.println(Arrays.toString(b));
		
	}

}
