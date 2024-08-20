package DivideConquer_GreedyApproach;
import java.util.*;
public class InversionsCnt {
    public static int merge(int[] arr,int l,int mid,int r){
        int[] left = Arrays.copyOfRange(arr,l,mid+1);
        int[] right = Arrays.copyOfRange(arr,mid+1,r+1);
        int i = 0;
        int j = 0;
        int k = l;
        int swap = 0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                //count += (mid+1) - (l+i);
                swap += left.length - i;
            }
        }
        while(i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length){
            arr[k++] = right[j++];
        }
        return swap;

    }
    public static int cntInversions(int[] arr,int l,int r){
        int count = 0;
        if(l<r){
            int mid = l + (r - l)/2;
            count += cntInversions(arr,l,mid);
            count += cntInversions(arr,mid+1,r);
            count += merge(arr,l,mid,r);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,2,3,4,5};
        int res = cntInversions(arr,0,arr.length-1);
        System.out.println("total no. of Inversions is: "+res);
    }
}
