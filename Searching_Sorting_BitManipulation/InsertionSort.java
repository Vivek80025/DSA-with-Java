public class InsertionSort{
	static void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int j = i;
			while(j>0 && arr[j]<arr[j-1]){
				//swap
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
	}
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		insertionSort(arr);
		System.out.println("array after sorting: ");
		for(int n:arr){
			System.out.print(n+" ");
		}
	}
}