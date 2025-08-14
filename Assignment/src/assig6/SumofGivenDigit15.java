package assig6;

import java.util.Scanner;

public class SumofGivenDigit15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		
		int sum = 0;
		int i = 1;
		while(n != 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		System.out.println(sum);
		
	}
}
