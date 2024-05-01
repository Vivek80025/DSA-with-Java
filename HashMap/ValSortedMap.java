import java.util.*;
public class ValSortedMap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> tm = new TreeMap<>();
		System.out.print("enter the number of elements of key-value pair: ");
		int n = sc.nextInt();
		System.out.println("enter the elements in key and value pair: ");
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			String value = sc.nextLine();
			tm.put(value,key);
		}
		System.out.println("sorted map based on value is: ");
		System.out.println(tm);
	}
}