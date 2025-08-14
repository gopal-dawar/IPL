package assig5;

import java.util.Scanner;

public class SumOfAllNaturalNumber11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = s.nextInt();
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of natural number From 1 to " + n + " is " + sum );
	}
}
