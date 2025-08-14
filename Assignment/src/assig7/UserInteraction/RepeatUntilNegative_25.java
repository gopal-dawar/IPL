package assig7.UserInteraction;

import java.util.Scanner;

public class RepeatUntilNegative_25 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int marks = 0;
		int i = 1;
		int count = 0;
		int total = 0;
		do {
			System.out.println("Enter marks : ");
			marks = s.nextInt();
			if (marks >= 1) {
				total = total + marks;
				count++;
			}
			i++;
		} while (marks > 0);
		
		if(count > 0) {
			double  average = total / count;
			System.out.println("Average : " + average);
		}
	}
}	
