package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		List a = new ArrayList();
		
		a.add(25);
		a.add("str");
		a.add('c');
		a.add(true);
		a.add(20.5);
		a.add(false);
		
		System.out.println(a);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		a.add(1, true);
		
		System.out.println(a);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		ArrayList al = new ArrayList();
		
		al.add(25);
		al.add("str");
		al.add('c');
		al.add(true);
		al.add(20.5);
		al.add(false);
		al.add(true);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		ArrayList al1 = new ArrayList(al);
		al1.add("testyantra");
		al1.add('e');
		System.out.println(al1);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		al2.add(al);
		al2.add("testYantra");
		System.out.println(al2);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		
		ArrayList al3 = new ArrayList();
		al3.add(al);
		al3.addAll(al);
		System.out.println(al3);
		al3.remove(5);
		System.out.println(al3);
		System.out.println(al3.contains(20.5));
		System.out.println(al3.contains(al));
		System.out.println(al3.containsAll(al));

	}

}
