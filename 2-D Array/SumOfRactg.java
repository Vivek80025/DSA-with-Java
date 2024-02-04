import java.util.*;
public class SumOfRactg{
	static void colWisePrifixSum(int[][] matrix,int r,int c){
		for(int j=0;j<c;j++){
			for(int i=1;i<r;i++){
				matrix[i][j] += matrix[i-1][j];
			}
		}
	}
	static void rowWisePrifixSum(int[][] matrix,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=1;j<c;j++){
				matrix[i][j] += matrix[i][j-1];
			}
		}
	}
	static int sumOfRact(int[][] matrix,int r,int c,int l1,int r1,int l2,int r2){
		rowWisePrifixSum(matrix,r,c);
		colWisePrifixSum(matrix,r,c);
		int upRowSum = 0;int leftColSum = 0;int leftUp = 0;
		if(l1>=1) upRowSum = matrix[l1-1][r2];
		if(r1>=1) leftColSum = matrix[l2][r1-1];
		if(l1>=1 && r1>=1) leftUp = matrix[l1-1][r1-1];
		int ans = matrix[l2][r2] - upRowSum - leftColSum + leftUp;
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no. of row of a matrix: ");
		int r = sc.nextInt();
		System.out.print("enter no. of collumn of a matrix: ");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		System.out.println("enter "+(r*c)+" elements of matrix: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter first co-ordinate: ");
		int l1 = sc.nextInt();
		int r1 = sc.nextInt();
		System.out.println("enter second co-ordinate: ");
		int l2 = sc.nextInt();
		int r2 = sc.nextInt();
		int ans = sumOfRact(matrix,r,c,l1,r1,l2,r2);
		System.out.print("sum of elements of matrix from 1st co-ordinate to 2nd co-ordinate is: ");
		System.out.println(ans);
	}
}