package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put("a", 1);
		hm.put(1, 100);
		hm.put('c', true);
		hm.put('c', false);
		hm.put(2, 100);
		hm.put(null, "n");
		hm.put(5, null);
		hm.put('g', null);

		
		
		
		System.out.println(hm);
		
		System.out.println("Hash Map methods");
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(1, "sky");
		hm1.put(2, "cruger");
		hm1.put(5, "z");
		hm1.put(4, "cat");
		hm1.put(6, null);
		
		System.out.println("Hash map");
		System.out.println(hm1);
		System.out.println("remove hash map of key 1s");
		hm1.remove(1);
		System.out.println(hm1);
		
		System.out.println("hash map keys");
		Set<Integer> keys = hm1.keySet();
		
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		System.out.println("hash map values");
		 Collection<String> values = hm1.values();
		
		for ( String value : values) {
			System.out.println(value);
		}
		
		System.out.println("hash map values");
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); 
			
		}
		
		System.out.println("hash map entry set");
		
		Set<Entry<Integer, String>> es = hm1.entrySet();
		for (Entry<Integer, String> entry : es) {
			System.out.println(entry);
		}

	}

}
