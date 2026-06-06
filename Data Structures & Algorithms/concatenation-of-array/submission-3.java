class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length*2;
        int[] arr = new int[size];
        int i = 0;
        int j = nums.length;
        for(int num: nums){
            arr[i] = num;
            arr[j] = num;
            i++;
            j++;
        }
        return arr;
    }
}