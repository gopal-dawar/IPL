package assig7.NumberBased;

import java.util.Scanner;

public class PrintDigitrightToLeft_36 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int reverse = 0;
		int i = 1;
		do {
			int digit = n % 10;
			System.out.print(digit + " ");
			reverse = reverse * 10 + digit;
			
			n = n / 10;
		} while (n != 0);
	}
}
