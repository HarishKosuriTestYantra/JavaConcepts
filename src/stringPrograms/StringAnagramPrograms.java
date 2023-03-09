package stringPrograms;

import java.util.Arrays;

public class StringAnagramPrograms {

	public static void main(String[] args) {

		String s1 = "care";
		String s2 = "race";

		if (s1.length() == s2.length()) {
			char[] charArr1 = s1.toCharArray();
			char[] charArr2 = s2.toCharArray();
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			if (Arrays.equals(charArr1, charArr2)) {
				System.out.println(s1 + " and " + s2 + " are anagrams");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagrams");
			}
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}

	}

}
