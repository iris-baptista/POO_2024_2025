package stand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.io.File;
import java.io.FileNotFoundException;

public class Stand {
	private List<Veiculo> veiculos;
	private String nomeStand;
	
	public Stand(String s) {
		this.nomeStand = s;
		this.veiculos = new ArrayList<>();
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public String getNomeStand() {
		return nomeStand;
	}
	
	public void lerVeiculos(String fileName){
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while(scanner.hasNext()) {
				String[] s = scanner.nextLine().split(";");
				String m = s[0];
				int p = Integer.parseInt(s[1]);
				Data d = new Data(s[2]);
				if(Integer.parseInt(s[3]) == 2) {
					this.veiculos.add(new Mota(m,p,d));
				} else {
					this.veiculos.add(new Carro(m,p,d));
				}
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			System.err.println("Erro a abrir ficheiro");
		}
	}
	
	public int totalValor() {
		int total = 0;
		for(Veiculo v : veiculos)
			total = total + v.getPreco();
		return total;
	}
	
	public List<Veiculo> filtrarVeiculo(Predicate<Veiculo> p){
		List<Veiculo> l = new ArrayList<Veiculo>();
		for(Veiculo v : veiculos) {
			if(p.test(v))
				l.add(v);
		}
		return l;
	}
	
	@Override
	public String toString() {
		String s = getNomeStand() + "\nVeiculos: \n";
		int n = 1;
		for(Veiculo v : veiculos) {
			s = s + "(" + n + ") " + v.toString() + "\n";
			n++;
		}
		s = s + "Valor total do no stand = " + totalValor() + "€";
		return s;
	}
}
