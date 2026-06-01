class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int tempmax = 0;
        int max = 0;
        int current = 0;
        for(int num: nums)
            seen.add(num);
        for(int num: seen){    
            if(!seen.contains(num-1)){
                tempmax = 1;
                current = num;
                while(seen.contains(current+1)){
                    current++;
                    tempmax++;
                }
                max = Math.max(max, tempmax);
            }
        }
        return max;
    }
}
