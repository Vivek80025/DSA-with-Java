package DivideConquer_GreedyApproach;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {
    public static int[][] mergeOverlap(int[][] intervals){
        //sort the intervals array on the basis of start ele in incr order
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        LinkedList<int[]> merge = new LinkedList<>();
        for(int i=0;i<intervals.length;i++){
            if(merge.isEmpty() || merge.getLast()[1]<intervals[i][0]){
                merge.add(intervals[i]);
            }
            else{
                merge.getLast()[1] = Math.max(merge.getLast()[1],intervals[i][1]);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = mergeOverlap(intervals);
        //print the final intervals(merge)
        for(int[] arr : merge) {
            for (int a : arr) {
                System.out.print(a + " ");
            }

        }
    }
}
