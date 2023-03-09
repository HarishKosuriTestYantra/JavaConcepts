package collections;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		
		ht.put("a", 1);
		ht.put(1, 100);
		ht.put('c', true);
		ht.put('c', false);
		ht.put(2, 100);
		ht.put(1, 200);
//		ht.put(null, 1);
//		ht.put(6, null);
		
		System.out.println(ht);
		
		System.out.println("generic hashtable");
		
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		
		ht1.put(1, "sky");
		ht1.put(2, "cruger");
		ht1.put(5, "z");
		ht1.put(4, "cat");
		
		System.out.println(ht1);

	}

}
