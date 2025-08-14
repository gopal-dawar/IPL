package assig3;
import java.util.Scanner;
public class CheckVowels13 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter vowel for check it's vowel or not : ");
		
		char ch = s.next().charAt(0);
		
		if(ch == 'a' || ch == 'A'){
			System.out.println(ch + " is Vowel");
		}else if(ch == 'e' || ch == 'E'){
			System.out.println(ch + " is Vowel");
		}else if(ch == 'i' || ch == 'I'){
			System.out.println(ch + " is Vowel");
		}else if(ch == 'o' || ch == 'O'){
			System.out.println(ch + " is Vowel");
		}else if(ch == 'u' || ch == 'U'){
			System.out.println(ch + " is Vowel");
		}else{
			System.out.println(ch + " is not Vowel");
		}
	}
}
