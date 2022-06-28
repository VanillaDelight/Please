import java.util.ArrayList;

public class BlackjackHand {
	public Deck deck;
	
	public void addCard(BlackjackCard blackjackCard) {
		deck.addCard(blackjackCard);
	}

	public int getValue() {
		ArrayList<Card> cards = deck.getCards();
		for (Card c : cards) {
			if (c instanceof BlackjackCard) {
				((BlackjackCard) c).getValue();
			}
			
		}
	}

}
