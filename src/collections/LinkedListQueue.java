package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		
		Queue l = new LinkedList();
		
		l.offer(56);
		l.add(59);
		l.add(21);
		l.offer(36);
		
		System.out.println(l);
		
		System.out.println(l.peek());
		l.poll();
		System.out.println(l);
		System.out.println(l.peek());
		l.poll();
		System.out.println(l);

	}

}
