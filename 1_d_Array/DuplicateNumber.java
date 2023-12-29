//time complexity:O(n^2)
//space complexity:O(1)
public class DuplicateNumber{
	public int findDuplicate(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					return arr[i];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,6,8,5,4,8};//there would be only a single duplicate elements present.
		DuplicateNumber obj = new DuplicateNumber();
		System.out.println("duplicate number is: "+obj.findDuplicate(arr));
	}
}