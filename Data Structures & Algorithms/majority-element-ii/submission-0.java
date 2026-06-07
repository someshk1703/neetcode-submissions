class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        // Step 1: Initialize candidates and counters
        // We initialize candidates with 0, counters with 0 handles placeholder states safely.
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        // Pass 1: Find potential candidates using elimination
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                // Found a triplet of 3 distinct numbers. Discard one from each.
                count1--;
                count2--;
            }
        }

        // Pass 2: Verify if the candidates actually appear more than floor(N/3) times
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++; // Use else-if to avoid double counting if candidate1 == candidate2
        }

        int threshold = nums.length / 3;
        if (count1 > threshold) result.add(candidate1);
        if (count2 > threshold) result.add(candidate2);

        return result;
    }
}