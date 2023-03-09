package stringPrograms;

public class FirstLetterCapital {

	public static void main(String[] args) {

		String s = "welcome to india";
		String[] sArr = s.split(" ");

		String capitalWord = "";

		for (String sp : sArr) {
			String cap = sp.substring(0, 1).toUpperCase() + sp.substring(1).toLowerCase();
			capitalWord = capitalWord + cap + " ";
		}

		System.out.println(capitalWord);

	}

}
