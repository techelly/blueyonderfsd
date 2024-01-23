package classwork.collections.genericsexample;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(1412);
		//listOfInteger.add("Siddharth");
		List list = new ArrayList();
		list.add("Hello");
		list.add(12323);
		for(Object obj:list) {
			System.out.println(obj);
		}
		Integer num = (Integer) list.iterator().next();
		System.out.println(num);
		String s = (String) list.iterator().next();
		System.out.println(s);
	}

}
