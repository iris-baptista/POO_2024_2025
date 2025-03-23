package cards;

public final class Card {
	private static final Card[] cards;
	private Suit suit;
	private Rank rank;

	static { 
		cards = new Card[Suit.values().length * Rank.values().length];
		for (int i = 0; i != Suit.values().length; i++) {
			for (int j = 0; j != Rank.values().length; j++) {
				cards[Rank.values().length * i + j] = new Card(Suit.values()[i], Rank.values()[j]); 
			}
		}
	}

	public Card(Suit s, Rank r) {
		this.suit = s;
		this.rank = r;
	}

	public static Card[] getCards() {
		return cards;
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}

	public static Card getCard(Suit suit, Rank rank) { 
		Card r = new Card(null, null);
		for (Card c : cards) {
			if (c.suit == r.suit && c.rank == r.rank) {
				r = c;
				break;
			}
		}
		return r;
	}
	
	@Override
	public String toString() {
		return "Card: " + this.suit + ", " + this.rank + ";";
	}
	
	public static void main(String[] args) {
		for(Card c : cards)
			System.out.println(c.toString());
	}
}
