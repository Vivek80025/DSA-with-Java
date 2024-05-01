import java.util.*;
public class Parenthesis{
	public static boolean isValidParenthesis(String str){
		char[] arr = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(char a : arr){
			if(a == '[' || a == '{' || a == '('){
				stack.push(a);
				continue;
			}
			if(stack.empty()){
				return false;
			}
			char top = stack.pop();
			if(top == '[' && a != ']'){
				return false;
			}
			else if(top == '{' && a != '}'){
				return false;
			}
			else if(top == '(' && a != ')'){
				return false;
			}
		}
		if(stack.empty()){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string: ");
		String str = sc.nextLine();
		boolean result = isValidParenthesis(str);
		System.out.print("the given string is valid ? "+result);
	}
}