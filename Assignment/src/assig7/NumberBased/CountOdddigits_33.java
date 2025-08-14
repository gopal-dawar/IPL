package assig7.NumberBased;

import java.util.Scanner;

public class CountOdddigits_33 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter digits : ");
		int n = s.nextInt();
		int reverse = 0;
		int count = 0;
		for(int i = 1; n != 0;i++) {
			int d = n % 10;
			if(d%2 != 0) {
				count++;
			}
			n = n / 10;
		}
		System.out.println(count);
	}
}
