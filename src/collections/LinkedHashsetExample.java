package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(20);
		lhs.add("rain");
		lhs.add('s');
		lhs.add(20.5);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		Iterator itr = lhs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next()); 
			
		}

	}

}
