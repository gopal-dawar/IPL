package assig3;

import java.util.Scanner;

public class GreadeCalculate6 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = s.nextInt();
		
		if(marks >= 90 && marks <= 100){
			System.out.println("A");
		}else if(marks >= 80 && marks <= 89){
			System.out.println("B");
		}else if(marks >= 70 && marks <= 79){
			System.out.println("C");
		}else if(marks >= 60 && marks <= 69){
			System.out.println("D");
		}else if(marks >= 0 && marks < 60){
			System.out.println("Fail");
		}else{
			System.out.println("Invalide Marks");
		}
			
	}
}
