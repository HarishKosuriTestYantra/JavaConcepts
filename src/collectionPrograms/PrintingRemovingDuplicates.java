package collectionPrograms;

import java.util.LinkedHashSet;

public class PrintingRemovingDuplicates {

	public static void main(String[] args) {
		
		String s = "welcome to india welcome to tyss";
		String[] strArr = s.split(" ");
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		for (int i = 0; i < strArr.length; i++) {
			ls.add(strArr[i]);
		}

		System.out.println(ls);
		
		for (String str : ls) {
			System.out.print(str+" ");
		}

	}

}
