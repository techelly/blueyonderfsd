package classwork.stringexample;

public class StringBufferClassExample {
	public static void main (String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("start");
		System.out.println(sb);
		sb.append("le");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("******************************");
		StringBuffer sb2 = new StringBuffer(25);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println("******************************");
		StringBuffer sb3 = new StringBuffer("aman");
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		
		sb3.insert(4, "kumar");
		System.out.println(sb3);
		sb3.insert(9, "Singh", 0, 5);
		System.out.println(sb3);
		System.out.println(sb3.reverse());
		System.out.println("***************************");
		StringBuffer sb4 = new StringBuffer();
		System.out.println(sb4.capacity());
		sb4.append("Hi How are you ? ");
		System.out.println(sb4.capacity());
		System.out.println("***Delete****");
		sb4.delete(0, sb4.length()-1);
		System.out.println(sb4.capacity());
		
	}
}
