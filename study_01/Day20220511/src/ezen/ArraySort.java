package ezen;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		person[0] = new Person("야", 50);
		person[1] = new Person("호", 40);
		person[2] = new Person("꾸", 45);
		
		Arrays.sort(person);
		for (Person p : person)
			System.out.println(p);
	}

}

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name = " + name + ", age = " + age;
	}
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
//		if (this.age > p.age) return 1;
//		else if (this.age < p.age) return -1;
//		else 
//			return 0;
		//return p.age - this.age; // 오름차순
		return this.age - p.age; // 내림차순
	}
}