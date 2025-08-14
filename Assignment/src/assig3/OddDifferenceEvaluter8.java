package assig3;
import java.util.Scanner;
public class OddDifferenceEvaluter8 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int no1 = s.nextInt();
		
		System.out.println("Enter second Number : ");
		int no2 = s.nextInt();
		
		if(no1%2 == 0 && no2%2 == 0){
			System.out.println("Invalid!");
		}else{
			int abValue = Math.abs(no1 - no2);
			System.out.println("Absolute Difference : " + abValue);
		}
		
	}
}
