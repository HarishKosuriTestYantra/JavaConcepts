package collectionPrograms;

import java.util.LinkedHashSet;

public class Printaaaaabbbbbb {

	public static void main(String[] args) {

		String s = "aabbcdabcdcddaabcb";

		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}

		System.out.println(ls);

		for (Character ch : ls) {
			for (int i = 0; i < s.length(); i++) {
				if (ch.equals(s.charAt(i))) {
					System.out.print(ch);

				}
			}
			System.out.println();
		}

	}

}
