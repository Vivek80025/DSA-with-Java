import java.util.*;
public class NQueens{
	public static boolean isSafe(char[][] board,int row,int col,int n){
		//check row E-W
		for(int i=0;i<n;i++){
			if(board[row][i]=='Q'){
				return false;
			}
		}
		//check colomn N-S
		for(int i=0;i<n;i++){
			if(board[i][col]=='Q'){
				return false;
			}
		}
		//check N-E
		int i = row;
		int j = col;
		while(i>=0 && j>=0){
			if(board[i][j]=='Q'){
				return false;
			}
			i--;
			j--;
		}
		//check N-W
		i = row;
		j = col;
		while(i>=0 && j<n){
			if(board[i][j]=='Q'){
				return false;
			}
			i--;
			j++;
		}
		//check S-W
		i = row;
		j = col;
		while(i<n && j<n){
			if(board[i][j]=='Q'){
				return false;
			}
			i++;
			j++;
		}
		//check S-E
		i = row;
		j = col;
		while(i<n && j>=0){
			if(board[i][j]=='Q'){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void placeNqueens(char[][] board,int row,int n){
		if(row==n){
			//print path
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		for(int i=0;i<n;i++){
			if(isSafe(board,row,i,n)){
				board[row][i] = 'Q';
				placeNqueens(board,row+1,n);
				board[row][i] = 'x';
			}
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("eneter the value of n: ");
		int n = sc.nextInt();
		char[][] board = new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				board[i][j] = 'x';
			}
		}
		placeNqueens(board,0,n);
	}
}