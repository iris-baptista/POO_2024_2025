package playlist;

public class MusicaComVariosAutores extends Music {
	private String titulo;
	private String[] autores;
	private Time duracao;	
	
	public MusicaComVariosAutores(String t, String[] a, Time d){
		super(t, d, a[0]);
		this.titulo = t;
		this.autores = a;
		this.duracao = d;
	}

	public String getTitulo() {
		return titulo;
	}

	public String[] getAutores() {
		return autores;
	}

	public Time getDuracao() {
		return duracao;
	}
	
}
