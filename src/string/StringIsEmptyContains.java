package string;

public class StringIsEmptyContains {

	public static void main(String[] args) {
		
		String s = "TestYantra";
		
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		
		String s1 = "            ";
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		
		String s3 = "Test yan";
		
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		
		System.out.println(s.contains("t"));
		System.out.println(s.contains("s0"));
		
		
		
		

	}

}
