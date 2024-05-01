import java.util.*;
public class Asteroids{
	public static void main(String[] args){
		int[] astr = {5,10,-5};
		Stack<Integer> stack = new Stack<>();
		stack.push(astr[0]);
		for(int i=1;i<astr.length;i++){
			if(astr[i]>0){
				stack.push(astr[i]);
				continue;
			}
			if(stack.peek()>0 && astr[i]<0){
				while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(astr[i])){
					stack.pop();
				}
			}
			if(!stack.isEmpty() && astr[i]<0 && Math.abs(astr[i])==stack.peek()){
				stack.pop();
				continue;
			}
			if(!stack.isEmpty() && stack.peek()<0){
				stack.push(astr[i]);
				continue;
			}
		}
		int[] res = new int[stack.size()];
		for(int i=res.length-1;i>=0;i--){
			res[i] = stack.pop();
		}
		System.out.print("state of the asteriods after all collision is: "+"[ ");
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
		System.out.print("]");
	}
}