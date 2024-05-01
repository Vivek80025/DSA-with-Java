import java.util.*;
public class InfixEval{
	public static int eval(String infix){
		Stack<Integer> stack1 = new Stack<>();//operand
		Stack<Character> stack2 = new Stack<>();//operator
		for(int i=0;i<infix.length();i++){
			char ch = infix.charAt(i);
			int ascii = (int)ch;
			if(ch==' '){
				continue;
			}
			if(ascii>=48 && ascii<=57){
				stack1.push(ascii-48);
			}
			else if(stack2.size()==0 || ch=='(' || stack2.peek()=='('){
				stack2.push(ch);
			}
			else if(ch==')'){
				while(stack2.peek() != '('){
					int val2 = stack1.pop();
				    int val1 = stack1.pop();
				    if(stack2.peek()=='*') stack1.push(val1*val2);
				    if(stack2.peek()=='/') stack1.push(val1/val2);
				    if(stack2.peek()=='+') stack1.push(val1+val2);
				    if(stack2.peek()=='-') stack1.push(val1-val2);
				    if(stack2.peek()=='^') stack1.push((int)Math.pow(val1,val2));
				    stack2.pop();
				}
				stack2.pop();
			}
			else{
				if(ch=='+' || ch=='-'){
					int val2 = stack1.pop();
					int val1 = stack1.pop();
					if(stack2.peek()=='*') stack1.push(val1*val2);
					if(stack2.peek()=='/') stack1.push(val1/val2);
					if(stack2.peek()=='+') stack1.push(val1+val2);
					if(stack2.peek()=='-') stack1.push(val1-val2);
					if(stack2.peek()=='^') stack1.push((int)Math.pow(val1,val2));
					stack2.pop();
					stack2.push(ch);
				}
				if(ch=='*' || ch=='/'){
					if(stack2.peek()=='*' || stack2.peek()=='/'){
						int val2 = stack1.pop();
					    int val1 = stack1.pop();
					    if(stack2.peek()=='*') stack1.push(val1*val2);
					    if(stack2.peek()=='/') stack1.push(val1/val2);
						if(stack2.peek()=='^') stack1.push((int)Math.pow(val1,val2));
						stack2.pop();
						stack2.push(ch);
					}
					else stack2.push(ch);
				}
			}
		}
		while(!stack2.isEmpty()){ 
			int val2 = stack1.pop();
			int val1 = stack1.pop();
			if(stack2.peek()=='*') stack1.push(val1*val2);
			if(stack2.peek()=='/') stack1.push(val1/val2);
			if(stack2.peek()=='+') stack1.push(val1+val2);
			if(stack2.peek()=='-') stack1.push(val1-val2);
			if(stack2.peek()=='^') stack1.push((int)Math.pow(val1,val2));
			stack2.pop();
		}
		return stack1.pop();
	}
	public static void main(String[] args){
		String infix = "2 * ( 5 * ( 3 + 6 ) ) / 5 - 2";
		System.out.println("value of this expression is : "+eval(infix));
	}
}