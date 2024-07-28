import java.util.Arrays;

public class mergesort {
    static void mergeSort(int arr[],int start,int end){
        if(start>=end){
            return ;
        }
        int mid=start+(end-start)/2;
        // left part
        mergeSort(arr,start,mid);
        // right part
        mergeSort(arr,mid+1,end);

        // merge arrays
        merge(arr,start,end);

    }
    static void merge(int arr[],int start,int end){
        int mid=start+(end-start)/2;
        int len1=mid-start +1;
        int len2=end-mid;
        int first[]=new int[len1];
        int second[]=new int[len2];
    // copy values
        int mainIndex=start;
        for (int i = 0; i < len1; i++) {
            first[i]=arr[mainIndex++];
        }
        mainIndex=mid+1;
        for (int i = 0; i < len2; i++) {
            second[i]=arr[mainIndex++];
        }
    // merge two array
        int index1=0;
        int index2=0;
        mainIndex=start;
        while(index1<len1 && index2<len2){
            if(first[index1]<second[index2]){
                arr[mainIndex++]=first[index1++];
            }
            else{
                arr[mainIndex++]=second[index2++];
            }
        }
        while (index1<len1) {
            arr[mainIndex++]=first[index1++];
        }
        while (index2<len2) {
            arr[mainIndex++]=second[index2++];
        }
    }

    public static void main(String[] args) {
        int arr[]={2,1,5,3,6,723};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
