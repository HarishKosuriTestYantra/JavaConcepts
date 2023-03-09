package collectionPrograms;

import java.util.LinkedHashSet;

public class CharacterCountInString {

	public static void main(String[] args) {
		
		String s = "indiaa";
		
		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}
		
		for (Character ch : ls) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
//			System.out.println(ch+" "+count);
			
//			allCount(ch, count);
//			uniqueCount(ch, count);
			duplicateCount(ch, count);
		}

	}
	
	
	
	public static void uniqueCount(char ch, int count)
	{
		
		if (count == 1) {
			System.out.println(ch + " "+count);
		}
	}
	
	public static void duplicateCount(char ch, int count)
	{
		
		if (count > 1) {
			System.out.println(ch + " "+count);
		}
	}
	
	public static void allCount(char ch, int count)
	{
		
		System.out.println(ch + " "+count);
		
	}

}
