class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            if (nums[left] == val) {
                // Swap/overwrite with the element from the back
                nums[left] = nums[right];
                right--; // Reduce the active array size boundaries
            } else {
                left++; // Element is valid, move forward
            }
        }
        return left;
    }
}