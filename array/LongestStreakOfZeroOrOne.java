package array;

public class LongestStreakOfZeroOrOne {
    // [0, 1, 0, 1, 1, 1, 1]
    static public int maxConsecutiveOne(int []nums){
        int max=0;
        int count=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev){
                count++;
            }else{
                prev=nums[i];
                count=1;
            } 
            max=Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={0, 1, 0, 0, 0, 0, 1};
        System.out.println(maxConsecutiveOne(nums));
    }
}
/*
 


 */