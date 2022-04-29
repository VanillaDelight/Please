package com.ezen;

public class Exam01 {

	public static void main(String[] args) {
		Animal a = new Penguin();
		a.eat();
		
//		animal.eat();
//		
//		if (animal instanceof Birds)
//			System.out.println(1);
//		else
//			;;
			
	}

}

class Animal {
	void eat() {
		System.out.println("동물이 먹는다");
	}
	void run() {
		
	}
	
}
class Mammal extends Animal {
	void eat() {
		System.out.println("포유류가 먹는다");
	}
}
class Whale extends Mammal {
	void eat() {
		System.out.println("고래가 먹는다");
	}
	void run() {
		System.out.println("달린다");
	}
}
class Person extends Mammal {
	void eat() {
		System.out.println("사람이 먹는다");
	}
}
class Birds extends Animal {
	void eat() {
		System.out.println("조류가 먹는다");
	}
	void ria() {
		System.out.println("ria");
	}
}
class Penguin extends Birds {
	void eat() {
		System.out.println("펭귄이 먹는다");
	}
	void play() {
		System.out.println("펭귄이 논다");
	}
}
class Sparrow extends Birds {
	void eat() {
		System.out.println("참새가 먹는다");
	}
}