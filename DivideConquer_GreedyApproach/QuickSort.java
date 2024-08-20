package DivideConquer_GreedyApproach;
import java.util.*;
public class QuickSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partion(int[] arr,int s,int e){
        int pivot = arr[s];
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<pivot){
                count++;
            }
        }
        int pivotIndex = s + count;
        swap(arr,s,pivotIndex);
        int i = s;
        int j = e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>=pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int p = partion(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }
    public static void main(String[] args){
        int[] arr = {1,40,3,90,1000,6};
        int n = arr.length;
        System.out.println("array before sorting: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        quickSort(arr,0,n-1);
        System.out.println("array after sorting: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
