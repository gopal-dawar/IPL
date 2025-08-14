package assig7;

import java.util.Scanner;

public class Tableprint_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int i = 1;
		do {
			System.out.println(i * n);
			i++;
		} while (i <= 10);
	}
}
