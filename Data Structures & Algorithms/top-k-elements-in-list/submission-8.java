class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Max Heap

        PriorityQueue<int[]> maxHeap = 
                new PriorityQueue<>((a, b) -> b[1] - a[1]);

        // Step 3: Add entries to heap

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {

            int number = entry.getKey();
            int frequency = entry.getValue();

            maxHeap.offer(new int[]{number, frequency});
        }

        // Step 4: Extract top k

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            int[] current = maxHeap.poll();

            // save number into result
            result[i] = current[0];
        }

        return result;
    }
}
