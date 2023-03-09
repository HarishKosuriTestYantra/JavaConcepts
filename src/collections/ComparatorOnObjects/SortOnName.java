package collections.ComparatorOnObjects;

import java.util.Comparator;

public class SortOnName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		if(e1.name.compareTo(e2.name) > 0) {
			return 1;
		}
		else if(e1.name.compareTo(e2.name) < 0) {
			return -1;
		}
		return 0;
	}
	
}
