import java.util.*;
public class PrifixToInfix{
	public static String prifixToInfix(String prifix){
		Stack<String> stack = new Stack<>();
		for(int i=prifix.length()-1;i>=0;i--){
			char ch = prifix.charAt(i);
			int ascii = (int)ch;
			String val = String.valueOf(ascii-48);
			if(ch==' '){
				continue;
			}
			if(ascii>=48 && ascii<=57){
				stack.push(val);
			}
			else{
				String val1 = stack.pop();
				String val2 = stack.pop();
				if(ch=='+') stack.push("("+val1+"+"+val2+")");
				if(ch=='-') stack.push("("+val1+"-"+val2+")");
				if(ch=='*') stack.push("("+val1+"*"+val2+")");
				if(ch=='/') stack.push("("+val1+"/"+val2+")");
				if(ch=='^') stack.push("("+val1+"^"+val2+")");
			}
			
		}
		return stack.pop();
	}
	public static void main(String[] args){
		String prifix = "- 9 + * 5 3 1";
		System.out.println("the infix expression is: "+prifixToInfix(prifix));
	}
}