package DynamicProgramming;

import java.util.Arrays;

public class HouseRobbber {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int first=dp(nums,0,dp1,n-1);
        int last=dp(nums,1,dp2,n);
        return Math.max(first,last);

    }
    private static  int dp(int[] nums,int i,int[] dp,int end){
        if(i>=end)return 0;
        if(i==end-1)return nums[i];
        if(dp[i]!=-1)return  dp[i];
        int include=dp(nums,i+2,dp,end)+nums[i];
        int exclude=dp(nums,i+1,dp,end);
        dp[i]=Math.max(include,exclude);
        return dp[i];
    }
}
