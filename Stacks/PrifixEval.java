//time complexity:O(n)
//space complexity:O(n)
import java.util.*;
public class PrifixEval{
	public static int eval(String prifix){
		Stack<Integer> stack = new Stack<>();
		for(int i=prifix.length()-1;i>=0;i--){
			char ch = prifix.charAt(i);
			int ascii = (int)ch;
			if(ascii>=48 && ascii<=57){
				stack.push(ascii-48);
			}
			else{
				int val1 = stack.pop();
				int val2 = stack.pop();
				if(ch=='*') stack.push(val1*val2);
				if(ch=='/') stack.push(val1/val2);
				if(ch=='+') stack.push(val1+val2);
				if(ch=='-') stack.push(val1-val2);
				if(ch=='^') stack.push((int)Math.pow(val1,val2));
			}
		}
		return stack.pop();
	}
	public static void main(String[] args){
		String prifix = "-9+*531";
		System.out.println("value of this prifix expression: "+eval(prifix));
	}
}