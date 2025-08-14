package assig7.FunGame;

import java.util.Scanner;

public class GuessNamber_46 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int randomeNumber  = 0;
		int geussN = 0;
		boolean r = false;
		System.out.println("Geuss the number!");
		
		do {
			System.out.println("Enter number 1 to 10 : ");
			geussN = s.nextInt();
			
			randomeNumber = (int)(Math.random() * 10 + 1);
			
			if (geussN == randomeNumber) {
				System.out.println("Correct");
				r = true;
				break;
			}else if(geussN > randomeNumber) {
				System.out.println("High");
			}else {
				System.out.println("Low");
			}
		} while (!(geussN == randomeNumber));
	}
}
