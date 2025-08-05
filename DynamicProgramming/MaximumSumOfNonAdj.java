package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumSumOfNonAdj {
    public  static  int maximumSumOfNonAdj(int[] nums){
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return dp(nums,0,dp);

    }
    private  static  int helper(int i,int []nums){
        if(i>=nums.length){
            return 0;
        }
        if(i==nums.length-1)return  nums[i];
        int include=helper(i+2,nums)+nums[i];
        int exclude=helper(i+1,nums);

        return  Math.max(include,exclude);
    }
    private static  int dp(int[] nums,int i,int[] dp){
        if(i>= nums.length)return 0;
        if(i==nums.length-1)return nums[i];
        if(dp[i]!=-1)return  dp[i];
        int include=dp(nums,i+2,dp)+nums[i];
        int exclude=dp(nums,i+1,dp);
        dp[i]=Math.max(include,exclude);
        return dp[i];
    }

    public static void main(String[] args) {
        int []nums={9,9,8,2};
        System.out.println(maximumSumOfNonAdj(nums));
    }
}
