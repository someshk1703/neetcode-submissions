class Solution {
    public boolean canPartition(int[] nums) {
        if(sum(nums)%2 != 0) return false;

        int tar = sum(nums)/2;
        boolean[] dp = new boolean[tar+1];
        dp[0] = true;

        for(int i = 0; i < nums.length; i++){
            for(int j = tar; j >= nums[i]; j--) 
                dp[j] = dp[j] || dp[j-nums[i]];
        }

        return dp[tar];
    }

    public int sum(int[] nums){
        int tot=0;
        for(int num : nums) tot += num;
        return tot;
    }
}
