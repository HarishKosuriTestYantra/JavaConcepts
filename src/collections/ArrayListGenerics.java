package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListGenerics {

	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("Clear method");
		al.add(25);
		al.add(56);
		al.add(45);
		al.add(1,65);
		al.add(48);
		al.add(null);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println("--------------------------------------------------------------------");
		
		al.add(25);
		al.add(56);
		al.add(45);
		al.add(1,65);
		al.add(48);
		al.add(25);
//		al.add(null);
		System.out.println("index of and set method");
		System.out.println(al);
		System.out.println("first index of 25"+al.indexOf(25));
		System.out.println("last index of 25 "+al.lastIndexOf(25));
		System.out.println("Element at index 3 is "+al.get(3));
		System.out.println(al);
		System.out.println("replace value at index 1");
		al.set(1, 100);
		System.out.println(al);
		System.out.println("replace value at index 3");
		al.set(3, 200);
		System.out.println(al);
		System.out.println("--------------------------------------------------------------------");
		
		
		System.out.println("Printing using for loop");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Printing using for each loop");
		
		for (Integer i : al) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Printing using iterator");
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("removing element using iterator");
		
		Iterator<Integer> it2 = al.iterator();

		while (it2.hasNext()) {
			Integer s = it2.next();
			if (s.equals(48)) {
				it2.remove();
			}
		}
		
		System.out.println(al);
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Printing from left to right");
		
		ListIterator<Integer> listIter = al.listIterator();
		
		while(listIter.hasNext()) {
			System.out.print(listIter.next()+" ");
		}
		System.out.println();
		System.out.println("Printing from right to left");
		
		while(listIter.hasPrevious()) {
			System.out.print(listIter.previous()+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Add element using list iterator");
		System.out.println(al);
		while(listIter.hasNext()) {
			Integer re = listIter.next();
//			if (re.equals(100)) {
//				listIter.add(13);
//			}
			listIter.add(13);
		}
		System.out.println(al);	

	}

}
