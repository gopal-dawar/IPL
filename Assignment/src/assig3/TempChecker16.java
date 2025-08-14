package assig3;
import java.util.Scanner;
public class TempChecker16 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("1. Fahrenheit");
		System.out.println("2. Celsius");
		
		System.out.println("Enter your choice : ");
		double choice = s.nextDouble();
		
		if(choice == 1){
			System.out.println("Enter Celsius : ");
			double c = s.nextDouble();
			double f = (c * 9/5) + 32;
			System.out.println("Fahrenheit : " + f);
		}else if(choice == 2){
			System.out.println("Enter Fahrenheit : ");
			double f = s.nextDouble();
			double c = (f -32) * 5/9;
			System.out.println("Celsius : " + f);
		}
	}
}
