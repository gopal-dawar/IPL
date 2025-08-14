package assig3;
import java.util.Scanner;
public class OddEvenChainReaction19 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int no1 = s.nextInt();
		
		System.out.println("Enter Second Number : ");
		int no2 = s.nextInt();
		
		System.out.println("Enter Third Number : ");
		int no3 = s.nextInt();
		
		if(no1%2 == 0 && no2%2 == 0 && no3%2 == 0){
			System.out.println("Even Chain");
		}else if(no1%2 != 0 && no2%2 != 0 && no3%2 != 0){
			System.out.println("Odd Chain");
		}else{
			System.out.println("Mixed Chain");
		} 
	}
}
