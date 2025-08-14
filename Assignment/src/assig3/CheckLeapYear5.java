package assig3;
import java.util.Scanner;
public class CheckLeapYear5 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any year : ");
		int year = s.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println(year + " is leap year");
		}else{
			System.out.println(year + " is not Leap Year");	
		}
		
	}
}
