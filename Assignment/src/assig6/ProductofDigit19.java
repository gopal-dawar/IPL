package assig6;

import java.util.Scanner;

public class ProductofDigit19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		
		int prod = 1;
		int i = 1;
		while(n != 0) {
			int d = n % 10;
			prod = prod * d;
			n = n / 10;
		}
		
		System.out.println("Product : " + prod);
	}
}
