import java.util.*;
public class RecordScore{
	public static void main(String[] args){
		String[] str = {"5","-2","4","C","D","9","+","+"};
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<str.length;i++){
			if(str[i].equals("C") && !stack.isEmpty()){
				stack.pop();
				continue;
			}
			if(str[i].equals("D") && !stack.isEmpty()){
				stack.push(2*stack.peek());
				continue;
			}
			if(str[i].equals("+") && !stack.isEmpty()){
				int b = stack.pop();
				int a = 0;
				if(!stack.isEmpty()){
					a = stack.pop();
				}
				int c = a+b;
				stack.push(a);
				stack.push(b);
				stack.push(c);
				continue;
			}
			stack.push(Integer.valueOf(str[i]));
		}
		int sum = 0;
		while(!stack.isEmpty()){
			sum += stack.pop();
		}
		System.out.println("sum of all the scores on the record after applying all the operation is: "+sum);
	}
}