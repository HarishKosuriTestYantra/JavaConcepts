package stringPrograms;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String s = "malayala";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i)+rev;
		}
		if (s.equals(rev)) {
			System.out.println("String \""+s+"\" is a Pallindrome");
		}
		else {
			System.out.println("String \""+s+"\" is not a Pallindrome");
		}
		
	}

}
