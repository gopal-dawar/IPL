package assig3;
import java.util.Scanner;
public class TaxCheck15 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter income : ");
		double income = s.nextDouble();
		
		if(income <= 250000){
			System.out.println("No Tax");
		}else if(income < 500000 && income >=250000){
			double tax1 = income * 5/100;
			System.out.println("Tax : " + tax1);
		}else if(income < 1000000 && income >=500000){
			double tax2 = income * 20/100;
			System.out.println("Tax : " + tax2);
		}else if(income >=1000000){
			double tax3 = income * 30/100;
			System.out.println("Tax : " + tax3);
		}
	}
}
