package assig6;

import java.util.Scanner;

public class CountNumberofDigits14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int i = 0;
		if(n==0) {
			i = 1;
		}else {
			while(n != 0) {
			n = n / 10;
			i++;
			}
		}
		System.out.println("Count : " + i);
	
	}
}
