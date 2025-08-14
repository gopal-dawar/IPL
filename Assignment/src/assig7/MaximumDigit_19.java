package assig7;

import java.util.Scanner;

public class MaximumDigit_19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int max = 0;
		int i = 1;
		do {
			int d = n % 10;
			if(d > max) {
				max = d;
			}
			n = n / 10;
			i++;
		} while (n != 0);
		System.out.println("Maximum Digit : " + max);
	}
}
