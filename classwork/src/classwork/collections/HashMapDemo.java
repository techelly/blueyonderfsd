package classwork.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put(null, "Abhilash");
		System.out.println(map);
		map.put(null,"Reshma");
		System.out.println(map);
		map.put("Aryan","K");
		map.put("Vindhya",null);
		map.put(null, null);

		System.out.println(map);
	}

}
