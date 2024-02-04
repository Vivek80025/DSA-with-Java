import java.util.*;
public class MakeSpiralMatrix{
	static void printMatrix(int[][] matrix,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void spiralMatrix(int[][] matrix,int n){
		int topRow = 0;
		int rightColl = n-1;
		int bottomRow = n-1;
		int leftColl = 0;
		int element = 1;
		while(element<=n*n){
			//fill the elements in topRow
			for(int j=leftColl;j<=rightColl && element<=n*n;j++){
				matrix[topRow][j] = element++;
			}
			topRow++;
			//fill the elements in rightColl
			for(int i=topRow;i<=bottomRow && element<=n*n;i++){
				matrix[i][rightColl] = element++;
			}
			rightColl--;
			//fill the elements in bottomRow
			for(int j=rightColl;j>=leftColl && element<=n*n;j--){
				matrix[bottomRow][j] = element++;
			}
			bottomRow--;
			//fill the elements in leftColl
			for(int i=bottomRow;i>=topRow && element<=n*n;i--){
				matrix[i][leftColl] = element++;
			}
			leftColl++;
		}
		System.out.println("spiral matrix is:");
		printMatrix(matrix,n);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an integer: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		spiralMatrix(matrix,n);
	}
}