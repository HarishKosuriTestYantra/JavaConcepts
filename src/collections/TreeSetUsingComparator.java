package collections;


import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetUsingComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if (i1 > i2) {
			return -1;
		}
		else if(i1<i2) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		TreeMap<Integer,Character> tm = new TreeMap<Integer,Character>(new TreeSetUsingComparator());
		
		tm.put(5, 'c');
		tm.put(2, 'd');
		tm.put(3, 'a');
		tm.put(1, 'f');
		tm.put(10, 'i');
		
		System.out.println(tm);
		
		
		
		Set<Entry<Integer, Character>> eset = tm.entrySet();
		for (Entry<Integer, Character> entry : eset) {
			System.out.println(entry);
		}
		
		
		
	}

	

}
