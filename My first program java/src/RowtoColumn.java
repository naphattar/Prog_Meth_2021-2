import java.util.Arrays;
public class RowtoColumn {
	public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++)
 
            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }
 
	public static int[][] rowtoColumn(int[][] a){
		int n = a[0].length;
		int [][] b = new int[n][n];
		int i = 0, j = 0 ;
		for (i = 0; i < n ; i++) {
			for (j = 0; j<n ; j++) {
				b[j][i] = a[i][j];
			}
			
		}
		return b;
	}
	public static void main(String[]args) {
		int[][]a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = RowtoColumn.rowtoColumn(a);
		print2D(b);
	}
}
