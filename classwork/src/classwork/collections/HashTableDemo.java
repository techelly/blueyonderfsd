package classwork.collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String,Double> balance = new Hashtable<String,Double>();
		balance.put("Arun", 3434.34);
		balance.put("Radha",123.22);
		//balance.put(null, null);
		//balance.put("Rakesh", null);
		balance.put(null, 1111.15);
		System.out.println(balance);


	}

}
