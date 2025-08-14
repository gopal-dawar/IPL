package assig2.Qus4;

public class Calculation{
	public void sphere(){
		double pi = 3.14845;
		int r = 10;
		double csa = 4 * pi * r * r;
		System.out.println("Curved Surface Area sphere: " + csa);
	}
	
	public void cylinder(){
		double pi = 3.14845d;
		int r = 5;
		int h = 10;
		double csa = 2 * pi * r * h;
		System.out.println("Curved Surface Area cylinder : " + csa);
	}
	
	public void cube(){
		int a = 5;
		double csa = 4 * a * a;
		System.out.println("Curved Surface Area cube : " + csa);
	}
	
	public void cuboid(){
		int h = 10;
		int l = 30;
		int b = 3;
		double csa = 2 * h * (l + b );
		System.out.println("Curved Surface Area cuboid : " + csa);	
	}

}