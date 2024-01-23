package classwork.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		v.add("Hi");
		v.add("Hello");
		v.add("Good");
		v.add("Morning");
		v.add("Break");
		v.add("De");
		v.add("Do");
		v.add("Bus");
		v.add("Karo");
		v.add("Bye!!");
		v.add("Take a break");
		System.out.println(v.capacity());
	}

}
