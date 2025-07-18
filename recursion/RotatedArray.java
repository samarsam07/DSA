package recursion;



public class RotatedArray {
    public static void main(String[] args) {
        int[] nums={5,6,7,8,1,2,3};
        System.out.println(rotatedArray(nums, 0, nums.length-1));
    }
    static int rotatedArray(int[] nums,int s,int e){
        if(s>e){
            return s-1;
        }
        int mid=s+(e-s)/2;
        if(mid<e && nums[mid]>nums[mid+1]){
            return mid;
        }
        if(mid>s && nums[mid]<nums[mid-1]){
            return mid-1;
        }
        if(nums[s]>nums[mid]){
            return rotatedArray(nums, s, mid-1);
        }
        return rotatedArray(nums, mid+1, e);
    }
}
