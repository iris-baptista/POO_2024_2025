package ex4;

import java.util.LinkedList;

public class Filter {
	private LinkedList<String> list;
	
	public Filter() {
		this.list = new LinkedList<>();
	}
	
	public void add(String element) {
		list.add(element);
	}
	
	public static LinkedList<String> filterWords(LinkedList<String> list, CriterioDeSelecao<String> policy1) {
		LinkedList<String> filtered = new LinkedList<>();
		for(String word : list)
			if(policy1.cumpreOCriterio(word)) 
				filtered.add(word);
		return filtered;
	}
	
	public static void main(String[] args) {  //WORKING
		Filter filtered = new Filter();
		filtered.add("Ola");
		filtered.add("iris");
		filtered.add("rir");
		filtered.add("ir");
		filtered.add("Prius");
		filtered.add("li");
		
		for(String word : Filter.filterWords(filtered.list, (element) -> element.length() < 3))
			System.out.println(word);
		
		for(String word : Filter.filterWords(filtered.list, (element) -> element.startsWith("i")))
			System.out.println(word);
	}
}
