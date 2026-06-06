class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int res = 0;
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
            if(max<map.get(n)){
                res = n;
                max=map.get(n);
            }
        }
        return res;
    }
}