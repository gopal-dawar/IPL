package assig6;

public class PrintOdd1To50Number4 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 50) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}

