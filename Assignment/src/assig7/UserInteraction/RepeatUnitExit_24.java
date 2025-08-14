package assig7.UserInteraction;

import java.util.Scanner;

public class RepeatUnitExit_24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String choice = "";
		do {
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. Exit");
			System.out.println("Enter your choice : ");
			choice = s.next();

		} while (!choice.equals("Exit"));
		System.out.println("Loop Exit");
	}
}
