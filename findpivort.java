public class findpivort {
    static int getpivort(int arr[]){
        int s=0;int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return s;
    }public static void main(String[] args) {
        int arr[]={3,8,11,13,1,2};
        System.out.println(getpivort(arr));
    }
}
