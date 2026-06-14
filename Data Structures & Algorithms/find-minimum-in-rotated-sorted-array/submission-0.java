class Solution {
    public int findMin(int[] nums) {
        int minnum = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            minnum = Math.min(minnum,nums[i]);
        }
        return minnum == Integer.MAX_VALUE ? 0 : minnum;
    }
}
