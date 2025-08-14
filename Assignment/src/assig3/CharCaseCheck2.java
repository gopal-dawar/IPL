package assig3;

import java.util.Scanner;
public class CharCaseCheck2 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any charactor : ");
		
		char ch = s.next().charAt(0); 	
		
		
		if(Character.isUpperCase(ch)){
			System.out.println(ch + " is upperscase");
		}else if(Character.isLowerCase(ch)){
			System.out.println(ch + " is lowercase");
		}else if(Character.isDigit(ch)){
			System.out.println(ch + " is digit");
		}else{
			System.out.println(ch + " is Special symbol");
		}
	}
}
