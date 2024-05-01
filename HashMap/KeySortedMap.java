import java.util.*;
public class KeySortedMap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of elements of key-value pair: ");
		int n = sc.nextInt();
		System.out.println("enter the elements in key and value pair: ");
		Map<Integer,String> tm = new TreeMap<>();
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			String value = sc.nextLine();
			tm.put(key,value);
		}
		System.out.println("the value of map in sorted order based on key is: ");
		System.out.println(tm);
	}
}