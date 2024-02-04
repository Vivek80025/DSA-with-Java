import java.util.*;
public class SpiralMatrix{
	static void printInSpiralOrder(int[][] matrix,int r,int c){
		int topRow = 0;
		int bottomRow = r-1;
		int leftColl = 0;
		int rightColl = c-1;
		int elementsCount = 0;
		while(elementsCount<(r*c)){
			//print topRow
			for(int j=leftColl;j<=rightColl && elementsCount<(r*c);j++){
				System.out.print(matrix[topRow][j]+" ");
				elementsCount++;
			}
			topRow++;
			//print rightColl
			for(int i=topRow;i<=bottomRow && elementsCount<(r*c);i++){
				System.out.print(matrix[i][rightColl]+" "); 
				elementsCount++;
			}
			rightColl--;
			//print bottomRow
			for(int j=rightColl;j>=leftColl && elementsCount<(r*c);j--){
				System.out.print(matrix[bottomRow][j]+" ");
				elementsCount++;
			}
			bottomRow--;
			//print leftColl
			for(int i=bottomRow;i>=topRow && elementsCount<(r*c);i--){
				System.out.print(matrix[i][leftColl]+" ");
				elementsCount++;
			}
			leftColl++;
		}
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
		System.out.println("elements of matrix in spiral order is:");
		printInSpiralOrder(matrix,r,c);				  
	}
}