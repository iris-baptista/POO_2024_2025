package cards;

import java.util.Comparator;

public enum CardSortingStrategy implements Comparator<Card>{
	BY_SUIT {
		public int compare(Card a, Card b) {
			return b.getSuit().ordinal() - a.getSuit().ordinal();
		}
	},
	
	BY_RANK {
		public int compare(Card a, Card b) {
			return b.getRank().ordinal() - a.getRank().ordinal();
		}
	},
	
	BY_SUIT_AND_THEN_RANK {
		public int compare(Card a, Card b) {
			if(b.getSuit().ordinal() - a.getSuit().ordinal() == 0)
				return b.getRank().ordinal() - a.getRank().ordinal();
			return b.getSuit().ordinal() - a.getSuit().ordinal();
		}
	};
}
