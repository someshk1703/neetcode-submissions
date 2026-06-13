class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int ans = right;

        while(left<=right){
            int k = left+(right-left)/2;
            int hours = 0;
            for (int pile : piles) {
                hours += (pile + k - 1) / k; // ceiling division
            }

            if(hours<=h) {
                ans = Math.min(ans, k);
                right = k-1;
            }
            else left=k+1;    
        }
        return ans;
    }
}
