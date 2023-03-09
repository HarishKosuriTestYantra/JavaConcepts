package collectionPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PrintCharAndCountAsHashMap {

	public static void main(String[] args) {
		
		String s = "automation";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i)) == false) {
				hm.put(s.charAt(i), 1);
			}
			else  {
				Integer oldValue = hm.get(s.charAt(i));
				int newValue = oldValue + 1;
				hm.put(s.charAt(i), newValue);
			}
		}
		
		
		Set<Character> ks = hm.keySet();
		System.out.println(ks);
		for (Character ch : ks) {
			System.out.println(ch);
		}
		
		
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		System.out.println(entrySet);
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}

	}

}
