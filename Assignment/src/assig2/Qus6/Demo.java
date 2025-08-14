package assig2.Qus6;

public class Demo{
	public static void main(String[] args){
		DataTypes d = new DataTypes();
		
		byte b1 = d.byteType((byte)10);
		System.out.println("Byte Return type : " + b1);
		
		short s = d.shortType((short)34);
		System.out.println("Short Return type : " + s);
		
		char c = d.charType('G');
		System.out.println("Char return type : " + c);
		
		int i = d.intType(10);
		System.out.println("Integer Return type : " + i);
		
		long l = d.longType(2034394823l);
		System.out.println("long return type : " + l);
		
		float f = d.floatType(234.234f);
		System.out.println("float return type : " + f);
		
		double d1 = d.doubleType(233.23452231d);
		System.out.println("Double return type : " + d1);
		
		boolean b2 = d.booleanType(true);
		System.out.println("Boolean return type : " + b2);		
	}
}