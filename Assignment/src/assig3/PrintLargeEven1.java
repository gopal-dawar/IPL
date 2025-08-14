package assig3;

import java.util.Scanner;
public class PrintLargeEven1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int no1 = s.nextInt();
		
		System.out.println("Enter second number : ");
		int no2 = s.nextInt();
		
		if(no1 > no2){
			if(no1%2 == 0){
				System.out.println(no1 + " is even and large number");
			}else if(no2%2 == 0){
				System.out.println(no2 + " is small but even number");
			}else{
				System.out.println(no1 + " is large but not even");
			}
			
		}else if(no2 > no1){
			if(no2%2 == 0){
				System.out.println(no2 + " is even and large number");
			}else if(no1%2 == 0){
				System.out.println(no1 + " is small but even number");
			}else{
				System.out.println(no2 + " is large but not even");
			}
			
		}else if(no1 == no2){
			if(no1%2 == 0 && no2%2 == 0){
				System.out.println(no1 + " and " + no2 + " both are equal and even");
			}else{
				System.out.println(no1 + " and " + no2 + " both are equal but not even");
			}
		}
	}
}
