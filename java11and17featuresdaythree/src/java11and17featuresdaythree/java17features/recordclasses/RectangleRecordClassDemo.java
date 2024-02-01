package java11and17featuresdaythree.java17features.recordclasses;

public class RectangleRecordClassDemo {

	public static void main(String[] args) {
		RectangleRecordClass rrc = new RectangleRecordClass(5.0,5.0);
		
		Rectangle r = new Rectangle(1.0, 5.0);
		System.out.println(r.message);
		System.out.println(Rectangle.message);
		
		RectangleNew rn = new RectangleNew(100.00, 500.00);
		

	}

}
