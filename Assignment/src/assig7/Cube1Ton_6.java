package assig7;

import java.util.Scanner;

public class Cube1Ton_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int i = 1;
		do {
			System.out.println(i * i * i);
			i++;
		} while (i <= n);
	}
}
