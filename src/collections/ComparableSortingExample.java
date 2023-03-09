package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableSortingExample implements Comparable {
	int num;
	

	public ComparableSortingExample(int num) {
		this.num = num;
	}
	
	

	@Override
	public String toString() {
		return "num=" + num ;
	}


	@Override
	public int compareTo(Object o) {
		ComparableSortingExample cse = (ComparableSortingExample)o;
		
		if (num>cse.num) {
			return -1;
		}
		else if(num<cse.num){
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		
	
		ArrayList<ComparableSortingExample> al = new ArrayList<ComparableSortingExample>();
		
		al.add(new ComparableSortingExample(50));
		al.add(new ComparableSortingExample(12));
		al.add(new ComparableSortingExample(15));
		al.add(new ComparableSortingExample(18));
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);

	}
}
