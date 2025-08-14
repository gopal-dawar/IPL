package assig7.NumberBased;

import java.util.Scanner;

public class RepeatSumDigitsUntil1_34 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
	
		while(n > 9) {
			int sum = 0;
			while( n != 0) {
				int digit = n % 10;
				sum = sum + digit;
				n = n / 10;
			}
			n = sum;
		}
		System.out.println("Sum : " + n);
	}
}
