package ex4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Separator {
	public static String separatedBy(List<String> list, String s){ //WORKING
		String separated = "";
		separated = list.get(0) + s;
		for(int i = 1; i < list.size() -1; i++) {
			separated = separated + list.get(i) + s;
		}
		separated = separated + list.get(list.size()-1);
		return separated;
	}
	
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();  //WORKING
		List<String> Llist = new LinkedList<String>();	//WORKING
		aList.add("Iris");
		aList.add("Dinis");
		aList.add("Mariana");
		aList.add("Edo");
		
		Llist.add("Iris");
		Llist.add("Dinis");
		Llist.add("Mariana");
		Llist.add("Edo");
		
		String text1 = separatedBy(aList, "|");
		String text2 = separatedBy(Llist, "|");
		
		System.out.println(text1);
		System.out.println(text2);
	}
}
