package assig3;
import java.util.Scanner;
public class ResultCheck11 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Subject marks : ");
		int m1 = s.nextInt();
		
		System.out.println("Enter second Subject marks : ");
		int m2 = s.nextInt();
		
		System.out.println("Enter third Subject marks : ");
		int m3 = s.nextInt();
		
		if(m1 >= 33 && m2 >= 33 && m3 >= 33){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");			
		}
	}
}
