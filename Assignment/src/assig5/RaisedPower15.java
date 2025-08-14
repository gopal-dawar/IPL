package assig5;

import java.util.Scanner;

public class RaisedPower15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter base number : ");
		int base = s.nextInt();
		
		System.out.println("Enter exponent number : ");
		int expo = s.nextInt();
		int pow = base;
		
		if(expo == 0) {
			System.out.println("1");
		}else {
			for(int i = 1;i < expo;i++) {
				base = base * pow;
			}
			System.out.println(base);
		}
	}
}
