package assig7.NumberBased;

import java.util.Scanner;

public class ReverseEvenCheck_35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int reverse = 0;
		for (int i = 1; n != 0; i++) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		if (reverse % 2 == 0) {
			System.out.println("Reverse Number is even : " + reverse);
		}else {
			System.out.println("Reverse Number is not even : " + reverse);
		}
	}
}
