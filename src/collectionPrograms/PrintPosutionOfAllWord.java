package collectionPrograms;

import java.util.LinkedHashSet;

public class PrintPosutionOfAllWord {

	public static void main(String[] args) {
		
		String s = "khatam ta ta bye bye";
		String[] strArr = s.split(" ");
		LinkedHashSet<String> ls = new LinkedHashSet<String>();

		for (int i = 0; i < strArr.length; i++) {
			ls.add(strArr[i]);
		}

		System.out.println(ls);

		for (String str : ls) {
			for (int i = 0; i < strArr.length; i++) {
				if (str.equals(strArr[i])) {
					System.out.println(str + " position is " + (i + 1));
				
				}
			}
		}

	}

}
