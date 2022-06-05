package eee;

import java.util.ArrayList;

class Fruit { @Override public String toString() {return "Fruit";} }
class Melon extends Fruit { @Override public String toString() {return "Melon";} }
class Grape extends Fruit { @Override public String toString() {return "Grape";} }
class Toy { @Override public String toString() {return "Toy";} }

public class FruitBoxEx1 {

	public static void main(String[] args) {
		Box1<Fruit> fruitBox = new Box1<Fruit>();
		Box1<Melon> melonBox = new Box1<Melon>();
		Box1<Toy> toyBox = new Box1<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Melon());
		
		melonBox.add(new Melon());
		melonBox.add(new Melon());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(melonBox);
		System.out.println(toyBox);
	}

}

class Box1<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	@Override
	public String toString() {
		return list.toString();
	}
}