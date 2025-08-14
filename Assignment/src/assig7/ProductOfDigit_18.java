package assig7;

import java.util.Scanner;

public class ProductOfDigit_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		int prod = 1;
		int i = 1;
		do {
			int d = n % 10;
			prod = prod * d;
			n = n / 10;
		} while (n != 0);
		System.out.println("Product : " + prod);
	}
}
