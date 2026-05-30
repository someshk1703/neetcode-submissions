class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            boolean val = seen.contains(num);
            if(val){
                return true;
            }
            else{
                seen.add(num);
            }
        }
        return false;
    }
}