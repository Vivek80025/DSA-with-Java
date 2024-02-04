import java.util.*;
public class TransposeOfMatrix{
	static void printMatrix(int[][] matrix,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	//only applicable for square matrix.
	static void transpose(int[][] matrix,int r,int c){
		if(r != c){
			System.out.println("row and collumn of a matrix should not be different");
			return;
		}
		for(int i=0;i<r;i++){
			for(int j=i;j<c;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		System.out.println("transpose of matrix is: ");
		printMatrix(matrix,r,c);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no. of row of matrix: ");
		int r = sc.nextInt();
		System.out.print("enter no. of collumn of matrix: ");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		System.out.println("enter "+(r*c)+" elements of matrix: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		transpose(matrix,r,c);
	}
}