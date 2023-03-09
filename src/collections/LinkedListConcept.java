package collections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		System.out.println("Linked list methods");
		LinkedList l = new LinkedList();
		l.add(true);
		l.add("ios");
		l.add("Android");
		l.add("Windows");
		l.add("BlackBerry");
		System.out.println(l);
		l.addFirst("microsoft");
		l.addLast("Google");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l);
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println("--------------------------------------------------------------------------------");
		
		

	}

}
