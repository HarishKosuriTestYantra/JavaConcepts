package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorStringSortExample implements Comparator<Object> {
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		if (s1.compareTo(s2) > 0) {
			return 1;
		}
		else if (s1.compareTo(s2) < 0) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("pradyuman");
		al.add("ashish");
		al.add("akash");
		al.add("chinnu");
		
		
		System.out.println(al);
		
		Collections.sort(al, new ComparatorStringSortExample());
		
		System.out.println(al);

	}

}
