package assig7.UserInteraction;

public class Generate7Divisor_30 {
	public static void main(String[] args) {
	int randome;
	do {
		randome = (int)(Math.random() * 100)+1;
		System.out.println(randome);
	} while (randome % 7 != 0);
	System.out.println("Randome divisor of 7 is : " + randome);
	}
}
