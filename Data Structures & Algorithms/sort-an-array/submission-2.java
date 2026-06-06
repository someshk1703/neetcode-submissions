class Solution {
    public int[] sortArray(int[] nums) {
        for(int left=0; left<nums.length-1; left++){
            int temp = 0;
            for(int right = left+1; right<nums.length;right++){
                if(nums[left]>nums[right]){
                    temp = nums[right];
                    nums[right]=nums[left];
                    nums[left]=temp;
                }
            }
        }
        return nums;
    }
}