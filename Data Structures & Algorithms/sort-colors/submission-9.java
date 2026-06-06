class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap mid with low
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Element is in the correct middle zone
                mid++;
            } else if (nums[mid] == 2) {
                // Swap mid with high
                swap(nums, mid, high);
                high--;
                // Notice we don't increment mid here because the swapped element 
                // from 'high' could be a 0 or 1 and needs evaluation next turn.
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}