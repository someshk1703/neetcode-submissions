class Solution {
    public int maxProfit(int[] prices) {
        // int left = 0;
        // int right = prices.length-1;
        // int max = 0;
        // while(left<right){
        //     if(prices[left]<prices[right]){
        //         max = prices[right]-prices[left];
        //         right--;
        //     }
        //     else{
        //         left++;
        //     }
        // }
        // return max;
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}