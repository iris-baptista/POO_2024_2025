package main;
import java.util.Scanner; 

public class Main {
	
	static void list(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(i+": "+ args[i]);
		}
	}
	
	static boolean isNumber(String s) {
		if(s == null)
			return false;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c < '0' || c > '9')
				return false;
		}
		return true;
	}
	
	static int soma(String[] args) {
		int n = 0;
		for(int i = 0; i < args.length; i++) {
			if(isNumber(args[i])) {
				int l = args[i].length();
				for(int j = 0; j < l; j++) {
					int c = args[i].charAt(j) - '0';
					n = n + (c * (int)Math.pow(10, l -1 - j));
				}
			}
		}
		return n;
	}
	
	static void checkIntegers(String[] args) {
		int n = 0;
		int i = 0;
		for(int j = 0; j < args.length; j++) {
			if(isNumber(args[j])) {
				i++;
			} else {
				n++;
			}
		}
		System.out.println("Encontrei " + i + " inteiro/s");
		System.out.println("Encontrei " + n + " não-inteiro/s");
		System.out.println("Somatório dos inteiros: "+ soma(args));
	}
	
	static void filterWords(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase = " ";
		while(frase.length() != 0) { 
			System.out.print("frase: ");
		    frase = scanner.nextLine();
		    if(frase.length() == 0) {
		    	scanner.close();
		    	return;
		    } else {
			    for(int i = 0; i < args.length; i++) {
			    	String filtrada = frase.replace(args[i],""); //IS THIS USABLE?
			    	frase = filtrada;
			    }
			    System.out.println("filtrada: "+ frase);
		    }
		}	
	    scanner.close();
	    return;
	}
	
	public static void main(String[] args) {
		//1.1
		//list(args);
		
		//1.2
		//checkIntegers(args);
		
		//1.3
		//filterWords(args); //MUST CHECK IF .replace IS ALLOWED
		
		//1.4
		
	}

}
