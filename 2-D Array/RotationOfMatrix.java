public class RotationOfMatrix{
	static void printMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void transpose(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=i;j<matrix[0].length;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	static void rotate(int[][] matrix){
		transpose(matrix);
		//reverse all elements of each row;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length-j;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[0].length-j-1];
				matrix[i][matrix[0].length-j-1] = temp;
			}
		}
		System.out.println("rotated matrix is:");
		printMatrix(matrix);
	}
	public static void main(String[] args){
		int[][] matrix = {{1,2,3},
			           {4,5,6},
				       {7,8,9}};
		rotate(matrix);
	}
}