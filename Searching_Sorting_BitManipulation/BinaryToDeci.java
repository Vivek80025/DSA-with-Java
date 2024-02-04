import java.util.*;
public class BinaryToDeci{
	static int pow(int b,int a){
		if(a==0) return 1;
		int multi = 1;
		for(int i=0;i<a;i++){
			multi *= 2;
		}
		return multi;
	}
	static int binaryToDeci(int n){
		int ans = 0;
		int a = 0;
		while(n>0){
			ans += (n%10) * pow(2,a);
			a++;
			n /= 10;
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a binary number: ");
		int n = sc.nextInt();
		System.out.print(n+" ---> ");
		System.out.println(binaryToDeci(n));
	}
}