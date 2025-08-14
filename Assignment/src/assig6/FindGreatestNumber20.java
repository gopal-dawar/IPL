package assig6;

import java.util.Scanner;

public class FindGreatestNumber20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		
		int max = 0;
		int i = 1;
		while(n != 0) {
			int digit = n % 10;
			if(digit > max) {
				max = digit;
			}
			n = n / 10;
			i++;
		}
		System.out.println("Large digit : " + max);
		
		
		
	}
}
