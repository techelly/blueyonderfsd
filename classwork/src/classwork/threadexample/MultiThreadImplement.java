package classwork.threadexample;

public class MultiThreadImplement {
	public static void main(String args[]) {
		new DemoThread3("One");
		new DemoThread3("Two");
		new DemoThread3("Three");
		try {
		      Thread.sleep(10000);
		}
		catch (InterruptedException e) {
		      System.out.println("The Main Thread is Interrupted");
		}
		System.out.println("Main Thread is about to dye");
	}
}