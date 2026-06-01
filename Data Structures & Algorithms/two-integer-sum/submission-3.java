class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> present = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            if(present.containsKey(needed)){
                return new int[]{present.get(needed),i};
            }
            else{
                present.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
