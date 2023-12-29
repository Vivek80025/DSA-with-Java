//time complexity:O(n)
//space complexity:O(1)
import java.util.*;
public class PalindromeArray{
	public void checkPalindromeArray(int[] arr){
		int start = 0;
		int last = arr.length - 1;
		int a = 1;
		while(start<=last){
			if(arr[start] == arr[last]){
				start+=1;
				last-=1;
			}
			else{
				a = 0;
				break;
			}
		}
		if(a == 1){
			System.out.println("given array is palindrome");
		}
		else{
			System.out.println("given array is not palindrome");
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
		//checkPalindromeArray are not static so we have to create an object to call checkPalindromeArray()method
		PalindromeArray obj = new PalindromeArray();
		obj.checkPalindromeArray(arr);
		
	}
}