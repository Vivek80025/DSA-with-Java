import java.util.*;
public class InfixToPrifix{
	public static String infixToPrifix(String infix){
		Stack<String> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		for(int i=0;i<infix.length();i++){
			char ch = infix.charAt(i);
			int ascii = (int)ch;
			String val = String.valueOf(ascii-48);
			if(ch==' '){
				continue;
			}
			if(ascii>=48 && ascii<=57){
				stack1.push(val);
			}
			else if(stack2.size()==0 || ch=='(' || stack2.peek()=='('){
				stack2.push(ch);
			}
			else if(ch==')'){
				while(stack2.peek() != '('){
					String val2 = stack1.pop();
					String val1 = stack1.pop();
					if(stack2.peek()=='+') stack1.push("+"+val1+val2);
					if(stack2.peek()=='-') stack1.push("-"+val1+val2);
					if(stack2.peek()=='*') stack1.push("*"+val1+val2);
					if(stack2.peek()=='/') stack1.push("/"+val1+val2);
					if(stack2.peek()=='^') stack1.push("^"+val1+val2);
					stack2.pop();
				}
				stack2.pop();
			}
			else{
				if(ch=='+' || ch=='-'){
					String val2 = stack1.pop();
					String val1 = stack1.pop();
					if(stack2.peek()=='+') stack1.push("+"+val1+val2);
					if(stack2.peek()=='-') stack1.push("-"+val1+val2);
					if(stack2.peek()=='*') stack1.push("*"+val1+val2);
					if(stack2.peek()=='/') stack1.push("/"+val1+val2);
					if(stack2.peek()=='^') stack1.push("^"+val1+val2);
					stack2.pop();
					stack2.push(ch);
				}
				if(ch=='*' || ch=='/'){
					if(stack2.peek()=='*' || stack2.peek()=='/'){
						String val2 = stack1.pop();
						String val1 = stack1.pop();
						if(stack2.peek()=='*') stack1.push("*"+val1+val2);
						if(stack2.peek()=='/') stack1.push("/"+val1+val2);
						if(stack2.peek()=='^') stack1.push("^"+val1+val2);
						stack2.pop();
						stack2.push(ch);
					}
					else{
						stack2.push(ch);
					}
					
				}
			}
		}
		while(!stack2.isEmpty()){
			String val2 = stack1.pop();
			String val1 = stack1.pop();
			if(stack2.peek()=='+') stack1.push("+"+val1+val2);
			if(stack2.peek()=='-') stack1.push("-"+val1+val2);
			if(stack2.peek()=='*') stack1.push("*"+val1+val2);
			if(stack2.peek()=='/') stack1.push("/"+val1+val2);
			if(stack2.peek()=='^') stack1.push("^"+val1+val2);
			stack2.pop();
		}
		return stack1.pop();
	}
	public static void main(String[] args){
		String infix = "9 - (5 + 3) * 4 / 6";
		System.out.println("the prifix expression is: "+infixToPrifix(infix));
	}
}