package collections.ComparatorOnObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Emp implements Comparable{
	
	int id;
	String name;
	int salary;

	public Emp(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Emp e = (Emp)o;
//		return this.id - e.id; (own implementation)
		if(this.id > e.id) {
			return 1;
		} 
		else if(this.id < e.id) {
			return -1;
		}
		
		return 0;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(new Emp(12,"aravind",20000));
		al.add(new Emp(10,"bindhu",35000));
		al.add(new Emp(1245,"ganesh",60000));
		al.add(new Emp(54,"jagadish",70000));
		
		System.out.println("given array list");
		for (Object e : al) {
			System.out.println(e);
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("Sorting object based on id");
		Collections.sort(al);
		for (Object e : al) {
			System.out.println(e);
		}
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Sorting object based on name");
		Collections.sort(al, new SortOnName());
		for (Object e : al) {
			System.out.println(e);
		}
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Sorting object based on salary");
		Collections.sort(al, new SortOnSalary());
		for (Object e : al) {
			System.out.println(e);
		}

	}

	



	

}
