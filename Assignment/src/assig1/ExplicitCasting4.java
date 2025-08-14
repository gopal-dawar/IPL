package assig1;

public class ExplicitCasting4 {
	public static void main(String[] args){
		
		short s1 = 20;
		byte b1 = (byte)s1;
		System.out.println("Short to byte :" +b1);
		
		char c1 = 'a';
		short s2 = (short)c1;
		System.out.println("char to short :"+s2);		
		
		int i1 = 200;
		char c2 = (char)i1;
		System.out.println("int to char :"+c2);

		long l1 = 84395839043l;
		int i2 = (int)l1;
		System.out.println("long to int :"+i2);

		float f1 = 234.234f;
		long l2 = (long)f1;
		System.out.println("float to long :"+l2);
		
		double d1 = 342.243d;
		float f2 = (float)d1;
		System.out.println("double to float :"+f2);
			
		}
}
