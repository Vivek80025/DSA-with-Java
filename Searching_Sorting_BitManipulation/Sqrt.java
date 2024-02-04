import java.util.*;
public class Sqrt{
	static int sqrt(int n){
		int low = 0;
		int high = n;
		int ans = -1;
		while(low<=high){
			int mid = low + (high - low)/2;
			long val = mid * mid;
			if(val == n){
				return mid;
			}
			else if(val > n){
				high = mid - 1;
			}
			else{
				ans = mid;
				low = mid + 1;
			}
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a positive number: ");
		int n = sc.nextInt();
		System.out.println("square root of "+n+" is: "+sqrt(n));
	}
}