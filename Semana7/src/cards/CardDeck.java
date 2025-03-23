package cards;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CardDeck {
	private List<Card> cards;
	
	// a)
	public CardDeck() {
		this.cards = new ArrayList<Card>();
	}
	
	// b)
	public int totalCards() {
		return cards.size();
	}
	
	// c)
	public void addCard(Card c) {
		cards.add(c);
	}
	
	// d) 
	public Iterator<Card> iterate(){
		return cards.iterator();
	}
	
	// e)
	public void removeCard(Card c) {
		cards.remove(c);
	}
	
	// f)
	public CardDeck(Predicate<Card> p) {
		this.cards = new ArrayList<>();
		for (int i = 0; i != Suit.values().length; i++) {
			for (int j = 0; j != Rank.values().length; j++) {
				Card c = new Card(Suit.values()[i], Rank.values()[j]);
				if(p == null)
					cards.add(c);
				if(p.test(c))
					cards.add(c);
			}
		}			
	}
	
	// g)
	public void shuffle() {
		java.util.Collections.shuffle(cards);
	}
	
	// h)
	public void order(Comparator<Card> comp) { 
		cards.sort(comp);
	}
	
	public static void  main(String[] args) {
	   CardDeck deck = new CardDeck();
	   deck.addCard(new Card(Suit.Paus, Rank.Às));
	   deck.addCard(new Card(Suit.Copas, Rank.Rei));
	   deck.addCard(new Card(Suit.Espadas, Rank.Dama));
	   System.out.println("Numero de cartas: " + deck.totalCards());
	   System.out.println(""); 
	   
	   Iterator<Card> iterator = deck.iterate();
	   while (iterator.hasNext()) {
		   Card card = iterator.next();
	       System.out.println(card);
	   }

	   deck.shuffle();

	   System.out.println(""); 
	   System.out.println("DEPOIS DO SHUFFLE");
	   System.out.println(""); 
	   Iterator<Card> iterator2 = deck.iterate();
	   while (iterator2.hasNext()) {
		   Card card = iterator2.next();
	       System.out.println(card);
	   }

	   deck.order((a,b)->b.getRank().value()-a.getRank().value());
	   System.out.println("");
	   System.out.println("DEPOIS DE ORDENAR POR RANK"); 
	   System.out.println(""); 

        Iterator<Card> iterator3 = deck.iterate();
        while (iterator3.hasNext()) {
            Card card = iterator3.next();
            System.out.println(card);
        }
        
        System.out.println("");
        System.out.println("TESTE COM PREDICATE");
        System.out.println("");
        
        CardDeck d = new CardDeck(c -> c.getRank().value() > 4);
        Iterator<Card> iterator4 = d.iterate();
        while (iterator4.hasNext()) {
            Card card = iterator4.next();
            System.out.println(card);
        }
        
	}
}	
