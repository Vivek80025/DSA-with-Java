import java.util.*;
public class Combination{
	public static void combination(List<List<Integer>> list,ArrayList<Integer> comb,int n,int start,int k){
		if(comb.size()==k){
			list.add(new ArrayList<>(comb));
			return;
		}
		for(int i=start;i<=n;i++){
			comb.add(i);
			combination(list,comb,n,i+1,k);
			comb.remove(comb.size()-1);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n: ");
		int n = sc.nextInt();
		System.out.print("enter k: ");
		int k = sc.nextInt();
		List<List<Integer>> list = new ArrayList<>();
		combination(list,new ArrayList<>(),n,1,k);
		//print all combination
		System.out.println("permutation is: ");
		for(int i=0;i<list.size();i++){
			list.get(i).forEach(a->System.out.print(a));
			System.out.println();
		}
	}
}