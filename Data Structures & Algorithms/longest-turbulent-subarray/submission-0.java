class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if(n == 1) return 1;

        int[][] dp = new int[n][2];
        for(int i=0; i<n; i++) dp[i][0] = dp[i][1] = 1;

        int maxLength = 1;
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]) dp[i][1] = dp[i-1][0] + 1;
            else if(arr[i] < arr[i-1]) dp[i][0] = dp[i-1][1] + 1;

            maxLength = Math.max(maxLength, dp[i][0]);
            maxLength = Math.max(maxLength, dp[i][1]);
        }
        return maxLength;
    }
}