package collectionPrograms;

import java.util.LinkedHashSet;

public class PrintUniqueCharacterInAnArray {

	public static void main(String[] args) {
		String s = "Indiaa";

		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}
		
		System.out.println(ls);
		
		for (Character ch : ls) {
			System.out.println(ch);
		}

	}

}
