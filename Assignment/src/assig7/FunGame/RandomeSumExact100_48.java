package assig7.FunGame;

import java.util.ArrayList;

public class RandomeSumExact100_48 {
	public static void main(String[] args) {
		int sum = 0;

		while (sum < 100) {
			int randomNumber = (int) (Math.random() * 50 + 1);

			if (sum + randomNumber <= 100) {
				sum = sum + randomNumber;
				System.out.println("Added: " + randomNumber + " → Sum: " + sum);
			} else {
				System.out.println("Skipped: " + randomNumber);
			}
		}

		System.out.println("Exact sum reached: " + sum);

	}
}
