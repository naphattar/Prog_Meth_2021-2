import java.util.Scanner;
public class absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		double number = 0;
		try {
			number = kb.nextDouble();
		}catch (NumberFormatException e) {
			System.out.println("Error");
			System.exit(0);
		}
//		if (number < 0) {
//			number *= -1;
//		}
	//	System.out.println("Absolute number is "+number);
		double result = (number <0)? (-1*number) :number;
		System.out.println(result);
	}

}
