package collectionPrograms;

import java.util.LinkedHashSet;

public class PrintUniqueVowelCount {

	public static void main(String[] args) {
		
		String s = "india";
		int count = 0;
		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}
		
		for (Character ch : ls) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		
		System.out.println("String \""+s+"\" vowel count is "+count);

	}

}
