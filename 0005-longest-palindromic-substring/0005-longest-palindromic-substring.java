class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        boolean[][] dp = new boolean[s.length()][s.length()];

        for(int i=s.length()-1; i>-1; i--){
            for(int j=i; j<s.length(); j++){
                if(i==j){
                    dp[i][j] = true;
                } else if(i+1==j){
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
                }
                if(dp[i][j] == true && j - i > end - start){
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end+1);

    }
}