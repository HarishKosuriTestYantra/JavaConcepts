package collections;

import java.util.ArrayList;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		
		System.out.println("Remove all");
		
		ArrayList al = new ArrayList<>();
		al.add(25);
		al.add(20.5);
		
		ArrayList al2 = new ArrayList<>();
		al2.add(25);
		al2.add(20.5);
		al2.add("STR");
		al2.add(52);
		System.out.println(al);
		System.out.println(al2);
		al2.removeAll(al);
		
		System.out.println(al2);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("retains all");
		al2.add(25);
		al2.add(20.5);
		al2.add("STR");
		al2.add(52);
		
		al2.add(25);
		al2.add(20.5);
		al2.add("STR");
		al2.add(52);
		
		al2.retainAll(al);
		
		System.out.println(al2);
		System.out.println("---------------------------------------------------------------------------------");
		
		
		

	}

}
