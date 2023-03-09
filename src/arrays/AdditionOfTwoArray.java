package arrays;


public class AdditionOfTwoArray {
	 public static void main(String[] args) {
		
//		int[] a = {1,2,4,5};
//		int[] b = {6,7,8,9,10,11};
//		
//		int length;
//		
//		if(a.length < b.length)
//		{
//			length = b.length;
//		}
//		else
//		{
//			length = a.length;
//		}
//		
//		for (int i = 0; i < length; i++) {
//			try {
//				System.out.print(a[i]+b[i]+" ");
//			}
//			catch (Exception e) {
//				if(a.length > b.length)
//				{
//					System.out.print(a[i]+" ");
//				}
//				else
//				{
//					System.out.print(b[i]+" ");
//				}
//			}
//			
//		}
		
		ownImplimentation();
		
	}
	
	public static void ownImplimentation()
	{
		int[] a = {1,2,4,5};
		int[] b = {6,7,8,9,4,5};
		
		int minLength;
		int maxLength;
		
		if(a.length <= b.length)
		{
			minLength = a.length;
			maxLength = b.length;
		}
		else
		{
			minLength = b.length;
			maxLength = a.length;
		}
		
		for (int i = 0; i < minLength; i++) {
				System.out.print(a[i]+b[i]+" ");
			}
		
		for (int i = minLength; i < maxLength; i++) {
			if(a.length>b.length)
			{
				System.out.print(a[i]+" ");
			}
			else
			{
				System.out.print(b[i]+" ");
			}
		}
			
		}


}
