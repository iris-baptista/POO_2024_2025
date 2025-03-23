package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Time implements Comparable<Time>{
	private final int minutos;
	private final int segundos;
	
	
	public Time(int m, int s) {
		this.minutos = m;
		this.segundos = s;
	}
	
	public Time(String t) {
		String[] s = t.split(":");
		this.minutos = Integer.parseInt(s[0]);
		this.segundos = Integer.parseInt(s[1]);
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}
	
	public int totalSegundos() {
		return minutos*60 + segundos;
	}
	
	public Time addTime(Time a) {
		int minutos = this.getMinutos() + a.getMinutos();
		int segundos = this.getSegundos() + a.getSegundos();
		if(segundos > 60) {
			int extra = segundos/60;
			minutos = minutos + extra;
			segundos = segundos - extra*60;
		}
		return new Time(minutos, segundos);
	}
	
	public Time subtractTime(Time a) {   
		int totalSegundos = this.totalSegundos() - a.totalSegundos();
        if (totalSegundos < 0) 
            throw new IllegalArgumentException("");
        int newMinutos = totalSegundos / 60;
        int newSegundos = totalSegundos % 60;
        return new Time(newMinutos, newSegundos);
	}

	public boolean isSmaller(Time a) {
		if(a.getMinutos() >= this.getMinutos())
			return true;
		else
			if(a.getSegundos() > this.getSegundos())
				return true;
		return false;
	}
	
	public boolean isLarger(Time b) {
		if(b.getMinutos() <= this.getMinutos())
			return true;
		else
			if(b.getSegundos() > this.getSegundos())
				return true;
		return false;
	}
	
	public String toString(Time t) {
		String s = "" + t.getMinutos();
		s = s + ":";
		s = s + t.getSegundos();
		return s;
	}
	
	@Override
	public int compareTo(Time o) {
		return this.totalSegundos() - o.totalSegundos();
	}
	
	public static void main(String[] args) {
		List<Time> tList = new ArrayList<>();
		Time t1 = new Time(2, 33);
		Time t2 = new Time(3, 49);
		Time t3 = new Time(7, 29);
		
		tList.add(t2);
		tList.add(t3);
		tList.add(t1);
		
		System.out.println("ORDEM ORIGINAL");
		for(int i = 0; i < tList.size(); i++) {
			Time t = tList.get(i);
			String s = t.toString(t);
			System.out.println(s);
		}
		System.out.println("");
		
		Collections.sort(tList);
		System.out.println("ORDEM ASCENDENTE");
		for(int i = 0; i < tList.size(); i++) {
			Time t = tList.get(i);
			String s = t.toString(t);
			System.out.println(s);
		}
		System.out.println("");
		
		Collections.sort(tList, Collections.reverseOrder()); 
		System.out.println("ORDEM DESCENDENTE");
		for(int i = 0; i < tList.size();  i++) {
			Time t = tList.get(i);
			String s = t.toString(t);
			System.out.println(s);
		}
	}	
}
