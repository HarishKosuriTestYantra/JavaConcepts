package stringPrograms;

public class AddNumbersInTheString {
	
	public static void main(String[] args) {
		
		String s = "a11b22c33";
		int sum = 0;
		
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='0' && ch[i]<='9') {
				int num = ch[i] - 48;
				sum = sum + num;
			}
		}
		
		System.out.println(sum);
		char c = 'a';
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c+1);
		
	}

}
