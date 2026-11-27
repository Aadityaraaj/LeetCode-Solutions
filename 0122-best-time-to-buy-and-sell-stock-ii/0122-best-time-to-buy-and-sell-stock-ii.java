class Solution {
    public int maxProfit(int[] prices) {
        int netProfit = 0;
        int costPrice = prices[0];


        for (int currPrice : prices) {
            if (costPrice < currPrice)
                netProfit += currPrice - costPrice;


            costPrice = currPrice;
        }


        return netProfit;
    }
}