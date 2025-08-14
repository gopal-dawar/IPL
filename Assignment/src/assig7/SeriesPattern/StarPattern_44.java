package assig7.SeriesPattern;

import java.util.Iterator;
import java.util.Scanner;

public class StarPattern_44 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = s.nextInt();
		
		
		for(int i = 1; i <= n;i++) {
			for(int j = 1; j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
