class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            int left = i + 1;
            while(left<=nums.length-1){
                if(nums[i]==nums[left] && left-i<=k){
                    return true;
                }
                left++;
            }
        }
        return false;
    }
}