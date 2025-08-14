package assig7.NumberBased;

public class First10DivisibleBy9_32 {
	public static void main(String[] args) {
		int i = 1;
		int c = 1;
		do {
			if (i%9 == 0) {
				System.out.println(i);
				c++;
			}
			i++;
		} while (c<= 10);
	}
}
