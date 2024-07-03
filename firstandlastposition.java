import java.util.ArrayList;

public class firstandlastposition {
    static ArrayList<Integer> search(int arr[],int target){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(firstposition(arr, target));
        ans.add(lastposition(arr, target));
        return ans;
    }
    static int firstposition(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=start +(end-start)/2;
        int ans=-1;
        while(start<=end){
            if(arr[mid]==target){
                 ans=mid;
                 end=mid-1;
            }
            else if(arr[mid]< target){
                start=mid +1;
            }else{
                end=mid-1;
            }
            mid=start +(end-start)/2;
        }
    
       
        return ans;
    }
    static int lastposition(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=start +(end-start)/2;
        int ans=-1;
        while(start<=end){
            if(arr[mid]==target){
                 ans=mid;
                start=mid +1;
            }
            else if(arr[mid]< target){
                start=mid +1;
            }else{
                end=mid-1;
            }
            mid=start +(end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,4};
        int target=3;
        System.out.println(search(arr, target));
    }
}
