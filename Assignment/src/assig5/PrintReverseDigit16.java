package assig5;

import java.util.Scanner;

public class PrintReverseDigit16 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	     int num = sc.nextInt();
	     
	     int reversed = 0;
	     for (int i = 0; num != 0; i++) {
	    	 int digit = num % 10;
	         reversed = reversed * 10 + digit;
	         num = num / 10;
	     }

	     System.out.println("Reversed number: " + reversed);
	}
}
