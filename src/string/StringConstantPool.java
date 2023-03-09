package string;

public class StringConstantPool {

	public static void main(String[] args) {
		
		String s = new String("TestYantra");
		String s1 = "TestYantra";
		System.out.println(s1 == s);
		System.out.println(s1.equals(s1));
		
		String s2 = new String("SDET11");
		String s3 = new String("SDET11");
		s2 = s3;
		System.out.println(s2 == s3);
		
		String s5 = s +  s1;
		System.out.println(s5);
		
		System.out.println(s.concat(s1));
		System.out.println(s);
		
		String a1 = "TestYantra";
		String a2 = "Hyderabad";
		
		String a3 = a1 + a2;
		
		System.out.println(a3);
		

	}

}
