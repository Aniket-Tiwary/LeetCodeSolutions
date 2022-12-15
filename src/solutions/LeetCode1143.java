package solutions;

public class LeetCode1143 {

    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length()+1;
        int m = text2.length()+1;
        int[][] dp = new int[n][m];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else{
                    if(text1.charAt(i-1) == text2.charAt(j-1))
                        dp[i][j] = 1 + dp[i-1][j-1];
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String args[]){
        String text1 = "abcde";
        String text2 = "abc";
        System.out.println("Longest Common Subsequence between the two strings are : " + longestCommonSubsequence(text1,text2));
    }
}
