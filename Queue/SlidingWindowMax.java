import java.util.*;
public class SlidingWindowMax{
	public static int[] maxSlidingWindow(int[] nums,int k){
		Deque<Integer> dq = new LinkedList<>();
		int[] res = new int[nums.length-k+1];
		int r = 0;
		for(int i=0;i<k;i++){
			while(!dq.isEmpty() && nums[i]>=dq.peekLast()){
				dq.pollLast();
			}
			dq.offerLast(i);
		}
		res[r++] = nums[dq.peekFirst()];
		for(int i=k;i<nums.length;i++){
			if(!dq.isEmpty() && dq.peekFirst()==i-k){
				dq.pollFirst();
			}
			while(!dq.isEmpty() && nums[i]>=dq.peekLast()){
				dq.pollLast();
			}
			dq.offerLast(i);
			res[r++] = nums[dq.peekFirst()];
		}
		return res;
	}
	public static void main(String[] args){
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] res = maxSlidingWindow(nums,k);
		System.out.print("the max slinding window is: ");
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}