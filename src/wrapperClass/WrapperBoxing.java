package wrapperClass;

public class WrapperBoxing {

	public static void main(String[] args) {
		
//		longn a1 = 10;
		int a = 10; // primitive
		Integer i = Integer.valueOf(a); //Boxing
		System.out.println(i); // non primitive

		int a2 = 20; // primitive
		Integer i2 = a2; //Auto Boxing
		System.out.println(i2); // non primitive
		
		int a3 = 30;
		Integer i3 = a3; //auto boxing
		int s3 = i3.intValue();//Unboxing
		System.out.println(s3);
		
		Double a4 = 40.0; // Non primitive (auto boxing)
		double s4 = a4.doubleValue();//Unboxing
		System.out.println(s4); // primitive
		
		Integer a5 = new Integer(50); // non primitive
		int s5 = a5.intValue(); // primitive
		System.out.println(s5); // Unboxing
		
		Double a6 = new Double(60.0); // non primitive
		double s6 = a6;// Auto UnBoxing
		System.out.println(s6); // primitive
		
		int a7 = new Integer(70); // Auto UnBoxing
		System.out.println(a7); // Primitive

	}

}
