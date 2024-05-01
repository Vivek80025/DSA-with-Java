//Time Complexity : O(n)
//Space Complexity : O(n)
import java.util.*;
public class LargestRactangle{
	public static int[] nextSmaller(int[] heights){
		int[] ns = new int[heights.length];
		Stack<Integer> s1 = new Stack<>();
		for(int i=heights.length-1;i>=0;i--){
			while(!s1.isEmpty() && heights[s1.peek()]>=heights[i]){
				s1.pop();
			}
			if(s1.isEmpty()){
				ns[i] = heights.length;
			}
			else{
				ns[i] = s1.peek();
			}
			s1.push(i);
		}
		return ns;
	}
	public static int[] prevSmaller(int[] heights){
		int[] ps = new int[heights.length];
		Stack<Integer> s2 = new Stack<>();
		for(int i=0;i<heights.length;i++){
			while(!s2.isEmpty() && heights[s2.peek()]>=heights[i]){
				s2.pop();
			}
			if(s2.isEmpty()){
				ps[i] = -1;
			}
			else{
				ps[i] = s2.peek();
			}
			s2.push(i);
		}
		return ps;
	}
	public static int largestRactangle(int[] heights){
		int[] ns = nextSmaller(heights);
		int[] ps = prevSmaller(heights);
		int maxArea = Integer.MIN_VALUE;
		for(int i=0;i<heights.length;i++){
			int area = (ns[i] - ps[i] - 1) * heights[i];
			maxArea = Math.max(maxArea,area);
		}
		return maxArea;
	}
	public static void main(String[] args){
		int[] heights = {2,1,5,6,2,3};
		System.out.println("area of largest ractangle in the histogram is : "+largestRactangle(heights)); 
	}
}