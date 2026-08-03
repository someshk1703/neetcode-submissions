class Solution {
    public int lastStoneWeightII(int[] stones) {
        int stonesum = 0;
        for(int stone : stones) stonesum += stone;

        int target = stonesum/2;
        int[] dp = new int[target+1];

        for(int stone : stones){
            for(int t=target; t>=stone; t--){
                dp[t] = Math.max(dp[t],dp[t-stone]+ stone);
            }
        }
        return stonesum-2*dp[target];
    }
}