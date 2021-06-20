class Solution {
    public int maxProfit(int[] prices) {
       int buy = prices[0], sell = 0 , maxProfit = 0, n = prices.length;
       
       for (int i=1; i<n; i++) {
               
             if (prices[i] < buy)
                 buy = prices[i];

             int diff = prices[i] - buy;
               
             if (diff < 0)
                  maxProfit = 0;
             else if (diff > maxProfit)
                  maxProfit = diff;
     
       }
            return maxProfit;
    }
}