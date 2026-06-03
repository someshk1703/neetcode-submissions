class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while(left<right){
            int area = 0;
            if(heights[left]<heights[right]){
                area = (right - left) * heights[left];
                left++;
            }
            else{
                area = (right - left) * heights[right];
                right--;
            }
            if(area>max){
                max = area;
            }
        }
        return max;
    }
}
