package classwork.exceptionsexample;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		int x,a;
		try {
			x=1;
			a=22/x;
			System.out.println("This will be not bypassed");
		}catch(ArithmeticException ae ) {
			System.out.println("Division by zero");
		}finally {
			System.out.println("Inside finally");
			try {
				x=0;
				a=15/x;
				System.out.println("This will be bypassed");
			}
			//System.out.println("Hello");
			catch(ArithmeticException ae) {
				System.out.println("Division by zero inside outer finally");
			}finally {
				System.out.println("Inside inner finally");
			}
		}
		System.out.println("After catch statement");
	}

}
