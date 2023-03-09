package stringPrograms;

public class CountAandEinString {

	public static void main(String[] args) {
		
		String s = "javatester";
		int count =0;
		char[] chr = s.toLowerCase().toCharArray();
		for (int i = 0; i < chr.length; i++) {
			if ((chr[i] == 'a') || (chr[i] == 'e')) {
				count++;
			}
		}
		System.out.println("String "+s+" contains "+count+" a and e characters");

	}

}
