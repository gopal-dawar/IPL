package assig3;
import java.util.Scanner;
public class AgeChecker7 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		
		if(age > 0 && age <= 12){
			System.out.println("Child");
		}else if(age >= 13 && age <= 17){
			System.out.println("Teen");
		}else if(age >= 18 && age <= 59){
			System.out.println("Adult");
		}else if(age >= 60){
			System.out.println("Senior");
		}
	}
}
