package assig7.NumberBased;

import java.util.Scanner;

public class DecimalToOctal_39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter decimal number: "); 
        int decimal = s.nextInt();
        int octal = 0;
        int place = 1;

        for (int i = 1; decimal != 0; i++) {
            int d = decimal % 8;
            octal = octal + (d * place); 
            place = place * 10;
            decimal = decimal / 8;
        }

        System.out.println("Octal Number : " + octal);
    }
}
