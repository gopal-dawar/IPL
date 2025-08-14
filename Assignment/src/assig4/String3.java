package assig4;

public class String3 {
public static void main(String[] args) {
	String s1 = "Gopal";
	String s2 = "Gopal";
	
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	
	
	String s3 = new String("Dawar");
	String s4 = new String("Dawar");
	
	System.out.println( s3 == s4);
	System.out.println(s3.equals(s4));
}
}
