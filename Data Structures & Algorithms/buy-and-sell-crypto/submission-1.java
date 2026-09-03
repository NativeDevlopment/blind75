class Solution {
    public int maxProfit(int[] prices) {
        int l=1;
        int r = prices.length-1;
       int  profit=0;
       int maxProfit=0;
       int minPrice= prices[0];
       while (l <= r){
        minPrice= Math.min( prices[l],minPrice);
        profit = prices[l]-minPrice;
        l++;
        
        maxProfit= Math.max (maxProfit,profit);
       }
       return maxProfit;
    }
}
