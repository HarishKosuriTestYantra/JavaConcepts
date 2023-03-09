package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetExmpl {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(20);
		ts.add(65);
		ts.add(85);
		ts.add(85);
		ts.add(11);
		
		System.out.println(ts);
		
		Iterator itr = ts.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next()); 
			
		}
		
		System.out.println("first element ");
		System.out.println(ts.first());
		
		System.out.println("last element ");
		System.out.println(ts.last());
		
		System.out.println("poll first element ");
		ts.pollFirst();
		System.out.println(ts);
		
		System.out.println("poll last element ");
		ts.pollLast();
		System.out.println(ts);
		
		

	}

}
