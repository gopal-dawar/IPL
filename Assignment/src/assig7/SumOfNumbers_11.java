package assig7;

import java.util.Scanner;

public class SumOfNumbers_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= n);
		System.out.println("Sum : " + sum);
	}
}
