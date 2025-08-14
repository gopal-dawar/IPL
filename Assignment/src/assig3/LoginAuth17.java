package assig3;

import java.util.Scanner;
public class LoginAuth17 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String correctUser = "gopal";
		String correctPasw = "9370";
		
		System.out.println("Enter username : ");
		String username = s.nextLine();
		
		System.out.println("Enter passwords : ");
		String password  = s.nextLine();
		
		
		if(username.equals(correctUser) && password.equals(correctPasw)){
			System.out.println("Access Granted");
		}else{
			System.out.println("Denied");
		}
	}
}
