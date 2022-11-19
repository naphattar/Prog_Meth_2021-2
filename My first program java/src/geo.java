import java.util.Scanner;
public class geo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		b = Math.toRadians(b);
		double l,h;
		l = a*Math.cos(b);
		h = a*Math.sin(b);
		System.out.println("length is "+l+" and height is "+h);
		
	}

}
