//time complexity:O(n)
//space complexity:O(n)
import java.util.*;
class PostfixEval{
	public static int eval(String postfix){
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<postfix.length();i++){
			char ch = postfix.charAt(i);
			int ascii = (int)ch;
			if(ascii>=48 && ascii<=57){
				stack.push(ascii-48);
			}
			else{
				int val2 = stack.pop();
				int val1 = stack.pop();
				if(ch == '*') stack.push(val1*val2);
				if(ch == '+') stack.push(val1+val2);
				if(ch == '-') stack.push(val1-val2);
				if(ch == '/') stack.push(val1/val2);
				if(ch == '^') stack.push((int)Math.pow(val1,val2));
			}
		}
		return stack.pop();
	}
	public static void main(String[] args){
		String postfix = "231*+9-";
		System.out.println("vlaue of this postfix expression is : "+eval(postfix));
	}
}