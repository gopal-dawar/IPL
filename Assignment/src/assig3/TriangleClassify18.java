package assig3;
import java.util.Scanner;
public class TriangleClassify18 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first side : ");
		int fside = s.nextInt();
		
		System.out.println("Enter second side : ");
		int sside = s.nextInt();
		
		System.out.println("Enter third side : ");
		int tside = s.nextInt();
		
		if(fside == sside && sside == tside){
				System.out.println("Equilateral");
		}else if(fside == sside || sside == tside){
				System.out.println("Isoscals");	
		}else{
			System.out.println("Scalene");
		}
		
		
	}
}
