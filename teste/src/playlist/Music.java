package playlist;

public abstract class Music {
	private final String titulo;
	private final Time duracao;
	private final String autor;
	
	public Music(String t, Time d, String a) {
		this.titulo = t;
		this.duracao = d;
		this.autor = a;
	}

	public String getTitulo() {
		return titulo;
	}

	public Time getDuracao() {
		return duracao;
	}

	public String getAutor() {
		return autor;
	}
	
	public boolean hasAutor(String a) {
		return autor.equals(a);
	}
	
	@Override
	public String toString() {
		return titulo + "," + duracao + "," + getAutor();
	}
}
