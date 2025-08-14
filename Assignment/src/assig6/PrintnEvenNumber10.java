package assig6;

import java.util.Scanner;

public class PrintnEvenNumber10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int i = 1;
		while(i <= n) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
