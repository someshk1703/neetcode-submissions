class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int curmax=1, curmin=1, temp = 0;

        for(int num:nums){
            temp = num*curmax;
            curmax = Math.max(Math.max(num*curmax, num*curmin), num);
            curmin = Math.min(Math.min(temp, num*curmin), num);
            res = Math.max(res, curmax);
        }
        return res;
    }
}
