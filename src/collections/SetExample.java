package collections;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(20);
		hs.add("rain");
		hs.add('s');
		hs.add(20.5);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);

	}

}
