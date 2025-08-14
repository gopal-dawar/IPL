package assig3;

import java.util.Scanner;
public class CheckLarge3Numbers3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number : " );
		int no1 = s.nextInt();
		
		System.out.println("Enter second number : " );
		int no2 = s.nextInt();
		
		System.out.println("Enter third number : " );
		int no3 = s.nextInt();
		
		
		if(no1>no2){
			if(no1> no3){
				System.out.println(no1 + " is large Number");
			}else{
				System.out.println(no3 + " is large Number");
			}
		}else{
			if(no2 > no1){
				if(no2 > no3){
					System.out.println(no2 + " is large Number");
				}else{
					System.out.println(no3 + " is large Number");
				}
			}
		}
	}
}
