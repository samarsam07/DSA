import java.util.ArrayList;

public class Lcs {
    public static void main(String[] args) {
        Lcs lcs = new Lcs();
        System.out.println(lcs.dplongestCommonSubsequenceTabulation("abcde", "ace"));
    }

    // Recursive solution
    public int longestCommonSubsequence(String text1, String text2) {
        return helper(text1, text2, 0, 0);
    }

    private int helper(String s, String w, int i, int j) {
        if (i >= s.length()) return 0;
        if (j >= w.length()) return 0;
        if (s.charAt(i) == w.charAt(j)) {
            return 1 + helper(s, w, i + 1, j + 1);
        }
        int len1 = helper(s, w, i + 1, j);
        int len2 = helper(s, w, i, j + 1);
        return Math.max(len1, len2);
    }

    // Dynamic programming solution with memoization
    public int dplongestCommonSubsequence(String text1, String text2) {
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < text1.length(); i++) {
            dp.add(new ArrayList<>());
            for (int j = 0; j < text2.length(); j++) {
                dp.get(i).add(-1);
            }
        }
        return solve(text1, text2, 0, 0, dp);
    }

    private int solve(String s, String w, int i, int j,     ArrayList<ArrayList<Integer>> dp) {
        if (i >= s.length()) return 0;
        if (j >= w.length()) return 0;
        if (dp.get(i).get(j) != -1) return dp.get(i).get(j);
        int ans = 0;
        if (s.charAt(i) == w.charAt(j)) {
            ans = 1 + solve(s, w, i + 1, j + 1, dp);
        } else {
            int len1 = solve(s, w, i + 1, j,dp);
            int len2 = solve(s, w, i, j + 1,dp);
            ans = Math.max(len1, len2);
        }
        dp.get(i).set(j, ans);
        return ans;
    }

    // Tabulation solution
    public int dplongestCommonSubsequenceTabulation(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[text1.length()][text2.length()];
    }
}
