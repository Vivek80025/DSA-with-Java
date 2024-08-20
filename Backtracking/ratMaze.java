import java.util.*;
public class ratMaze{
	public static void printPath(int[][] maze,boolean[][] check,int row,int col,String p,int n){
		//DLRU
		if(row==n-1 && col==n-1){
			System.out.println(p);
			return;
		}
	
		check[row][col] = true;
		//down
		if(row+1<n && maze[row+1][col]!=0 && check[row+1][col]==false)
		    printPath(maze,check,row+1,col,p+"D",n);
		//left
		if(col-1>=0 && maze[row][col-1]!=0 && check[row][col-1]==false)
		    printPath(maze,check,row,col-1,p+"L",n);
		//right
		if(col+1<n && maze[row][col+1]!=0 && check[row][col+1]==false)
		    printPath(maze,check,row,col+1,p+"R",n);
		//up
		if(row-1>=0 && maze[row-1][col]!=0 && check[row-1][col]==false)
		    printPath(maze,check,row-1,col,p+"U",n);
		check[row][col] = false;
	}
	public static void main(String[] args){
		int[][] maze = {{1,0,0,0},
			            {1,1,0,0},
				        {1,1,0,0},
		                {0,1,1,1}};
		boolean[][] check = new boolean[maze.length][maze[0].length];
		printPath(maze,check,0,0," ",4);
	}
}