package recursion;

public class Fibonaci {

	public static int fibo(int num) {
		
		if(num == 0)
		{
			return 0;
		}
		else if (num == 1) {
			return 1;
		} else {
			return fibo(num-2) + fibo(num-1);
		}
		
			
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(fibo(1));

	}

}
