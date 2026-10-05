class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int maxQty = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            }
            int current = prices[i] - minValue;
            if (current >= maxQty) {
                maxQty = current;
            }
        }
        return maxQty;
    }
}
