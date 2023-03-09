package string;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String  s = "TestYantra";
		String s1 = "testyantra";
		String s3 = "TestYantraTest";
		
		System.out.println("-------------------------------------------");
		System.out.println(s3.lastIndexOf('t')); // last index of 't'
		System.out.println(s3.lastIndexOf('a'));
		System.out.println(s3.lastIndexOf('t', 13));
		System.out.println(s3.lastIndexOf("es"));
		System.out.println(s3.lastIndexOf("es", 5));
		System.out.println(s3.lastIndexOf("es",13));
		System.out.println(s3.lastIndexOf("es", 3));
		System.out.println("-----------------------------------------------");

		System.out.println(s.indexOf("z"));
		
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(1));
		System.out.println(s.length());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println("==================================");		
		String s2 = "                                        I am       working in TestYantra 145        ";
		System.out.println(s2);
		System.out.println(s2.trim()); // trim remove only spaces at leading and trailing spaces
		
		System.out.println(s.substring(5)); // print string from index 5 till the last index
		System.out.println(s.substring(4,9)); // print string from starting index  4 to ending index excluding end index
		System.out.println(s.substring(3, 5));
		
		System.out.println("==================================");	
		//String s3 = "TestYantraTest";
		
		System.out.println(s3.indexOf('t'));//index of first occurrence of 't' in s3
		System.out.println(s3.indexOf("tra")); // starting index of tra
		System.out.println(s3.indexOf('t', 4)); // index of first occurrence of 't' starting from 4th index
		System.out.println(s3.indexOf('t', 3)); // index of first occurrence of 't' starting from 3rd index
		System.out.println(s3.indexOf("Test", 1));// index of first occurrence of "Test" starting from 1st index
		System.out.println(s3.indexOf("Test", 0));// index of first occurrence of "Test" starting from 0th index
		
		System.out.println("==================================");
		System.out.println(s3.lastIndexOf('t')); // last index of 't'
		System.out.println(s3.lastIndexOf('a'));
		System.out.println(s3.lastIndexOf('t', 13));
		System.out.println(s3.lastIndexOf("es"));
		System.out.println(s3.lastIndexOf("es", 5));
		System.out.println(s3.lastIndexOf("es",13));
		System.out.println(s3.lastIndexOf("es", 3));
		
		System.out.println("==================================");
		
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.startsWith("T"));
		System.out.println(s3.startsWith("t"));
		System.out.println(s3.endsWith("T"));
		System.out.println(s3.endsWith("t"));
		
		System.out.println("==================================");
		
		int i = 10;
		System.out.println(i+10);
		String str = String.valueOf(i); // converting int to string
		System.out.println(str+10);
		
		
		System.out.println("==================================");
		
	}

}
