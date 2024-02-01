package java11and17featuresdaythree.java17features.sealedcclasses.solutions;

public sealed class Shape permits Circle, Square, Rectangle, WeirdShape {
	public void displayShape() {
		
		System.out.println("Inside sealed class shape");
	}
}
