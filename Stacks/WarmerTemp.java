import java.util.*;
public class WarmerTemp{
	public static void main(String[] args){
		int[] temp = {73,74,75,71,79,72,76,73};
		int[] nge = new int[temp.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=temp.length-1;i>=0;i--){
			while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
				stack.pop();
			}
			if(stack.empty()){
				nge[i] = 0;
			}
			else{
				nge[i] = stack.peek();
			}
			stack.push(i);
		}
		int[] warmerTemp = new int[nge.length];
		for(int i=0;i<warmerTemp.length;i++){
			if(nge[i]==0){
			    warmerTemp[i] = 0;
			}
			else{
				warmerTemp[i] = nge[i] - i;
			}
		}
		System.out.print("answer is: "+"[ ");
		for(int i=0;i<warmerTemp.length;i++){
			System.out.print(warmerTemp[i]+" ");
		}
		System.out.print("]");
	}
}