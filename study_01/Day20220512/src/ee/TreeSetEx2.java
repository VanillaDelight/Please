package ee;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet<Person> tree = new TreeSet<Person>();
		
		tree.add(new Person("kim", 20));
		tree.add(new Person("kim", 20));
		tree.add(new Person("kim", 2));
		tree.add(new Person("kim", 220));
		tree.add(new Person("kim", 10));
		
		for(Person n : tree)
			System.out.print(n + "\t");
		System.out.println("\n-----------------------");
		Iterator<Person> it = tree.iterator();
		
		while(it.hasNext())
			System.out.print(it.next() + "\t");
	}
}

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
}