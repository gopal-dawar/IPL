package assig7.SeriesPattern;

import java.util.Scanner;

public class PrintPattern42 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = s.nextInt();
		double sum = 0.0;
		int a = 1;
		for(int i = 1; i <= n;i++) {
			sum = sum + 1.0 /i;
		}
		System.out.println("Sum of the series is : " + sum);
	}
}
