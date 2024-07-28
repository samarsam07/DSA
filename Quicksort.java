import java.util.Arrays;

public class Quicksort {
   static void quicksort(int arr[],int s,int e){
    if(s>=e){
        return;
    }

    int p=partition(arr,s,e);

    //  sort left part
    quicksort(arr, s, p-1);
    // sort right part
    quicksort(arr, p+1, e);
    }
    static int partition(int arr[],int s,int e){
        int pivot=arr[s];
        int count =0;
        for (int i = s+1; i <= e; i++) {
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex=s+count;
        swap(arr, s, pivotIndex);
        int i=s;
        int j=e;
        while(i<pivotIndex && j >pivotIndex){
            while(arr[i]<pivot){
                i++;
            }
            while (arr[j]>pivot) {
                j--;
            }
            if(i<pivotIndex && j> pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        
        return pivotIndex;
    }
    static void swap(int arr[],int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,3,6,723};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
