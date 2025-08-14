package assig2.Qus2;

public class Demo{
	public static void main(String[] args){
		SimpleInterest s = new SimpleInterest();
		int r = s.rateInterest(2);
		int p = s.amount(10000);
		int t = s.period(3);
		
		int interest = ( p * r * t)/ 100;
		System.out.println("Simple Interest : " + interest);
		
	}
}