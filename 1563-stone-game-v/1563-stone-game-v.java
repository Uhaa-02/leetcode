import java.util.Arrays;

class Solution {
    private int[][] dp;
    private int[] Sum;

    private int f(int l, int r) {
        if (dp[l][r] != -1) return dp[l][r];
        if (l == r) return 0;

        int ans = 0;
        for (int m = l; m < r; m++) {
            int Lsum = Sum[m + 1] - Sum[l];
            int Rsum = Sum[r + 1] - Sum[m + 1];

            if (Lsum <= Rsum) ans = Math.max(ans, Lsum + f(l, m));
            if (Lsum >= Rsum) ans = Math.max(ans, Rsum + f(m + 1, r));
            
            // Pruning branch
            if (2 * Math.min(Lsum, Rsum) <= ans) break;
        }
        return dp[l][r] = ans;
    }

    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        
        // Compute prefix sums
        Sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            Sum[i + 1] = Sum[i] + stoneValue[i];
        }

        // Initialize memoization table with -1
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(0, n - 1);
    }
}