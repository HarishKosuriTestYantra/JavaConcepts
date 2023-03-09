package string;

public class StringReplace {

	public static void main(String[] args) {
		
		String s = "TestYantra";
		
		String s1 = s.replace('a', 't');
		System.out.println(s1);
		
		String s2 = s.replace("Test", "E");
		System.out.println(s2);
		
		String s3 = s.replaceAll("a", "and");
		System.out.println(s3);
		
		String s4 = s.replaceAll("[a-z]", "and");
		System.out.println(s4);
		
		String s5 = s.replaceFirst("t", "i");
		System.out.println(s5);
		
		String s6 = s.replaceAll("[aeiou]", "and");
		System.out.println(s6);

	}

}
