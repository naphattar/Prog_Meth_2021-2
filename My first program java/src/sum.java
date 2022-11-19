
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tar");

	}
	
	public static int sumfirst(int a) {
		int sum = 0;
		for (int i = 1;i<= a;i++) {
			sum += i;
			
		}
		return sum;
	}
	public static int sumsecond (int a,int b) {
		int sum = 0;
		for (int i = a; i <= b;i++ ) {
			sum += i;
		}
		return sum;
	}
	public static int sumsecond (int a,int b,int c) {
		int sum = 0;
		for (int i = a; i <= b; i+= c ) {
			sum += i;
		}
		return sum;
	} 
	

}
