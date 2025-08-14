package assig7;

public class DivisibleBy3_1To30_7 {
	public static void main(String[] args) {
		int i = 1;
		do {
			if(i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 30);
	}
}
