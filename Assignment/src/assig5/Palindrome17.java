package assig5;

import java.util.Scanner;

public class Palindrome17 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	     int num = sc.nextInt();
	     int original = num;
	     
	     int reversed = 0;
	     
	     for (int i = 0; num != 0; i++) {
	    	 int digit = num % 10;
	         reversed = reversed * 10 + digit;
	         num = num / 10;
	     }
	     
	     if (original == reversed) {
		     System.out.println("Palindrome number: " + reversed);
		}else {
			System.out.println("Not Palindrome number: " + reversed);
		}
	}
}
