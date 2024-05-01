import java.util.*;
public class DecodeStr{
	public static void main(String[] args){
		String str = "3[2[bc]]";
		Stack<String> stStr = new Stack<>();
		Stack<Integer> stNum = new Stack<>();
		int k = 0;
		int count = 0;
		for(char ch : str.toCharArray()){
			if(Character.isDigit(ch)){
				k = k*10 + (ch - '0');
				continue;
			}
			if(ch=='['){
				stNum.push(k);
				k = 0;
				stStr.push(String.valueOf(ch));
				continue;
			}
			if(ch != ']'){
				stStr.push(String.valueOf(ch));
				continue;
			}
			StringBuilder temp = new StringBuilder();
			while(!stStr.isEmpty() && !stStr.peek().equals("[")){
				temp.insert(0,stStr.pop());
			}
		    if(!stStr.isEmpty()){
				stStr.pop();
			}
			StringBuilder replace = new StringBuilder();
			if(!stNum.isEmpty()){
			    count = stNum.pop();
			}
			for(int i=0;i<count;i++){
				replace.append(temp);
			}
			stStr.push(replace.toString());
		}
		StringBuilder res = new StringBuilder();
		while(!stStr.isEmpty()){
			res.insert(0,stStr.pop());
		}
		System.out.println("the decoded string is: "+res.toString());
	}
}