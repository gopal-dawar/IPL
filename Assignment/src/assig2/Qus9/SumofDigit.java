package assig2.Qus9;

import java.util.Scanner;

public class SumofDigit{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int no = s.nextInt();
		int sum = 0;
		while(no != 0){
			int digit = no % 10;
			sum = sum + digit;
			no = no / 10;
		}		
		System.out.println("Sum of digit : " + sum);
		
	}
}
