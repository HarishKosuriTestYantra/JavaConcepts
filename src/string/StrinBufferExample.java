package string;

public class StrinBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Test");
		StringBuffer s1 = new StringBuffer("Test");
		
		System.out.println(s.toString());
		System.out.println(s1.toString());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		System.out.println(s.append(s1));
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s.compareTo(s1));
		
	}

}
