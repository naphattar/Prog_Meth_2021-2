public class countEven {
	public static void main(String[] args) {
	}
	public static int countEven(int[] a){
		int n = a.length;
		int count = 0;
		for (int i = 0; i<n; i++) {
			if (a[i]%2 == 0){
				count++;;
			}
		}
		return count;
	}
}
