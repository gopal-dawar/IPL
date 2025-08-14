package assig3;

import java.util.Scanner;
public class TriangleValidity4 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first side : ");
		int fside = s.nextInt();
		
		System.out.println("Enter second side : ");
		int sside = s.nextInt();
		
		System.out.println("Enter third side : ");
		int tside = s.nextInt();
		
		int totalSide = fside + sside + tside;
		
		if(fside > 0 && sside > 0 && tside > 0){
			if(totalSide == 180){
				System.out.println("Sum is " + totalSide + " It is a Valid Triangle");
			}else{
				System.out.println("sum of three side is not equal to 180");
			}
		}else{
			System.out.println("Some Values are less than 0, not valide");
		}
		
	}
}
