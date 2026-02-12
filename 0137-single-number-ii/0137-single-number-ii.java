class Solution {
    public int singleNumber(int[] nums) {
        int x=0,y=0;
        for(int i=0;i<nums.length;i++)
        {
            x^=nums[i]&(~y);
            y^=nums[i]&(~x);
        }
        return x;
    }
}