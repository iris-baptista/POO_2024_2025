package ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class HorarioDuvidas {
	private PriorityQueue<Aluno> semMarcacao = new PriorityQueue<>();
	private List<Aluno> comMarcacao; 
	
	public HorarioDuvidas() {
		semMarcacao = new PriorityQueue<>((a1, a2) -> a1.getNumero() - a2.getNumero());
        comMarcacao = new ArrayList<Aluno>();
	}
	
	public List<Aluno> getComMarcacao() {
		return comMarcacao;
	}

	public PriorityQueue<Aluno> getSemMarcacao() {
		return semMarcacao;
	}
	
	public void marcacao(Aluno a) {
		if(!comMarcacao.contains(a))
			comMarcacao.add(a);
	}
	
	public void chegada(Aluno a) {
		if(!comMarcacao.contains(a))
			semMarcacao.add(a);
	}
		
	public Aluno proximo() {			
		if (!comMarcacao.isEmpty()) {
            return comMarcacao.remove(0); // first in first out
        } else if (!semMarcacao.isEmpty()) {
        	return semMarcacao.poll();    //after priority
        }
        return null; 				      // no more in line
	}

	public static void main(String[] args) {
		HorarioDuvidas h = new HorarioDuvidas();
		Aluno a1 = new Aluno("Ana", 1);
		Aluno a2 = new Aluno("Luis", 2);
		Aluno a3 = new Aluno("Rui", 3);
		Aluno a4 = new Aluno("Rita", 4);
		Aluno a5 = new Aluno("Maria", 5);
		h.marcacao(a1);
		h.marcacao(a3);		
		
		h.chegada(a1);
		h.chegada(a2);
		h.chegada(a3);
		h.chegada(a4);
		h.chegada(a5);
		
		System.out.print("Marcações: ");
		Iterator<Aluno> it1 = h.getComMarcacao().iterator();
        while (it1.hasNext())
            System.out.print(it1.next().toString() + "; ");
        
        System.out.print("\n");
        
        Iterator<Aluno> it2 = h.getSemMarcacao().iterator();
        
        System.out.print("Chegadas: ");
        while(it2.hasNext())
        	System.out.print(it2.next().toString() + "; ");
        for(int i = 0; i < h.getComMarcacao().size(); i++)
        	System.out.print(h.getComMarcacao().get(i).toString() + "; ");
        System.out.print("\n");
        
        
        Iterator<Aluno> it3 = h.getSemMarcacao().iterator();
        Iterator<Aluno> it4 = h.getComMarcacao().iterator();
        
        System.out.print("Atendimento: ");
        while(it3.hasNext() || it4.hasNext())
        	System.out.print(h.proximo().toString() + "; ");
	}
}
