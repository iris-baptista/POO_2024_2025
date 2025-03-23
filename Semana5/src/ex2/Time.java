package ex2;

public class Time {
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
	
	public static void main(String[] args) {
		Time t1 = new Time(2, 33);
		Time t2 = new Time(3, 49);
		System.out.println(t1.toString(t1.addTime(t2)));
	}
	
	
}
