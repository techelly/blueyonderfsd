package classwork.exceptionsexample;

import java.util.Scanner;

public class ParseInts {

	public static void main(String[] args) {
		int val,sum=0;
		Scanner scan = new Scanner(System.in);
		String line;
		System.out.println("Enter a line of text");
		Scanner scanLine = new Scanner(System.in);
		while(scanLine.hasNext()) {
			val= Integer.parseInt(scanLine.next());
			sum+=val;
		}
		System.out.println("The sum of the integers on this Line is "+sum);

	}

}
