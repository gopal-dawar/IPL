package assig7;

import java.util.Scanner;

public class SumOfDigit_15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int i = 1;
		int sum = 0;
		do {
			int d  = n % 10;
			sum = sum + d;
			n = n / 10;
			i++;
		} while (n != 0);
		System.out.println("Sum : " + sum);
	}
}
