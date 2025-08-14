package assig7.UserInteraction;

import java.util.Scanner;

public class RepeatUntilPrime_27 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        boolean b = true;

        do{
			System.out.println("Enter prime number :");
			n = s.nextInt();
			b = true;
			if(n <= 1) {
            b = false;
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    b = false;
                    break;
                }
            }
        }
		}while(!b);

        if(b) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
