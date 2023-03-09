package stringPrograms;

public class ReverseWordInString {
	
public static void main(String[] args) {
		
		String s ="I am in TestYantra";
		
		String[] sArr = s.split(" ");
		
		String s1 = "";
		
		for (int i = 0; i < sArr.length; i++) {
			String str = sArr[i];
			String rev ="";
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				rev=ch+rev;
			}
			System.out.print(rev + " ");
			s1 = s1 + rev + " ";
		}
		System.out.println();
		System.out.println(s1);
		

	}

}
