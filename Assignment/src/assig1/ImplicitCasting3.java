package assig1;

public class ImplicitCasting3 {
	public static void main(String[] args){

		byte b1 = 10;
		short s1 = b1;
		System.out.println("byte to short :"+s1);		
		
		short s2 = 3;
		char c1 = (char)s2;
		System.out.println("short to char :"+c1);

		char c3 = 'A';
		int i1 = c3;
		System.out.println("char to int :"+i1);

		int i2 = 3054;
		long l1 = i2;
		System.out.println("int to long :"+l1);

		long l2 = 2354028920583l;
		float f1 = l2;
		System.out.println("long to float :"+f1);

		float f2 = 234.1432f;
		double d1 = f2;
		System.out.println("float to double :"+d1);
		
		}
}
