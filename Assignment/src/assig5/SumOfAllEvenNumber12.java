package assig5;

import java.util.Scanner;

public class SumOfAllEvenNumber12 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			if(i%2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of all even number from 1 to " + n + " is " + sum);
	}
}
