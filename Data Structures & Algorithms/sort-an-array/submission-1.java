class Solution {
    public int[] sortArray(int[] nums) {
        int mid = nums.length/2;
        if(nums.length<=1){
            return nums;
        }
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid,nums.length);

        left = sortArray(left);
        right = sortArray(right);

        return merge(left,right);

    }

    public int[] merge(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int[] result = new int[left.length + right.length];
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                result[k] = left[i];
                i++;
                k++;
            }
            else{
                result[k] = right[j];
                j++;
                k++;
            }
        }
        while(i < left.length){
            result[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
}