import java.util.*;
public class Stairs{
	static int countWay(int n){
		if(n<=1){
			return 1;
		}
		return (countWay(n-1) + countWay(n-2));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number of stairs: ");
		int n = sc.nextInt();
		System.out.println("total number of way to reach the top is: "+countWay(n));
		
	}
}