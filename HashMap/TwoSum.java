import java.util.*;
public class TwoSum{
	static int[] twoSum(int n,int[] arr,int target){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(arr[i],i);
		}
		for(int i=0;i<n;i++){
			if(arr[i]==target && map.containsKey(0)){
				return new int[] {i,map.get(0)};
			}
			if(map.containsKey(target-arr[i]) && (i<map.get(target-arr[i]))){
				return new int[] {i,map.get(target-arr[i])};
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements of the array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("enter a target number: ");
		int target = sc.nextInt(); 
		int[] result = twoSum(n,arr,target);
		System.out.print("two sum index is: ");
		System.out.print("["+result[0]+","+result[1]+"]");
	}
}