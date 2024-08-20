package DivideConquer_GreedyApproach;

import java.sql.SQLOutput;

public class KthSmallestEle {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int s,int e){
        int pivot = arr[s];
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIdx = s + count;
        swap(arr,s,pivotIdx);
        int i = s;
        int j = e;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<arr[pivotIdx]){
                i++;
            }
            while(arr[j]>arr[pivotIdx]){
                j--;
            }
            if(i<pivotIdx && j>pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static int selectionProcedure(int[] arr,int s,int e,int k){
        int p = partition(arr,s,e);
        if(p==k-1){
            return arr[p];
        }
        else if(p>k-1){
            return selectionProcedure(arr,s,p-1,k);
        }
        else{
            return selectionProcedure(arr,p+1,e,k);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,8,9,1,3,7,4,5};
        int k = 4;
        if(k<=0 || k>arr.length){
            System.out.println("invalid the value of k");
            return;
        }
        int res = selectionProcedure(arr,0,arr.length-1,k);
        System.out.println(k+"th"+" smallest value of the array is :"+res);
    }
}
