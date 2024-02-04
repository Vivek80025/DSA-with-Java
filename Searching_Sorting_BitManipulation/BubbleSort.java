public class BubbleSort{
	static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			boolean flag = false;
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					flag = true;
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag == false){
				return;
			}
		}
	}
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		bubbleSort(arr);
		System.out.println("array after sorting: ");
		for(int n:arr){
			System.out.print(n+" ");
		}
	}
}