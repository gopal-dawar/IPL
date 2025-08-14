package assig7.SeriesPattern;

import java.util.Scanner;

public class TribonacciSeries_43 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		for(int i = 1;i<=n;i++) {
			System.out.println( a + " ");
			int next = a + b + c;
			a = b;
			b = c;
			c = next;
		}
	}
}
