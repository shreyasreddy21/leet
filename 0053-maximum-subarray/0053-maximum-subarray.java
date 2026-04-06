class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int c=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            c=Math.max(nums[i],c+nums[i]);
            max=Math.max(max,c);
        }
        return max;
    }
}