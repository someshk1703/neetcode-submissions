class Solution {
    public int findPeakElement(int[] nums) {
        int max = 0, index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max)
            {
                max = Math.max(max,nums[i]);
                index = i;
            }
        }
        return index;
    }
}