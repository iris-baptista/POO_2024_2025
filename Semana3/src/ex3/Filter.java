package ex3;

import java.util.LinkedList;

public class Filter {
	private LinkedList<String> list;
	private CriterioDeSelecao<String> policy;
	
	public Filter(CriterioDeSelecao<String> policy) {
		this.list = new LinkedList<>();
		this.policy = policy;
	}
	
	public void add(String element) {
		list.add(element);
	}
	
	public LinkedList<String> filterWords(LinkedList<String> list) {
		LinkedList<String> filtered = new LinkedList<>();
		for(String word : list)
			if(policy.cumpreOCriterio(word)) 
				filtered.add(word);
		return filtered;
	}
	
	public static void main(String[] args) {
		//Filter filtered = new Filter(new Contains());
		Filter filtered = new Filter(new Menor3());
		filtered.add("Ola");
		filtered.add("iris");
		filtered.add("rir");
		filtered.add("ir");
		filtered.add("Prius");
		filtered.add("li");
		
		for(String word : filtered.filterWords(filtered.list))
			System.out.println(word);
		
	}
}
