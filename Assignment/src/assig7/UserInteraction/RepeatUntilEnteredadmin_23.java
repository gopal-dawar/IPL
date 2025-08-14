package assig7.UserInteraction;

import java.util.Scanner;

public class RepeatUntilEnteredadmin_23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = s.next();
		int i = 1;
		do {
			System.out.println("Enter correct username : ");
			username = s.next();
			i++;
		} while (!username.equals("admin"));
		System.out.println("Approved");
	}
}
