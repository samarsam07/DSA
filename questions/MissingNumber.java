package questions;
// Given an unsorted array arr[] with both positive and negative elements, find the smallest positive number missing from the array.



public class MissingNumber {
    public static int missingNumber(int[] nums){
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length+1;
    }
    public static void cycleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }
}
