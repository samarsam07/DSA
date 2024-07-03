public class Binarysearch {
    static int binarysearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=start +(end-start)/2;
        while(start<=end){
            if(arr[mid]==target){
                 return mid;
            }
            else if(arr[mid]< target){
                start=mid +1;
            }else{
                end=mid-1;
            }
            mid=start +(end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,8,11,28};
        int target=1;
        System.out.println(binarysearch(arr, target));
    }
}
