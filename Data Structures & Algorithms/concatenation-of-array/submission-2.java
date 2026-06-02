class Solution {
    public int[] getConcatenation(int[] nums) {
        int size2 = nums.length*2;
        int[] nums2 = new int[size2];
        for(int i=0; i<nums.length; i++){
            nums2[i] = nums[i];
            nums2[nums.length+i] = nums[i];
        }
        return nums2;
    }
}