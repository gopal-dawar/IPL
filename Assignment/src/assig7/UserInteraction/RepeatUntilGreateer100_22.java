package assig7.UserInteraction;

import java.util.Scanner;

public class RepeatUntilGreateer100_22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		do {
			System.out.println("Enter greater than 100 : ");
			n = s.nextInt();
		} while (n <= 100);
		System.out.println("Greater than 100 is : " + n);
	}
}
