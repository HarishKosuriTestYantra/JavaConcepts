package recursion;

public class MethodChaining {
	
	public static void m1()
	{
		System.out.println("Non parameterised method");
	}
	
	public static void m1(int a)
	{
		m1();
		System.out.println("int parameterised method");
	}
	
	public static void m1(int a, double b)
	{
		m1(10);
		System.out.println("int and double parameterised method");
	}

	public static void main(String[] args) {
		m1(100,20.0);

	}

}
