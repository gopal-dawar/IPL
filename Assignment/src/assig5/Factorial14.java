package assig5;

import java.util.Scanner;

public class Factorial14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int fact = 1; 
		
		for(int i = n; i >= 1;i--) {
			
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
		
	}
}
