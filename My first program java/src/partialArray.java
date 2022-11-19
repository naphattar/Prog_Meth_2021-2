import java.util.Arrays;

public class partialArray {
	public static int[] partialArray(int[] a,int i ,int j) {
		int n = a.length;
		if (i < j && j < n) {
			int m = n-j+i;
			int[] b = new int[m];
			int x = 0;
			int y = 0;
			for(x = 0;x<i;x++) {
				y = x;
				b[x] = a[x];
				
			}
			for(x = j;x<n;x++) {
				y++;
				b[y] = a[x];
				
			}
			return b;
			
		}else {
			return null;
		}
		
	}
	public static void main(String[]args) {
		int[]a = {1,2,3,4};
		int i = 1;
		int j = 2;
		int[] b = partialArray.partialArray(a, i, j);
		System.out.println(Arrays.toString(b));

	}
}
