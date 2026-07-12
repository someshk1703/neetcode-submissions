public class Solution {
    List<List<Integer>> res;
    List<Integer> subset;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        subset = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, subset, 0, candidates, target);
        return res;
    }

    public void dfs(int i, List<Integer> subset, int tot, int[] candidates, int target) {
        if (tot == target) {
            res.add(new ArrayList<>(subset));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
            if (tot + candidates[j] > target) {
                break;
            }

            subset.add(candidates[j]);
            dfs(j + 1, subset, tot + candidates[j], candidates, target);
            subset.remove(subset.size() - 1);
        }
    }
}