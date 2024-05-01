//time complexity:O(n)
//space complexity:O(1)
import java.util.*;
public class MissingNumber{
	public static void missingNumber(int[] arr){
		int n = arr.length + 1;
		int sum = (n * (n + 1))/2;
		for(int i=0;i<arr.length;i++){
			sum-=arr[i];
		}
		System.out.print("mising number of array is : "+sum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements of an array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		missingNumber(arr);
	}
}