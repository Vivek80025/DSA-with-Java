public class FirstOccurrence{
	static int firstOccurrence(int[] arr,int target){
		//binary search algo
		int low = 0;
		int high = arr.length-1;
		int ans = -1;
		while(low<=high){
			int mid = low + (high - low)/2;
			if(arr[mid]==target){
				ans = mid;
				high = mid - 1;
			}
			else if(arr[mid]<target){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return ans;
	}
	public static void main(String[] args){
		int[] arr = {1,1,1,2,2,3,4,5,5,5};
		int target = 5;
		int ans = firstOccurrence(arr,target);
		if(ans==-1){
			System.out.println("target element is not found in this array");
		}
		else{
			System.out.println("location of target element is: "+ans+" index");
		}
	}
}