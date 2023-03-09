package stringPrograms;

public class VowelCountInGivenStringArry {

	public static void main(String[] args) {
		
		String[] sArr = {"TestYantra", "Bangalore", "Hyderabad", "Chennai"};
		
		for (String sp : sArr) {
			int count = 0;
			for (int i = 0; i < sp.length(); i++) {
				char ch = sp.toLowerCase().charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
					count ++;
				}
			}
			System.out.println(sp+" = "+count);
		}

	}

}
