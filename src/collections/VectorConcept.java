package collections;

import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.addElement(112);
		v.addElement('e');
		v.addElement(true);
		v.addElement(2.0);
		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		boolean flag = v.removeElement('e');
		System.out.println(flag);
		System.out.println(v);
		
		v.removeAllElements();
		System.out.println(v);
		
		

	}

}
