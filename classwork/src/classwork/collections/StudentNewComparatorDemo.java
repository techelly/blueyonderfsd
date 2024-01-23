package classwork.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentNewComparatorDemo {

	public static void main(String[] args) {
		List<StudentNew> studentNewList = new ArrayList<StudentNew>();
		studentNewList.add(new StudentNew(11,"Harry",95.45,21));
		studentNewList.add(new StudentNew(10,"Shally",91.45,20));
		studentNewList.add(new StudentNew(12,"George",85.45,22));
		studentNewList.add(new StudentNew(9,"Bob",51.45,19));
		
		System.out.println(studentNewList);
		Collections.sort(studentNewList, new AgeComparator());
		System.out.println(studentNewList);
		StudentNew studentNew = new StudentNew();
		//Collections.(studentNewList, studentNew::getAge);
		Collections.sort(studentNewList, Comparator.comparing(StudentNew::getMarks));
		System.out.println("********************On the basis of marks ******************");
		System.out.println(studentNewList);
		System.out.println("************************************************");
		Collections.sort(studentNewList);
		
		System.out.println(studentNewList);
	}

}
