package assig7.UserInteraction;

import java.util.Scanner;

public class ValideAge1To120_28 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = s.nextInt();
		do {
			System.out.println("Enter valide age between 1 and 120 : ");
			age = s.nextInt();
		} while (age<1 || age > 120);
		System.out.println("Valide Age ");
	}
}
