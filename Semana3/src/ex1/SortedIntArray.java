package ex1;

import java.util.ArrayList;

public class SortedIntArray{
	private ArrayList<Integer> array;
	private SortingPolicy policy;
	
	public SortedIntArray(SortingPolicy policy) {
		this.array = new ArrayList<>();
		this.policy = policy;
	}
	
	public int size() {
		return array.size();
	}
	
	public void add(int element) {
		array.add(element);
		sort(policy); 
	}
	
	public int get(int index) {
		return array.get(index);
	}
	
	public void sort(SortingPolicy policy) {
		for(int i = 0; i != array.size(); i++)
			for (int j = 1; j != array.size()-i; j++)
				if (policy.isBefore(array.get(j), array.get(j-1))) {
					int aux = array.get(j-1);
					array.set(j-1, array.get(j));
					array.set(j, aux);
				}
	}
	
	public static void main(String[] args) {
		SortedIntArray sortedArray1 = new SortedIntArray(new Descending()); 
		sortedArray1.add(1);
		sortedArray1.add(4);
		sortedArray1.add(2);
		sortedArray1.add(8);
		
		for(int i = 0; i < sortedArray1.size(); i++)
			System.out.println(sortedArray1.get(i));
		
	}
}
