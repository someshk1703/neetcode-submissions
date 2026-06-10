class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxprofit = 0;
        while(sell<prices.length){
            if(prices[sell]>prices[buy]){
                maxprofit = Math.max(maxprofit, prices[sell]-prices[buy]);
            }else{
                buy = sell;
            }
            sell++;
        }
        return maxprofit;
    }
}
