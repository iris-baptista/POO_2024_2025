package ex6;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
	private T[] array;
	private int current;
	
	public ArrayIterator(T[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return current < array.length;
	}

	@Override
	public T next() {
		if(!hasNext())
			throw new IllegalStateException("No more elements in array");
		return array[current++];
	}
	
	public static void main(String[] args) {
		String[] sArray = {"a", "b", "c"};
		ArrayIterator<String> it1 = new ArrayIterator<String>(sArray);
		
		System.out.println("Iteracao num array de strings:");  // a b c
		while(it1.hasNext())
			System.out.print(it1.next() + " ");
		
		Integer[] iArray = {1,2,3};
		ArrayIterator<Integer> it2 = new ArrayIterator<Integer>(iArray);
		
		System.out.println("\nIteracao num array de integers:");  // 1 2 3
		while(it2.hasNext())
			System.out.print(it2.next() + " ");
	}
}
