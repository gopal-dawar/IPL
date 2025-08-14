package assig5;

import java.util.Scanner;

public class PrintTableReverse4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = s.nextInt();
		for(int i = 10;i >= 1;i--) {
			System.out.println(i*n);
		}
	}
}
