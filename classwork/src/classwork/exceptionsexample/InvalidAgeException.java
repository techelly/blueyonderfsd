package classwork.exceptionsexample;

public class InvalidAgeException extends Exception{
	
	public InvalidAgeException() {
		System.out.println("User defined exception thrown");
	}

	@Override
	public String toString() {
		return "MyException Object : Age cannot be < 18 " ;
	}
	
	
}
