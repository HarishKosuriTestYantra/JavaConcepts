package stringPrograms;

public class PrintStringAndReverse {

	public static void main(String[] args) {
		
		String s = "hyderabad";
		
		
		System.out.println("Given string is ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Printing string in reverse order");
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
		String s1="";
		System.out.println("Reverse of a string is");
		for (int i = s.length()-1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
		System.out.println("----------------------------------------------------------");
		System.out.println("Reverse without using length variable or method");
		
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
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Reverse by swapping");
		for (int i = 0; i < count/2; i++) {
			char temp;
			temp = ch[i];
			ch[i] = ch[count-1-i];
			ch[count-1-i] = temp;
		}
		
		String str = String.valueOf(ch);
		System.out.println(str);
		System.out.println("--------------------------------------------------------");
		
		
		

	}

}
