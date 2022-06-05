package ee;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetEx5 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Persons2("David", 10));
		set.add(new Persons2("David", 10));
		
		System.out.println(set);
	}
}

class Persons2 {
	private String name;
	private int age;
	
	public Persons2() {}
	
	public Persons2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		Persons2 tmp = (Persons2)obj;
		return name.equals(tmp.name) && age == (tmp.age) ? true : false;
	}
}
