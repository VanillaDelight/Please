package Ec_Card;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void print() {
		for (Card c : cards) {
			System.out.print("[" + c.toString() + "] ");
		}
	}
	
	public void shuffle() {
		Random r = new Random();
		Card tmp;
		for (int i = 0; i < cards.size(); i++) {
			int j = r.nextInt(cards.size());
			tmp = cards.get(i);
			cards.set(i, cards.get(j));
			cards.set(j, tmp);
		}
	}
	
	public Deck deal(int count) {
		Deck hand = new Deck();

        int size = cards.size();
        for(int i=size - 1; i >= size - count; i--) {
            hand.addCard(cards.remove(i));
        }
		return hand;
		
	}
}
