package assig7;

import java.util.Scanner;

public class MinimumDigit_20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		
		int i = 0;
		int min = 9;
		do {
			int d = n % 10;
			if(d < min) {
				min = d;
			}
			n = n / 10;
			i++;
		} while (n != 0);
		System.out.println("Minimum Number : " + min);
	}
}
