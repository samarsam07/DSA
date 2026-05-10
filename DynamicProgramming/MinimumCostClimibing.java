package DynamicProgramming;
public class MinimumCostClimibing {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int []dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        dp[n]=Math.min(helper(n-1,cost,dp),helper(n-2,cost,dp));
        return dp[n];
    }
    private int helper(int n,int[] cost,int dp[]){
        if(n==0){
            return cost[n];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1)return dp[n];
        dp[n]=Math.min(helper(n-1,cost,dp),helper(n-2,cost,dp))+cost[n];
        return dp[n];  
    }
}
