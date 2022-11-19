import mypackage.Dice;

public class Dicetest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static คือเเชร์กันทั้งคลาส
		
		Dice a = new Dice(1);
		Dice b = new Dice(5);
		Dice c = new Dice();
		
		System.out.println(a.faceValue);
		c.roll();
		System.out.println(c.faceValue);

	}

}
