package assig2.Qus3;

public class Calculation{
	public void calculateSquare(int s){
		int square = s * s;
		System.out.println("Area of Square : " + square);
	}
	public void calculateRectangle(int l, int w){
		int rectangle = l * w;
		System.out.println("Area of Rectangle : " + rectangle);
	} 
	public void calculateCircle(int r,double pi){
		double circle = pi * r * r;
		System.out.println("Area of Circle : " + circle);
	}
	public void calculateRhombus(double l, double w){
		double rhombus = (l * w) * (1/2);
		System.out.println("Area of Rhombus : " + rhombus);
	}
}