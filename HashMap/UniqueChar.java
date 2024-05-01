import java.util.*;
public class UniqueChar{
	static int uniqueChar(String str){
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
			}
			else{
				map.put(str.charAt(i),1);
			}
		}
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==1){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a String: ");
		String str = sc.nextLine();
		int result = uniqueChar(str);
		if(result != -1){
			System.out.print("index of first unique element is: "+result);
		}
		else{
			System.out.print("no unique element are present in string");
		}
	}
}