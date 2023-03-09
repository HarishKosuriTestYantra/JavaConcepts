package recursion;

public class SumOfNumUsingRequersion {
	
	public static int sumReq(int a)
	{
		if(a>0) {
			return a + sumReq(a-1);
		}
		return 0;
	}

	public static void main(String[] args) {
		int result = sumReq(5);
		System.out.println(result);
		int myRes = mySumReq(5);
		System.out.println(myRes);

	}
	
	public static int mySumReq(int a)
	{
		if(a == 1)
		{
			return 1;
		}
		
		return a + sumReq(a-1);
	}

}
