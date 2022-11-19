package mypackage;

public class Simpledice {
	final public static int Max = 6;
	private int faceValue;
	public Simpledice(int faceValue) {
		this.faceValue = faceValue;
	}
	public int getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		if (faceValue < 1) {
			faceValue = 1;
		}else if(faceValue > Max) {
			faceValue = Max;
		}
		this.faceValue = faceValue;
	}
	
	

}
