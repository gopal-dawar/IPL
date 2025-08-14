package assig5;

import java.util.Scanner;

public class FourCubes18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		int cube = 1;
		for(int i = 1;i<=n;i++) {
			cube = i * i * i;
			System.out.println("Number is : " + i + " and cube of "+ i + " is : " + cube);
		}
		
	}
}
