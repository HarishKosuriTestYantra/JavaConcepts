package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSortExample implements Comparator<Object> {
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		if (i1 > i2) {
			return 1;
		}
		else if (i1 < i2) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(50);
		al.add(12);
		al.add(15);
		al.add(18);
		
		
		System.out.println(al);
		
		Collections.sort(al, new ComparatorSortExample());
		
		System.out.println(al);

	}

	

	

}
