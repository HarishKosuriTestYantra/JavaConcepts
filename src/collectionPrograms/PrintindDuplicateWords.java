package collectionPrograms;

import java.util.LinkedHashSet;

public class PrintindDuplicateWords {

	public static void main(String[] args) {
		String s = "welcome to india welcome to tyss";
		String[] strArr = s.split(" ");
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		for (int i = 0; i < strArr.length; i++) {
			ls.add(strArr[i]);
		}

		System.out.println(ls);
		
		for (String str : ls) {
			int count =0;
			for (int i = 0; i < strArr.length; i++) {
				if(str.equals(strArr[i])) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(str+" "+count);
			}
			
		}
	}

	

}
