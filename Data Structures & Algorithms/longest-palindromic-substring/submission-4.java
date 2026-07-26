class Solution {
    public String longestPalindrome(String s) {
        int reslen = 0, residx = 0;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        for(int i=n-1; i>=0; i--){
            for(int j=i; j<n; j++){
                if(s.charAt(i)==s.charAt(j) && 
                    (j-i<=2 || dp[i+1][j-1])){
                        dp[i][j]=true;
                        if(reslen<(j-i+1)){
                            residx = i;
                            reslen = j -i + 1;
                        }
                    }
            }
        }
        return s.substring(residx, reslen + residx);
    }
}
