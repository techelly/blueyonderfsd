package classwork.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vs = new Vector<String>();
		//vs.add(5);//Compilation error
		vs.add("Hello");
		
		String s = vs.get(0);
		
		ArrayList<Integer> ao = new ArrayList<Integer>();
		
		ArrayList<Number> an = new ArrayList<Number>();
		an.add(5);
		an.add(1000L);
		//an.add(new String(“hello”)); // compile error
		Number n = an.get(0);
		Number nf = an.get(1);
		System.out.println(n+" --- "+nf);
		
		/**
		Integer nInt = an.get(0);
		Long nfLong = an.get(1);
		System.out.println(n+" --- "+nf);
		**/
		Integer nm = 5;
		int i = nm.intValue();
		String s1 = "12232";
		int x = Integer.valueOf(s1);
;	}

}
