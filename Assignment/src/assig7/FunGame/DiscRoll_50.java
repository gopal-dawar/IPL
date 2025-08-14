package assig7.FunGame;

public class DiscRoll_50 {
	public static void main(String[] args) {
		int roll;
		int attempt = 0;

		do {
			roll = (int) (Math.random() * 6) + 1;
			attempt++;
			System.out.println("Roll " + attempt + ": " + roll);
		} while (roll != 6);

		System.out.println("🎯 You rolled a 6 in " + attempt + " attempts!");
	}
}
