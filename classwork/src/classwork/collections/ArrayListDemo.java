package classwork.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> listOfInteger = new ArrayList<Integer>();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		System.out.println(listOfInteger.size());
		//System.out.println(listOfStrings.ensureCapacity(0));
		listOfInteger.add(15);
		listOfInteger.add(null);
		listOfInteger.add(null);
		listOfInteger.add(156);
		//listOfInteger.add("Hi");
		
		for(Integer i : listOfInteger) {
			System.out.println(i);
		}
		System.out.println(listOfInteger.size());
		System.out.println(listOfInteger.get(1));
		System.out.println("*********************************");
		Iterator<Integer> itr = listOfInteger.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
