import java.util.*;
public class Fibonacci{
	static int fibonacci(int n){
		//fibonacci series: 0,1,1,2,3,5.... --> 0th to nth fibonacci no.
		if(n<=1){
			return n;
		}
		return (fibonacci(n-2) + fibonacci(n-1));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an number: ");
		int n = sc.nextInt();
		System.out.println(n+"th fibonacci number is: "+fibonacci(n));
	}
}