package assig7;

import java.util.Scanner;

public class SumOfDigits_14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int i = 1;
		int count = 0;
		do {
			n = n / 10;
			count++;
			
			i++;
		} while (n != 0);
		System.out.println("Count : " + count);
	}
}
