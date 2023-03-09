package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(1, "sky");
		tm.put(2, "cruger");
		tm.put(5, "z");
		tm.put(4, "cat");
		tm.put(4, "dog");
		tm.put(6, null);
		tm.put(3, "tiger");
		System.out.println(tm);
		
		System.out.println("Tree Map");
		System.out.println(tm);
		System.out.println("remove Tree Map of key 1s");
		tm.remove(1);
		System.out.println(tm);
		
		System.out.println("Tree Map keys");
		Set<Integer> keys = tm.keySet();
		
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		System.out.println("Tree Map values");
		 Collection<String> values = tm.values();
		
		for ( String value : values) {
			System.out.println(value);
		}
		
		System.out.println("Tree Map values");
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); 
			
		}
		
		System.out.println("Tree Map entry set");
		
		Set<Entry<Integer, String>> es = tm.entrySet();
		for (Entry<Integer, String> entry : es) {
			System.out.println(entry);
		}
		
		System.out.println(tm.lastKey());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastEntry());
		
	    SortedMap<Integer, String> hm = tm.headMap(5);
	    System.out.println(hm);
	    
	     Set<Integer> hm1 = tm.headMap(5).keySet();
	    System.out.println(hm1);
	    
	    
	    SortedMap<Integer, String> hmap = tm.tailMap(3);
	    System.out.println(hmap);
	    
	    Collection<String> hmap1 = tm.tailMap(3).values();
	    System.out.println(hmap1);
		
	    NavigableSet<Integer> dkey = tm.descendingKeySet();
	    System.out.println(dkey);
	    
	  
	    
	    NavigableMap<Integer, String> dmap = tm.descendingMap();
	    System.out.println(dmap);
	    
	    Collection<String> dmap1 = tm.descendingMap().values();
	    System.out.println(dmap1);
	    
	    SortedMap<Integer, String> smap = tm.subMap(3, 5);
	    System.out.println(smap);
	    
	    Set<Integer> smap1 = tm.subMap(1, 5).keySet();
	    System.out.println(smap1);
		

	}

}
