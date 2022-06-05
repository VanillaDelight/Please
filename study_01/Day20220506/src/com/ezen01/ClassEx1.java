package com.ezen01;


final class Card {
	String kind;
	int num;
	
	public Card() {
		this("SPADE", 1);
	}
	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return kind + " : " + num;
	}
}
public class ClassEx1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Card c = new Card("HEART", 3);
		System.out.println(c);
		
		Card c2 = Card.class.newInstance();
		System.out.println(c2);
		
//		Class cObj = c.getClass();
		Class cObj = Class.forName("com.ezen01.Card");
		
		cObj.getMethods();
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
	}
}
