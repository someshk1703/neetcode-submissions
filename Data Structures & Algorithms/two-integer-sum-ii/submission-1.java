class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++){
            int needed = target - numbers[i];
            int j = i+1;
            while(j<numbers.length){
                if(needed==numbers[j]){
                    return new int[]{i + 1, j + 1};
                }
                j++;
            }
        }
        return new int[]{-1,-1};
    }
}
