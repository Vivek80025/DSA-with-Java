public class SudokuSolver{
	static int a = 0;
	public static boolean isValid(char[][] board,int row,int col,char ch){
		//check row
		for(int i=0;i<9;i++){
			if(board[row][i]==ch){
				return false;
			}
		}
		//check col
		for(int i=0;i<9;i++){
			if(board[i][col]==ch){
				return false;
			}
		}
		//check 3*3 matrix
		int srow = row/3*3;
		int scol = col/3*3;
		for(int i=srow;i<srow+3;i++){
			for(int j=scol;j<scol+3;j++){
				if(board[i][j]==ch){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void solver(char[][] board,int row,int col){
		if(row>8){
			a = 1;
			return;
		}
		//number
		if(board[row][col] != '.'){
			if(col != 8) solver(board,row,col+1);
			if(col == 8) solver(board,row+1,0);
		}
		//. char
		else{
			for(char i='1';i<='9';i++){
				if(isValid(board,row,col,i)){
					board[row][col] = i;
					if(col != 8) solver(board,row,col+1);
			        if(col == 8) solver(board,row+1,0);
					if(a == 1){
						return;
					}
					board[row][col] = '.';//backtracking
				}
			}
		}
	}
	
	public static void main(String[] args){
		char[][] board = {{'5','3','.','.','7','.','.','.','.'},
		                  {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};
        
        solver(board,0,0);
        for(char[] ch : board){
			for(char e : ch){
				System.out.print(e);
			}
			System.out.println();
		}
        a = 0;		
	}
}