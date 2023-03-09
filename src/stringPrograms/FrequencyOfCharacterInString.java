package stringPrograms;

public class FrequencyOfCharacterInString {
	
	public static void main(String[] args) {
		
		String s= "aaaaaabccda";
		int freqCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			char ch = s.charAt(i);
			for (int j = i+1; j < s.length(); j++) {
				if(ch == s.charAt(j))
				{
					count++;
					i++; // this is so that we can increment the i value
				}
				else
				{
					break;
				}
			}
			System.out.println(ch+" "+count);
//			if (count > 1) {
//				freqCount++;
//			}
		}
		
//		System.out.println();
//		System.out.println("Frequency count is "+freqCount);
		
	}

}
