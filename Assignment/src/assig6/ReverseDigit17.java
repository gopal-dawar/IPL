package assig6;

import java.util.Scanner;

public class ReverseDigit17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int reverse = 0;
		int i = 1;
		while(n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;			
		}
		
		System.out.println(reverse);
	}
}
