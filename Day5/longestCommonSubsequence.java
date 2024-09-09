package Day5;

/* A Dynamic Programming implementation of LCS problem in Java */
public class longestCommonSubsequence {

    /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
    int lcs(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        longestCommonSubsequence lcs = new longestCommonSubsequence();
        String s1 = "AGGTAB";
        String s2 = "SAHIL";

        System.out.println("Length of LCS is " + lcs.lcs(s1, s2));
    }
}