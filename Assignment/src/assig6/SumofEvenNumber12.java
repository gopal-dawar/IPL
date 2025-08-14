package assig6;

import java.util.Scanner;

public class SumofEvenNumber12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= n) {
			if( i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("Sum : " +  sum);
	}
}
