//time complexity: O(n)
// space complexity: O(n)
import java.util.*;
public class GreatString{
	public static String greatString(String str){
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++){
			if(!stack.isEmpty() && Math.abs((int)stack.peek() - (int)str.charAt(i)) == 32){
				stack.pop();
			}
			else{
				stack.push(str.charAt(i));
			}
		}
		char[] ca = new char[stack.size()];
		int idx = ca.length - 1;
		while(!stack.isEmpty()){
			ca[idx] = stack.pop();
			idx--;
		}
		String res = String.valueOf(ca);
		return res;
	}
	public static void main(String[] args){
		String str = "leEeetcode";
		System.out.println("good string of the given string is : "+greatString(str));
	}
}