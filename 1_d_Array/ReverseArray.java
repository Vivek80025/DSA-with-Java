//time complexity:O(n)
//space complexity:O(1)
import java.util.*;
public class ReverseArray{
	public void reverseArray(int[] arr){
		int start = 0;
		int last = arr.length-1;
		while(start<last){
			int temp = arr[start];
			arr[start] = arr[last];
			arr[last] = temp;
			start+=1;
			last-=1;
		}
		System.out.println("reverse array is: ");
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elements of an array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		ReverseArray obj = new ReverseArray();
		obj.reverseArray(arr);
		
	}
}