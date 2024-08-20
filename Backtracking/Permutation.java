import java.util.*;
public class Permutation{
	public static void permutation(List<List<Integer>> list,int[] arr, List<Integer> prom){
		if(prom.size()==arr.length){
			list.add(new ArrayList<>(prom));
			return;
		}
		for(int i=0;i<arr.length;i++){
			if(prom.contains(arr[i])){
				continue;
			}
			prom.add(arr[i]);
			permutation(list,arr,prom);
			prom.remove(prom.size()-1); //backtracking
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of an array: ");
		int n = sc.nextInt();
		System.out.print("enter elements of an array: ");
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		List<List<Integer>> list = new ArrayList<>();
		permutation(list,arr,new ArrayList<Integer>());
		//print all permutation
		System.out.println("permutation is: ");
		for(int i=0;i<list.size();i++){
			list.get(i).forEach(a->System.out.print(a));
			System.out.println();
		}
	}
}