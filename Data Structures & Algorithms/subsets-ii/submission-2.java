class Solution {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        dfs(0, new ArrayList<>(), nums);
        return new ArrayList<>(res);    
    }
    public void dfs(int i, List<Integer> subset, int[] nums){
        if (i == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(i+1, subset, nums);
        subset.remove(subset.size()-1);
        dfs(i+1, subset, nums);
    }
}
