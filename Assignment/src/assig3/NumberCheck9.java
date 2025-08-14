package assig3;
import java.util.Scanner;
public class NumberCheck9 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		double no = s.nextDouble();
		
		if(no < 0){
			System.out.println("Negative");
		}else if(no == 0){
			System.out.println("Zero");
		}else if(no > 0){
			System.out.println("Positive");
		}
	}
	
}
