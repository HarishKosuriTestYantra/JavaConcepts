package stringPrograms;

public class PrintWordWhichAreEndingWithO {
	
	public static void main(String[] args) {
		
		String s = "Hello who are you";
		
		String[] sArr = s.split(" ");
		
		System.out.println("The words which are ending with \"o\" are");
		for (int i = 0; i < sArr.length; i++) {
			int  wordLength = sArr[i].length();
			if(sArr[i].toLowerCase().charAt(wordLength-1) == 'o')
			{
				System.out.println(sArr[i]);
			}
		}
		
		System.out.println("=================================================");
		System.out.println();
		System.out.println("The words which are ending with \"o\" are");
		
		for (int i = 0; i < sArr.length; i++) {
			String sp = sArr[i].toLowerCase();
			if(sp.endsWith("o"))
			{
				System.out.println(sArr[i]);
			}
		}
		
		System.out.println("=================================================");
		System.out.println();
		System.out.println("The words which contains \"o\" are");
		
		for (int i = 0; i < sArr.length; i++) {
			String sp = sArr[i].toLowerCase();
			if(sp.contains("o"))
			{
				System.out.println(sArr[i]);
			}
		}
		
	}
	


}
