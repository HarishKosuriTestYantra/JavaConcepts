package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExmpl {

	public static void main(String[] args) {
		System.out.println("LinkedHashMap methods");

		LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();

		hm1.put(1, "sky");
		hm1.put(2, "cruger");
		hm1.put(5, "z");
		hm1.put(4, "cat");
		hm1.put(6, null);
		hm1.put(null, null);

		System.out.println("LinkedHashMap");
		System.out.println(hm1);
		System.out.println("remove LinkedHashMap of key 1s");
		hm1.remove(1);
		System.out.println(hm1);

		System.out.println("LinkedHashMap keys");
		Set<Integer> keys = hm1.keySet();

		for (Integer key : keys) {
			System.out.println(key);
		}

		System.out.println("LinkedHashMap values");
		Collection<String> values = hm1.values();

		for (String value : values) {
			System.out.println(value);
		}

		System.out.println("LinkedHashMap values");
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("LinkedHashMap entry set");

		Set<Entry<Integer, String>> es = hm1.entrySet();
		for (Entry<Integer, String> entry : es) {
			System.out.println(entry);
		}

	}

}
