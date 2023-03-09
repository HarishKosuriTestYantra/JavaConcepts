package stringPrograms;

public class SwapAlphabetsWithOutSpecialChar {

	public static void main(String[] args) {
		
		String s ="a%#ckmd%#f*";
		char[] chArr = s.toCharArray();
		
		System.out.println("Before Swapping");
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i]);
		}
		
		int left = 0;
		int right = chArr.length - 1;
		for (int i = 0; i < chArr.length; i++) {
			if((chArr[left] >= 'a' && chArr[left] <= 'z') || (chArr[left] >= 'A' && chArr[left] <= 'Z')) {
				if((chArr[right] >= 'a' && chArr[right] <= 'z') || (chArr[right] >= 'A' && chArr[right] <= 'Z')) {
					if (left < right) {
						char temp = chArr[left];
						chArr[left] = chArr[right];
						chArr[right] = temp;
					    left++;
					    right--;
					}
				} else {
					right--;
				}
			} else {
				left++;
			}
		}
		
		System.out.println();
		System.out.println("After Swapping");
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i]);
		}

	}

}
