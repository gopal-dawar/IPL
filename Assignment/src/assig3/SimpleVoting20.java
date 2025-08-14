package assig3;

import java.util.Scanner;

public class SimpleVoting20 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		
		System.out.println("Enter your Citizenship status y/n : ");
		char c = s.next().charAt(0);
		
		if(age >= 18 && (c == 'y' || c == 'Y')){
			System.out.println("Eligible for vote");
		}else{
			System.out.println("Not Eligible for vote");
		}
	}
}
