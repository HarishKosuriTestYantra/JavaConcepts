package stringPrograms;

public class CountOfVowelsInString {
	
	public static void main(String[] args) {
		
		String s = "automation";
		System.out.println("String \""+s+"\" contains "+vowelCount(s)+" total number of vowels");
		String uniqStr = uniqueCharInString(s);
		System.out.println(uniqStr);
		System.out.println("String \""+s+"\" contains "+vowelCount(uniqStr)+" unique vowels");
		
	}
	
	public static int vowelCount(String s)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	
	public static String uniqueCharInString(String s)
	{
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(s1.indexOf(ch) == -1)
			{
				s1 = s1 + ch;
			}
		}
		return s1;
	}

}
