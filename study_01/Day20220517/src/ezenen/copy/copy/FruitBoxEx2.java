package ezenen.copy.copy;

import java.util.ArrayList;

interface Eatable {}

class Fruit implements Eatable {
	@Override
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}
}
class Toy {
	@Override
	public String toString() {
		return "Toy";
	}
}
class FruitBox<T extends Fruit & Eatable> extends Boxy<T> {}
public class FruitBoxEx2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);
		
	}

}

class Boxy<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	
	@Override
	public String toString() {
		return list.toString();
	}
}
