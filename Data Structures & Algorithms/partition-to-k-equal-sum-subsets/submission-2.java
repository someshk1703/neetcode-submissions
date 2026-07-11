class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int tot = Arrays.stream(nums).sum();
        if(tot%k!=0) return false;

        int length = tot / k;
        int[] side = new int[k];
        Arrays.sort(nums);
        reverse(nums);
        return dfs(nums, side, 0,length, k);
    }

    public boolean dfs(int[] nums, int[] side, int i, int l, int k){
        if(i==nums.length) return true;

        for(int j=0; j<k; j++){
            if(side[j] + nums[i] <= l){
                side[j] += nums[i];
                if (dfs(nums, side, i + 1, l, k)) return true;
                side[j] -= nums[i];
            }
            if (side[j] == 0) break;
        }
        return false;
    }


    public void reverse(int[] nums){
        for(int i=0, j=nums.length-1; i<j; i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}