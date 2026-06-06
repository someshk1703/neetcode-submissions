class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int needed = target - nums[i];
            if(set.containsKey(needed)){
                return new int[]{set.get(needed),i};
            }
            set.put(nums[i],i);
        }
        return new int[0];
    }
}
