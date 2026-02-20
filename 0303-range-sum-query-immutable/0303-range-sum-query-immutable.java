class NumArray {
    int BIT[];
    public NumArray(int[] nums) {
        BIT=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            BIT[i+1]=BIT[i]+nums[i];
        }
    }
    public int sumRange(int left, int right) {
        return BIT[right+1]-BIT[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */