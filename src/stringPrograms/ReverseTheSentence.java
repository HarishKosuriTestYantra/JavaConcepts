package stringPrograms;

public class ReverseTheSentence {

	public static void main(String[] args) {
		
		String s ="I am in TestYantra";
		
		String[] sArr = s.split(" ");
		
		String s1 = "";
		
		for (int i = 0; i < sArr.length; i++) {
			String str = sArr[i];
			s1 = str+" "+s1;
		}
		
		System.out.println(s1);
		

	}

}
