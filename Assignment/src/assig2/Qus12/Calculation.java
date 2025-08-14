package assig2.Qus12;

public class Calculation{
	public double percentage(int m1, int m2, int m3, int m4, int m5){
		int totalper = (m1 + m2 + m3 + m4 + m5);
		double per = (totalper / 500.0) * 100;
		return per;
	}
}