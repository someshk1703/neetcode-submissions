class Solution {
    List<List<Integer>> res;
    List<Integer> subset;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        subset = new ArrayList<>();
        Arrays.sort(nums);

        dfs(0, subset, 0, nums, target);
        return res;

    }
    public void dfs(int i, List<Integer> subset, int total, int[] nums, int target){
        if(target==total){
            res.add(new ArrayList<>(subset));
            return;
        }

        for(int j=i; j<nums.length; j++){
            if(total+nums[j]>target) return;

            subset.add(nums[j]);
            dfs(j,subset, total+nums[j], nums, target);
            subset.remove(subset.size()-1);
        }
    }
}
