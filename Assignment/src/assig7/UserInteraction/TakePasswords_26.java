package assig7.UserInteraction;

import java.util.Scanner;

public class TakePasswords_26 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String passwords = "";
		int i = 0;
		
		do {
			System.out.println("Enter admin123 as passwords : ");
			passwords = s.next();
		
			if(i >= 3) {
				System.out.println("Approved");
				break;
			}
			
			i++;			
		} while (i<=5);
	}
}
