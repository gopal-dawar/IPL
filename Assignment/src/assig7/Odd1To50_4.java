package assig7;

public class Odd1To50_4 {
	public static void main(String[] args) {
		int i = 1;
		do {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 50);
	}
}
