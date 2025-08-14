package assig7.NumberBased;

import java.util.Scanner;

public class BinaryToDecimal_38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int binary = s.nextInt();
        int power = 0;
        int sum = 0;
        for(int i = 1;binary != 0;i++) {
        	int d = binary % 10;
        	sum = (int)(sum +  d * Math.pow(2, power));
        	power++;
        	binary = binary / 10;
        }
        System.out.println("Decimal Number : " + sum);
    }
}
