package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Album {
	private String name;
	private int year;
	private List<String> artists;
	private List<Song> songs;
	
	public static class Song {
		private String nome;
		private Time duration;
		private int trackNumber;
		
		public Song(String nome, Time duration, int trackNumber) {
			this.nome = nome;
			this.duration = duration;
			this.trackNumber = trackNumber;
		}

		public String getNome() {
			return nome;
		}
		
		public Time getDuration() {
			return duration;
		}
		
		public int getTrackNumber() {
			return trackNumber;
		}
	}
	
	public Album(String name, int year, List<String> artists, List<Song> songs) {
		this.name = name;
		this.year = year;
		this.artists = artists;
		this.songs = songs;
	}

	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	
	public List<String> getArtists() {
		return artists;
	}
	
	public List<Song> getSongs() {
		return songs;
	}
	
	static Album load(File f) {
		List<String> aList = new ArrayList<String>();
		List<Song> sList = new ArrayList<Song>();
		Album a = new Album("", 0, aList,sList);
		try {
			Scanner scanner = new Scanner(f);
			String nome = scanner.nextLine();
			int ano = Integer.parseInt(scanner.nextLine());
			List<String> artists = new ArrayList<String>();
			List<Song> songs = new ArrayList<Song>();
			while(scanner.nextLine() != "")
				artists.add(scanner.nextLine());
			while(scanner.nextLine() != "") {
				int n = 1;
				String line = scanner.nextLine();
				String[] s = line.split(" ");
				Time t = new Time(s[0]);
				Song song = new Song(s[1], t, n);
				songs.add(song);
				n++;
			}
			a = new Album(nome, ano, artists, songs);
			scanner.close();
		}
		catch(FileNotFoundException e) {
			System.err.println("Erro a abrir ficheiro");
		}
		return a;
	}
	
	public Time getDuration() {
		Time total = new Time(0,0);
		for(Song s : songs) 
			total = total.addTime(s.duration);
		return total;
	}
	
	public void sortOrder() {
		songs.sort((s1, s2) -> s1.trackNumber - s2.trackNumber); // ordem de faixa
	}
	
	public void sortDuration() {
		songs.sort((s1, s2) -> s1.getDuration().totalSegundos() - s2.getDuration().totalSegundos()); // ordem de duração
	}
	
	public void sortAlphabetically() {
		Comparator<String> comp = String.CASE_INSENSITIVE_ORDER;
		songs.sort((s1, s2) -> comp.compare(s1.getNome(), s2.getNome())); // ordem alfabetica 
	}
	
	public static void main(String[] args) {
		
	}
}
