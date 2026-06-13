class Solution {
    public int maxProfit(int[] prices) {
        int tot = 0;
        int maxprofit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[tot]){
                maxprofit = Math.max(maxprofit, prices[i]-prices[tot]);
            }
            else {
                tot = i;
            }
        }
        return maxprofit;
    }
}
