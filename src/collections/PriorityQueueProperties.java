package collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueProperties {

	public static void main(String[] args) {
		
	  Queue pq = new PriorityQueue();
	  
	  pq.offer(56);
	  pq.add(89);
	  pq.add(21);
	  pq.offer(36);
	  pq.add(5);
	  
	  System.out.println(pq);
	 
	  
	  while(!pq.isEmpty()) {
		  System.out.println(pq.poll()); 
	  }
	  
	  System.out.println(pq);

	}

}
