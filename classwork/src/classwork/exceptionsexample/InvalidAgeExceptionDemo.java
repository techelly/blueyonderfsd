package classwork.exceptionsexample;

public class InvalidAgeExceptionDemo {
	static int flag = 0;

	// public static void main(String[] args) throws InvalidAgeException {
	public static void main(String[] args) {
		try {
			int age = Integer.parseInt(args[0]);
			if (age < 18) {
				throw new InvalidAgeException();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			flag = 1;
			System.out.println("Exception : " + e);
		} catch (InvalidAgeException e) {
			flag=1;
			System.out.println("Exception : "+ e);
			e.printStackTrace();
		}
		if(flag==0)
			System.out.println("Everything is fine");
	}
}
