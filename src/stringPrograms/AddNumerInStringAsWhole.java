package stringPrograms;

public class AddNumerInStringAsWhole {
	
	public static void main(String[] args) {
		
//		String s = "a11b22c33";
//		int sum = 0;
//		
//		char[] ch = s.toCharArray();
//		
//		for (int i = 0; i < ch.length; i++) {
//			if (ch[i]>='0' && ch[i]<='9') {
//				int num = ch[i] - 48;
//				sum = sum + num;
//			}
//		}
		
		String s = "a11b22c33a";
		int sum = 0;
		int num = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= '0' && ch <='9') {
				int n = ch - 48;
				num = num*10 + n;
			}
			else
			{
				sum = sum + num;
				num = 0;
			}
			
		}
		
//		char lasrChar = s.charAt(s.length()-1);
//		if (lasrChar>='0' && lasrChar<='9') {
//			sum = sum + num;
//		}
		
		System.out.println(sum+num);
		
		
	}

}
