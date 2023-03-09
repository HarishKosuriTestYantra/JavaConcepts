package arrays;

public class PrintDuplicatesInAnArray {
	
	public static void main(String[] args) {
		
		int[] a = {2,1,5,2,1,8,3,8,2,2};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
		
	}

}
