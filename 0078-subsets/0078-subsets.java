class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> l1=new ArrayList<>();
        int t=1<<n;
        for(int i=0;i<t;i++)
        {
            List<Integer> l2=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    l2.add(nums[j]);
                }
            }
            l1.add(l2);
        }
        return l1;
    }
}