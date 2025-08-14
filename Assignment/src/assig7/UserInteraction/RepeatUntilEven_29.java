package assig7.UserInteraction;

import java.util.Scanner;

public class RepeatUntilEven_29 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = s.nextInt();
		do {
			System.out.println("Enter even number : ");
			n = s.nextInt();
		} while (n%2 != 0);
		System.out.println("Finally entered even number");
	}
}
