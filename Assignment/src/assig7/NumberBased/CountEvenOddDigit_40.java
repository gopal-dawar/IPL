package assig7.NumberBased;

import java.util.Scanner;

public class CountEvenOddDigit_40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int even = 0;
		int odd = 0;
		
		for(int i = 1; n != 0;i++) {
			int d = n % 10;
			if(d % 2 == 0) {
				even++;
			}else {
				odd++;
			}
			n = n / 10;
		}
		if(even > odd) {
			System.out.println("More Even Digits ");
		}else {
			if (even == odd) {
				System.out.println("even and Odd both are same digits ");
			}else {
				System.out.println("More Odd Digits ");
			}
		}
	}
}
