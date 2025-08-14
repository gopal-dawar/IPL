package assig7;

import java.util.Scanner;

public class Factorial_16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int fact = 1;
		int i = n;
		do {
			fact = fact * i;
			i--;
		} while (i >= 1);
		System.out.println("Factorial : " + fact);
	}
}
