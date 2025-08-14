package assig7;

import java.util.Scanner;

public class ReverseTheNumber_17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int o = n;
		int r = 0;
		int i = 1;
		
		do {
			int d = n % 10;
			r = r * 10 + d;
			n = n / 10;
			
			i++;
		} while (n != 0);
		System.out.println(r + " is Reverse of "+o);
		
		
	}
}
