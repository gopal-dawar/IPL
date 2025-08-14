package assig7;

import java.util.Scanner;

public class Reverse1Ton_9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		
		int i = n;
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);
	}
}
