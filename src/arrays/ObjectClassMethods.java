package arrays;

import java.util.Objects;

public class ObjectClassMethods {
	
	int age;
	String name;
	int id;
	
	public ObjectClassMethods(int age, String name, int id) {
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, id, name);
//	}
	
	



//	@Override
//	public String toString() {
//		return "ObjectClassMethods [age=" + age + ", name=" + name + ", id=" + id + "]";
//	}

	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClassMethods other = (ObjectClassMethods) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}



	public static void main(String[] args) {
		
		ObjectClassMethods emp1 = new ObjectClassMethods(26, "Rolex", 001);
		ObjectClassMethods emp2 = new ObjectClassMethods(26, "Rolex", 001);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1 == emp2);
		System.out.println(emp1);
		System.out.println(emp2);
		
		String s1 = "ravi";
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		
		String s2 = new String("ravi");
		System.out.println(s2.hashCode());
		System.out.println(s2.toString());
		
		System.out.println(Objects.hash(51));
		
		
	}

}
