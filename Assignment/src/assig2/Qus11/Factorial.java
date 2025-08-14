package assig2.Qus11;

public class Factorial{
	public int fact(int no){
		if(no == 0 || no == 1){
			return 1;
		}if(no > 1){
			return no * fact(no - 1);
		}
		return 1;
	}
}