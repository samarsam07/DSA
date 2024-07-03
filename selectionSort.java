public class selectionSort {
    static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex])
                minIndex=j;
            }
            swap(arr,minIndex,i);
        }
    }
    static void swap(int arr[],int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4,6};
        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
