package mypackage;
public class Dice {
	final static int Max = 6;
	int faceValue;
	public Dice() {
		this.faceValue = 1;
 	}
	public Dice(int faceValue) {
		this.faceValue = faceValue;
	}
	public int roll() {
		faceValue = (int)(Math.random()*Max+1);
		return faceValue;
	}

}
