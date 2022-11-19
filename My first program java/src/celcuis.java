import java.util.Scanner;
public class celcuis {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter celcius: ");
		double c = kb.nextDouble();
		double f;
		f = (c*1.8)+32;
		System.out.print(c+" celcuis is "+f+" farenheit");

	}

}
