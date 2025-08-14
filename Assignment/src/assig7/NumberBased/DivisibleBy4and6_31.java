package assig7.NumberBased;

import java.util.Scanner;

public class DivisibleBy4and6_31 {
	public static void main(String[] args) {
	int i = 101;
	while(true) {
		if(i % 4 == 0 && i % 6 == 0) {
			break;
		}
		i++;
	}
	System.out.println(i + " is divisible by 4 and 6");
	}
}
