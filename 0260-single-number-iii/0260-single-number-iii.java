class Solution {
    public int[] singleNumber(int[] nums) {
        int a=0,b=0;
        int x=0,y=0;
        for(int n:nums)
        {
            x^=n;
        }
        y=x&(-x);
        for(int n:nums)
        {
            if((n&y)!=0)
            {
                a^=n;
            }
            else
            {
                b^=n;
            }
        }
        return new int[]{a,b};
    }
}