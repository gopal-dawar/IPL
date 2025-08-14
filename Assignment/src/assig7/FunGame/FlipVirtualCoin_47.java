package assig7.FunGame;

public class FlipVirtualCoin_47 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; count <= 3; i++) {
			int randomNumber = (int) (Math.random() * 3 + 1);

			System.out.print("Random " + i + ": " + randomNumber + " → ");

			if (randomNumber == 1) {
				count++;
				System.out.println("Heads");
			} else if (randomNumber == 2) {
				System.out.println("Tails");
			} else {
				System.out.println("Edge (Coin stands!)");
			}
			if (count==3) {
				System.out.println("3 Heads geted");
				break;
			}
		}
	}
}
