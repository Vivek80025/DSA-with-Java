import java.util.*;
public class MaxRacOfMatrix{
	public static int maxHisto(int[] arr){
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		int[] nse = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
				st1.pop();
			}
			if(st1.isEmpty()){
				nse[i] = arr.length;
			}
			else{
				nse[i] = st1.peek();
			}
			st1.push(i);
		}
		int[] pse = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]){
				st2.pop();
			}
			if(st2.isEmpty()){
				pse[i] = -1;
			}
			else{
				pse[i] = st2.peek();
			}
			st2.push(i);
		}
		int maxArea = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			int area = (nse[i]-pse[i]-1)*arr[i];
			maxArea = Math.max(maxArea,area);
		}
		return maxArea;
	}
	public static void main(String[] args){
		int[][] matrix = {{1,0,1,0,0},
		                  {1,0,1,1,1},
						  {1,1,1,1,1},
						  {1,0,0,1,0}};
		int[] arr = matrix[0];
		int maxRac = maxHisto(arr);
		for(int i=1;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==1){
					arr[j]+=1;
				}
				else{
					arr[j] = 0;
				}
			}
			maxRac = Math.max(maxRac,maxHisto(arr));
		}
		System.out.println("maximum area of ractangle of 1's is: "+maxRac);
	}
}