package DynamicProgramming;

import java.util.Arrays;

public class CutSegment {
    public static int cutSegment(int n,int x,int y,int z){
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=dp(n,x,y,z,dp);
        if (ans<0)return -1;
        return ans;
    }

    private static int solve(int n, int x, int y, int z) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MIN_VALUE;
        int a=solve(n-x,x,y,z)+1;
        int b=solve(n-y,x,y,z)+1;
        int c=solve(n-z,x,y,z)+1;
        return Math.max(a,Math.max(b,c));
    }
    private static int dp(int n,int x,int y,int z,int[] dp){
        if (n == 0) return 0;
        if (n < 0) return Integer.MIN_VALUE;
        if(dp[n]!=-1)return  dp[n];
        int a=dp(n-x,x,y,z,dp)+1;
        int b=dp(n-y,x,y,z,dp)+1;
        int c=dp(n-z,x,y,z,dp)+1;
        dp[n]= Math.max(a,Math.max(b,c));
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(cutSegment(6,5,2,2));
    }
}
