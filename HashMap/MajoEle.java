import java.util.*;
public class MajoEle{
	public static void main(String[] args){
		int[] arr = {4,2,7,1,9};
		Map<Integer,Integer> tm = new TreeMap<>();
		for(int i=0;i<arr.length;i++){
			tm.put(arr[i],1);
		}
		System.out.println("the largest element of the array is: "+tm.lastEntry().getKey());
	}
}