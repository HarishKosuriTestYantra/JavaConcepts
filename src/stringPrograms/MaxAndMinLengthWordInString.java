package stringPrograms;

import java.util.Iterator;

public class MaxAndMinLengthWordInString {
	
	public static void main(String[] args) {
		
		String s = "gggggggg we are all humans";
		String[] sArr = s.split(" ");
		int max = sArr[0].length();
		String maxWord = "";
		String minWord="";
		int min = sArr[0].length();
		
		for (int i = 0; i < sArr.length; i++) {
			if(sArr[i].length() >= max) {
				max = sArr[i].length();
				maxWord = sArr[i];
			}
		}
		
		System.out.println(maxWord+" "+max);
		
		for (int i = 0; i < sArr.length; i++) {
			if(sArr[i].length() < min) {
				min = sArr[i].length();
				minWord = sArr[i];
			}
		}
		
		System.out.println(minWord+" "+min);
		
	}

}
