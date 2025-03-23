package ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Main {
	public static double average(Iterable<Integer> iterable) {
		int total = 0; 
		int i = 0;
		Iterator<Integer> it = iterable.iterator();
		while(it.hasNext()) {
			total = total + it.next();
			i++;
		}
		return( (double) total /i);
	}

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		aList.add(25);
		aList.add(7);
		aList.add(9);
		aList.add(4);
		
		System.out.println(average(aList)); //11.25
		
		LinkedList<Integer> lList = new LinkedList<Integer>();
		
		lList.add(36);
		lList.add(82);
		lList.add(42);
		lList.add(72);
			
		System.out.println(average(lList)); //58.0
		
	}
}
