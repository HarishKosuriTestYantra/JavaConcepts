package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparator implements Comparator<Object> {
	
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
		
		Queue<String> al = new PriorityQueue<String>(new PriorityQueueComparator());
		
		al.add("pradyuman");
		al.add("ashish");
		al.add("akash");
		al.add("chinnu");
		
		
		System.out.println(al);
		


	}

}
