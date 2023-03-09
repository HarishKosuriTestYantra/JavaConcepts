package stringPrograms;

public class ReverseMethodWithoutUsingLength {
	
	public static void main(String[] args) {
		
		System.out.println("Reverse without using length variable or method");
		String rev = "";

		String s = "hyderabad";
		char[] ch = s.toCharArray();
		int count=0;
		
		for (char c : ch) {
			count++;
		}
		
		System.out.println("Printing string");
		for (int i = 0; i < count; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("printing string in reverse");
		for (int i = count-1; i >= 0; i--) {
			rev = rev +ch[i];
		}
		System.out.println(rev);
		s.compareTo(s);
		
	}

}
