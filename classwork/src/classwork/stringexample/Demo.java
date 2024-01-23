package classwork.stringexample;

public class Demo {
    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        
        String str2 = new String(str);
        String str3 = str; 
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
		/*
		 * if(str2 === str) {
		 * 
		 * }
		 */
        
        str2.compareTo(str3);
        str2.substring(0, 0);
       System.out.println(str2.concat(str3)); 
       System.out.println(str2+str3); 
       str2.strip();
    }
}
