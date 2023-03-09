package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(25);
		al.add(56);
		al.add(45);
		al.add(1,65);
		al.add(48);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);

	}

}
