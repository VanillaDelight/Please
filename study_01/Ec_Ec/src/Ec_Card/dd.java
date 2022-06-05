package Ec_Card;

public class dd {

	public static void main(String[] args) {
		Card card1 = new Card(1, 1);
		Card card2 = new Card(2, 122);
		Card card3 = new Card(3, 13);
		Card card4 = new Card(4, 4);
		
	/*	System.out.println(card1.getSuit());
		System.out.println(card2.getSuit());
		System.out.println(card3.getSuit());
		System.out.println(card4.getSuit());
		System.out.println(card1.getRank());
		System.out.println(card2.getRank());
		System.out.println(card3.getRank());
		System.out.println(card4.getRank());
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		System.out.println(card4.toString());
	*/	
		Deck d = new Deck();
		d.addCard(card4);
		d.addCard(card3);
		d.addCard(card2);
		d.print();
		System.out.println("\n---------------");
		d.shuffle();
		
		d.print();
	}

}
