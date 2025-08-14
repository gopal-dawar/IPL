package assig7.FunGame;

import java.util.Scanner;

public class NumberLock_49 {
	public static void main(String[] args) {
		final int correctPIN = 1234;
		Scanner scanner = new Scanner(System.in);
		int enteredPIN;

		do {
			System.out.print("Enter 4-digit PIN: ");
			enteredPIN = scanner.nextInt();

			if (enteredPIN != correctPIN) {
				System.out.println("❌ Incorrect PIN. Try again.\n");
			}

		} while (enteredPIN != correctPIN);

		System.out.println("✅ Access Granted! Welcome Gopal Sir!");
	}
}
