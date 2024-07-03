import java.util.*;
public class AggressiveCows {
    static int aggressiveCows(int arr[],int k){
        Arrays.sort(arr);
        int s=0;
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int ans=-1;
        int e=max;
        int mid=s+(e-s)/2;
        while (s<=e) {
            if(ispossiblesol(arr,k,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    static boolean ispossiblesol(int arr[],int k,int mid){
        int cow=1;
        int distance=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-distance>=mid){
                cow++;
                if(cow==k){
                    return true;
                }
                distance=arr[i];
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={4,2,4,5,3,6};
        int k=2;
        System.out.println(aggressiveCows(arr, k));
    }
    
}