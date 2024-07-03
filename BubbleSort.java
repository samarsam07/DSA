import java.util.*;



public class BubbleSort {
    static void bubblesort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    swapped=true;
                    swap(arr,j,j+1);
                }
            }
            if (swapped==false) {
            break;
            }
        }
    }
     static void swap(int arr[],int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int arr[]={21,1,1,1,1,1,1,3,10,100,3,9};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // leetcode question
    // static List<Integer> find(int nums[],int target){
    //     bubblesort(nums);
    //     List<Integer> ans=new ArrayList<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (target<nums[i]) {
    //             break;
    //         }
    //         if (target==nums[i]) {
    //             ans.add(i);
    //         }
    //     }
    //     return ans;
    // }
}
