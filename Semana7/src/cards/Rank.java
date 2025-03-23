package cards;

public enum Rank {
	Às(11), Rei(4), Valete(3), Dama(2), 
	Dez(0), Nove(0), Oito(0), 
	Sete(10), Seis(0), Cinco(0), Quatro(0), Três(0), Dois(0);
	
	private final int value; 
	
	private Rank(int value) {
		this.value = value;
	}
	
	public boolean belongsTo40Deck() {
		return this != Dez || this != Nove || this != Oito;
	}

	public int value() {
		return this.value;
	}
}