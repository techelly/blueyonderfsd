package java11and17featuresdaythree.java11features.localvariableinlambda;

import javax.annotation.processing.SupportedAnnotationTypes;

public class EmployeeDemo {

	public static void main(String[] args) {
		CompareTwoObjects cto = (@Nonnull var a,var b)->System.out.println(a,b);

	}

}
