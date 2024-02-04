import java.util.*;
public class ArthematicOperationsOfTwoMatrix{
	static void printMatrix(int[][] matrix,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	//addition of two matrix.
	static void matrixAddition(int[][] matrix1,int r1,int c1,int[][] matrix2,int r2,int c2){
		if(r1 != r2 || c1 != c2){
			System.out.println("matrix addition not possible bcause order of matrix is incorrect");
			return;
		}
		int[][] additionMatrix = new int[r1][c1];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				additionMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("addition of two matrix is: ");
		printMatrix(additionMatrix,r1,c1);
	}
	//multiplication of two matrix.
	static void matrixMulti(int[][] matrix1,int r1,int c1,int[][] matrix2,int r2,int c2){
		if(c1 != r2){
			System.out.println("matrix multiplication not possible bcause order of matrix is incorrect");
			return;
		}
		int[][] multiMatrix = new int[r1][c2];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<c1;k++){
					multiMatrix[i][j] +=matrix1[i][k] * matrix2[k][j];
				} 
			}
		}
		System.out.println("multiplication of two matrix is: ");
		printMatrix(multiMatrix,r1,c2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no. of row of 1st matrix: ");
		int r1 = sc.nextInt();
		System.out.print("enter no. of collumn of 1st matrix: ");
		int c1 = sc.nextInt();
		System.out.print("enter no. of row of 2nd matrix: ");
		int r2 = sc.nextInt();
		System.out.print("enter no. of collumn of 2nd matrix: ");
		int c2 = sc.nextInt();
		int[][] matrix1 = new int[r1][c1];
		System.out.println("enter "+(r1*c1)+" elements of 1st matrix: ");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				matrix1[i][j] = sc.nextInt();
			}
		}
		int[][] matrix2 = new int[r2][c2];
		System.out.println("enter "+(r2*c2)+" elements of 2nd matrix: ");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				matrix2[i][j] = sc.nextInt();
			}
		}
		matrixAddition(matrix1,r1,c1,matrix2,r2,c2);
		matrixMulti(matrix1,r1,c1,matrix2,r2,c2);
	}
}