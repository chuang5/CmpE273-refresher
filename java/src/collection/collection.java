package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class collection {
	ArrayList<Integer> list;
	public collection() {
		list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(i, (i*9+3));
		}
	}
	
	public boolean contain(int i) {
		boolean value = list.contains(i);;
		return value;
	}
	
	public int get(int i) {
		int value = list.get(i);
		return value;
	}
	
	public String printList() {
		Iterator<Integer> it = list.iterator();
		String listStr = "";
		while(it.hasNext()) {
			String iteratorValue = it.next().toString();
			listStr += iteratorValue + " ";
		}
		return listStr;
	}
	public static void main(String[] args) {
		collection object = new collection();
		
		System.out.println("List contains 67: " + object.contain(67));
		System.out.println("Get index at 4: " + object.get(4));
		System.out.println("Print list: " + object.printList());
	}
}
