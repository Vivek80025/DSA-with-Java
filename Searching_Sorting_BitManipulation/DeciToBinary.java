import java.util.*;
public class DeciToBinary{
	static long deciToBinary(int n){
		if(n==1 || n==0){
			return n;
		}
		int reminder;
		int i = 1;
		long binary = 0;
		while(n>0){
			reminder = n%2;
			n /= 2;
			binary += reminder * i;
			i *= 10;
		}
		return binary;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a decimal number: ");
		int n = sc.nextInt();
		System.out.print(n+" ---> "+deciToBinary(n));
	}
}