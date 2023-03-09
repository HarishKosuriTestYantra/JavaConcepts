package collections;

import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.addElement(112);
		st.push("push");
		st.addElement('e');
		st.pop();
		st.addElement(true);
		st.addElement(2.0);
		
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		while (!st.isEmpty()) {
			st.pop();
		}
		
		System.out.println(st);
		
		
		

	}

}
