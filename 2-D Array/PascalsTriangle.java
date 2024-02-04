import java.util.*;
public class PascalsTriangle{
	static void printarr(int[][] arr){
		for(int[] a : arr){
			for(int b : a){
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an integer: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][];
		//initialize the size of each row
		for(int i=0;i<n;i++){
				arr[i] = new int[i+1];
		}
		//fill the elements of each row and collumn
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(j==0 || j==i){
					arr[i][j] = 1;
				}
				else{
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		System.out.println("pascal's Triangles of "+n+" rows is: ");
		printarr(arr);
	}
}