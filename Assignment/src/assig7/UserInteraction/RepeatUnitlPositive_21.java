package assig7.UserInteraction;

import java.util.Scanner;

public class RepeatUnitlPositive_21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter positive number: ");
            n = s.nextInt();
        } while (n <= 0); 

        System.out.println("You entered: " + n);
    }
}
