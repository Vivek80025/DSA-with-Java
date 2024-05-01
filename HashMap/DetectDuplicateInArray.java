import java.util.*;
public class DetectDuplicateInArray{
	public static boolean detectDuplicate(int[] arr){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				return true;
			}
			else{
				hm.put(arr[i],1);
			}
		}
		return false;
		
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		System.out.println("array contains duplicate?: "+detectDuplicate(arr));
	}
}