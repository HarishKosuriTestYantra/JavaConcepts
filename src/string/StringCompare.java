package string;

public class StringCompare {

	public static void main(String[] args) {
		
		String s = "TestYantra";
		String s1 = "TestYantra";
		System.out.println(s.compareTo(s1)); // two string are equal
		
		String s2 = "testYantra";
		String s3 = "TestYantra";
		System.out.println(s2.compareTo(s3));
		
		String s4 = "TestYantra";
		String s5 = "testYantra";
		System.out.println(s4.compareTo(s5));

		String str1 ="Test";
		String str2 = "Testra";
		
		System.out.println(str1.compareTo(str2));
		System.out.println('T' - 'Y');

	}

}
