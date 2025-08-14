package assig3;
import java.util.Scanner;;
public class ATM14 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("1. Add Balance");
		System.out.println("2. Withdrawal amount");
		System.out.println("Enter your choice : ");
		int choice = s.nextInt();
				
		double balence = 500;
		if(choice == 1){
			System.out.println("Enter amount : ");
			int amount = s.nextInt();
			balence = balence + amount;
			System.out.println("Amount added, Total amount : " + balence);
		}else if(choice == 2){
			System.out.println("Enter amount : ");
			int amount = s.nextInt();
			if(amount % 100 == 0 && amount >= 100){
				balence = balence - amount;
				System.out.println("Approved");
				System.out.println("Total amount : " + balence);
			}else{
				System.out.println("Reject");
			}
		}
	}
}
