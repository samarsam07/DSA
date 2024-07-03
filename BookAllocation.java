public class BookAllocation {
    static int allocatebook(int arr[],int m){
        int s=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        int e=sum;
        int ans=-1;
        int mid=s+(e-s)/2;
        while (s<=e) {
            if (ispossible(arr,mid,m)) {
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;

    }
    static boolean ispossible(int arr[],int mid,int m){
        int studentcount=1;
        int pagesum=0;
        for (int i = 0; i < arr.length; i++) {
            if(pagesum+arr[i]<= mid){
                pagesum+=arr[i];
            }
            else{
                studentcount++;
                if(studentcount > m || arr[i]>mid ){
                    return false;
                }
                pagesum=arr[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={10,500,30,40};
        int m=2;
        System.out.println(allocatebook(arr, m));
    }
}
