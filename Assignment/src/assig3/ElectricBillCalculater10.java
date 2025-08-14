package assig3;
import java.util.Scanner;
public class ElectricBillCalculater10 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Consumed units : ");
		
		int units = s.nextInt();
		int totalcost = 0;
		if(units > 300) {
			totalcost = units * 10;
			System.out.println("Total Unit cost : " + totalcost);
		}else{
			if(units <= 300 && units > 100){
				totalcost = units * 7;
				System.out.println("Total Unit Cost : " + totalcost);
			}else if(units <= 100){
				totalcost = units * 5;
				System.out.println("Total Unit Cost : " + totalcost);
			}
		}
		
	}
}
