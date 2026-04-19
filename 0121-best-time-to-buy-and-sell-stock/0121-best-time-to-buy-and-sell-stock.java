class Solution {
    public int maxProfit(int[] prices) {
        int s=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<s)
            {
                s=prices[i];
            }
            else
            {
                int p=prices[i]-s;
                max=Math.max(max,p);
            }
        }
        return max;
    }
}