package assig7;

import java.util.Scanner;

public class SumOfEvenNumbers_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int sum = 0;
		int i = 1;
		do {
			if(i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= n);
		System.out.println("Even Sum : " + sum);
	}
}
