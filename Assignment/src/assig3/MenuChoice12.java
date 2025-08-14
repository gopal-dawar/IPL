package assig3;
import java.util.Scanner;
public class MenuChoice12 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. subtract");
		System.out.println("3. multiply");
		System.out.println("4. Divide");
		
		System.out.println("Enter your choice :");
		int choice = s.nextInt();
				
		System.out.println("Enter first Number : ");
		int no1 = s.nextInt();
		
		System.out.println("Enter second Number : ");
		int no2 = s.nextInt();
		
		
		if(choice == 1){
			int sum = no1 + no2;
			System.out.println("Sum : " + sum);
		}else{
			if(choice == 2){
				int sub = no1 - no2;
				System.out.println("Subtract : " + sub);
			}else{
				if(choice == 3){
					int mul = no1 * no2;
					System.out.println("Multiplication : " + mul);
				}else{
					if(choice == 4){
						int div = no1 / no2;
						System.out.println("Division : " + div);
					}
				}
			}
		}
		
	}
}
