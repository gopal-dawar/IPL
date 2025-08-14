package assig6;

import java.util.Scanner;

public class PrintTable5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number to print table : ");
		int n = s.nextInt();
		int i = 1;
		while(i <= 10) {
			System.out.println(i * n);
			i++;
		}
	}
}
