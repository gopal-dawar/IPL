package assig7.SeriesPattern;

import java.util.Scanner;

public class PrintPattern41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int a = 2;
		for(int i = 1;i <= n; i++) {
			System.out.println(a);
			int next = a + a;
				a = next;
			
		}
	}
}
