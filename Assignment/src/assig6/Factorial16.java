package assig6;

import java.util.Scanner;

public class Factorial16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int fact = 1;
		int i  = n;
		while( i>=1) {
			fact = fact * i;
			i--;
		}
		System.out.println(fact);
		
	}
}
