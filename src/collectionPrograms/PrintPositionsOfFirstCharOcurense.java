package collectionPrograms;

import java.util.LinkedHashSet;

public class PrintPositionsOfFirstCharOcurense {

	public static void main(String[] args) {
		
		String s = "tester";
		
		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}
		
		System.out.println(ls);
		
		for (Character ch : ls) {
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					System.out.println(ch+" position is "+(i+1));
					break;
				}
			}
		}

	}

}
