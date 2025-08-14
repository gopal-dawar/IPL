package assig2.Qus5;

public class Calculation{
	public int a;
	public int s;
	public Calculation(int n){
		a = n;
		s = n;
	}
	public void square(){
		int sq = s * s;
		System.out.println("Square : " + sq);
	}
	public void cube(){
		int c = 4 * a * a;
		System.out.println("Cube : " + c);
	}
}