package string;

import java.util.Arrays;

public class StringSplitndtoCharArray {
	public static void main(String[] args) {
		
		String s="I am working in TestYantra";
		String[] sArr = s.split(" ");
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(ch));
		
		
	}

}
