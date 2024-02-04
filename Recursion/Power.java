import java.util.*;
public class Power{
	static int power(int a,int b){
		if(b==0 || a==1){
			return 1;
		}
		if(a==0){
			return 0;
		}
		if(b%2==0){
			return (power(a,b/2) * power(a,b/2));
		}
		else{
			return (a * power(a,b/2) * power(a,b/2));
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter base: ");
		int a = sc.nextInt();
		System.out.print("enter power: ");
		int b = sc.nextInt();
		System.out.println(a+" to the power "+b+" is: "+power(a,b));
	}
}