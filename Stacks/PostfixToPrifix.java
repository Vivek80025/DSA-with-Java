import java.util.*;
public class PostfixToPrifix{
	public static String postfixToPrifix(String postfix){
		Stack<String> stack = new Stack<>();
		for(int i=0;i<postfix.length();i++){
			char ch = postfix.charAt(i);
			int ascii = (int)ch;
			String val = String.valueOf(ascii-48);
			if(ch==' '){
				continue;
			}
			if(ascii>=48 && ascii<=57){
				stack.push(val);
			}
			else{
				String val2 = stack.pop();
				String val1 = stack.pop();
				if(ch=='+') stack.push("+"+val1+val2);
				if(ch=='-') stack.push("-"+val1+val2);
				if(ch=='*') stack.push("*"+val1+val2);
				if(ch=='/') stack.push("/"+val1+val2);
				if(ch=='^') stack.push("^"+val1+val2);
			}
		}
		return stack.pop();
	}
	public static void main(String[] args){
		String postfix = "9 5 3 + 4 * 6 / -";
		System.out.println("the prifix expression is: "+postfixToPrifix(postfix));
	}
}