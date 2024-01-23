package classwork.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer,Employee> mapOfEmp = new TreeMap<Integer, Employee>();
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Ayush");
		
		Employee e1 = new Employee();
		e1.setEmpId(15);
		e1.setEmpName("Jyotika");
		
		Employee e2 = new Employee();
		e2.setEmpId(11);
		e2.setEmpName("Ayush");
		
		mapOfEmp.put(10, e);
		mapOfEmp.put(9, e1);
		mapOfEmp.put(11, e2);
		
		System.out.println(mapOfEmp);
	}

}
