package Heap_and_PriorityQueue;

public class HeapSort {
    public static void heapify(int[] arr,int i,int n){
        int largest = i;
        int leftIdx = 2*i+1;
        int rightIdx = 2*i+2;
        if(leftIdx<n && arr[largest]<arr[leftIdx]){
            largest = leftIdx;
        }
        if(rightIdx<n && arr[largest]<arr[rightIdx]){
            largest = rightIdx;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,largest,n);
        }
    }
    public static void buildMaxHeap(int[] arr,int n){
        int startIdx = (n/2)-1;
        for(int i=startIdx;i>=0;i--){
            heapify(arr,i,n);
        }
    }
    public static void heapSort(int[] arr,int n){
        buildMaxHeap(arr,n);
        //t.c = n*logn
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,13,10,9,8,15,17};
        int n = arr.length;
        heapSort(arr,n);
        //display sorted array
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
