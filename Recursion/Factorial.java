import java.util.*;
public class Factorial{
	static int factorial(int n){
		if(n==0){
			return 1;
		}
		return (n * factorial(n-1));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an number: ");
		int n = sc.nextInt();
		System.out.println("factorial of "+n+" is: "+factorial(n));
	}
}