package stringPrograms;

public class SwapStringWithout3rdVariable {

	public static void main(String[] args) {
		
		String s = "Hyderabad";
		String s1 ="Bangalore";
		
		s = s + s1;
		
		s1 = s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
		
		System.out.println(s+" "+s1);
		
		
		

	}

}
