package assig7.SeriesPattern;

import java.util.Scanner;

public class TrianglePattern_45 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row number : ");
		int n = s.nextInt();
		
		for(int i = 1; i <= n;i++) {
			for(int j = 1; j <= i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
