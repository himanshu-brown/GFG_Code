import java.util.*;

public class RotateAMatrixBy90Degree
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
		System.out.print("Enter the size of matrix:");
		int n = scan.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<n; i++)
		    for(int j=0; j<n; j++)
		        matrix[i][j] = scan.nextInt();
		
		System.out.println();
		for(int i=0; i<n; i++){
		    for(int j=n-1; j>=0; j--)
		        System.out.print(matrix[j][i]+" ");
		    System.out.println();
		}
		
	}
}
