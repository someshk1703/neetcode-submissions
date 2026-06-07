class Solution {
    public int subarraySum(int[] nums, int k) {
        // Map to store: Key = Prefix Sum, Value = Frequency of this Prefix Sum
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        // Base case: A prefix sum of 0 has been seen exactly 1 time (before processing any elements)
        prefixSumMap.put(0, 1);
        
        int currentPrefixSum = 0;
        int totalSubarrays = 0;
        
        for (int num : nums) {
            // Update the running cumulative sum
            currentPrefixSum += num;
            
            // If (currentPrefixSum - k) exists in our history, we found matching subarray(s)
            int targetPrefixSum = currentPrefixSum - k;
            if (prefixSumMap.containsKey(targetPrefixSum)) {
                totalSubarrays += prefixSumMap.get(targetPrefixSum);
            }
            
            // Record the current prefix sum into the map
            prefixSumMap.put(currentPrefixSum, prefixSumMap.getOrDefault(currentPrefixSum, 0) + 1);
        }
        
        return totalSubarrays;
    }
}