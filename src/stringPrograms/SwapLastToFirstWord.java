package stringPrograms;

public class SwapLastToFirstWord {

	public static void main(String[] args) {
		
		String s = "I'm in TestYantra Hyderabad";
		
		String[] sArr = s.split(" ");
	
		String temp = sArr[0];
		sArr[0] = sArr[sArr.length - 1];
		sArr[sArr.length - 1] = temp;
		
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i]+" ");
		}

	}

}
