class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        // }
        // int a=0;
        // if(target>nums[nums.length-1])
        // {
        //     return nums.length;
        // }
        // else if(target<nums[0])
        // {
        //     return 0;
        // }
        // else
        // {
        //     for(int i=0;i<nums.length-2;i++)
        // {
        //     if(nums[i]<target&&nums[i+1]>target)
        //     {
        //         a=i+1;
        //     }
        // }
        }
        return l;
    }
}