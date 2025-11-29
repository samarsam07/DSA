package DynamicProgramming;


public class MinimumCoins {
    public static int minimumCoins(int[] coins,int target){
        // return solve(coins,target);
        int dp[]=new int[target+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int ans=dp(coins,target,dp);
        return ans;
    }
    private static int dp(int []coins,int target,int []dp){
        if(target==0) return 0;
        if(target<0) return Integer.MAX_VALUE;
        if(dp[target]!=-1)return dp[target];

        int mini=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans=solve(coins, target-coins[i]);
            if(ans!=Integer.MAX_VALUE){
                mini=Math.min(mini, ans+1);
            }
        }
        dp[target]=mini;
        return mini;
    }


    private  static int solve(int[] coins,int target){
        if(target==0) return 0;
        if(target<0) return Integer.MAX_VALUE;

        int mini=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans=solve(coins, target-coins[i]);
            if(ans!=Integer.MAX_VALUE){
                mini=Math.min(mini, ans+1);
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        int[] coins={1,500};
        System.out.println(minimumCoins(coins, 1000));
    }
}
