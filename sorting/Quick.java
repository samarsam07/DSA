package sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int arr[]={2,1,3,41,19,29,6,8,1,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr,int s,int e){
        if(s>=e)return;

        int pivotIndex=partition(arr,s,e);

        quickSort(arr, s, pivotIndex-1);
        quickSort(arr,  pivotIndex+1,e);
    }
    static int partition(int []arr,int s,int e){
        int pivot=arr[s];
        int count=0;
        for (int index = s+1; index <=e; index++) {
            if(arr[index]<=pivot)count++;
        }
        int pivotIndex=s+count;
        swap(arr,s,pivotIndex);
        int i=s;
        int j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot ){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            } 
        }
        return pivotIndex;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
