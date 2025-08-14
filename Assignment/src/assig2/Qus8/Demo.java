package assig2.Qus8;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1 to 10 : ");
		int no = s.nextInt();
		
        Number n = new Number();

		if(no == 1){
			String one = n.printOne("One");
			System.out.println(one);
		}else if(no == 2){
			String two = n.printTwo("Two");
			System.out.println(two);
		}else if(no == 3){
			String three = n.printThree("Three");
			System.out.println(three);
		}else if(no == 4){
			String four = n.printFour("Four");
			System.out.println(four);
		}else if(no == 5){
			String five = n.printFive("Five");
			System.out.println(five);
		}else if(no == 6){
			String six = n.printSix("Six");
			System.out.println(six);
		}else if(no == 7){
			 String seven = n.printSeven("Seven");
			System.out.println(seven);
		}else if(no == 8){
			String eight = n.printEight("Eight");
			System.out.println(eight);
		}else if(no == 9){
			String nine = n.printNine("Nine");
			System.out.println(nine);
		}else if(no == 10){
			String ten = n.printTen("Ten");
			System.out.println(ten);
		}
    }
}
