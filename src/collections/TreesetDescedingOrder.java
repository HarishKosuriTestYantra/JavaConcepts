package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetDescedingOrder implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		if (i1 > i2) {
			return -1;
		}
		else if (i1 < i2) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		TreesetDescedingOrder t = new TreesetDescedingOrder();
		TreeSet ts = new TreeSet(t);
		ts.add(20);
		ts.add(65);
		ts.add(85);
		ts.add(85);
		ts.add(11);
		
		System.out.println(ts);

	}

	

}
