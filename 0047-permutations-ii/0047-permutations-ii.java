class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> r=new ArrayList<>();
        Arrays.sort(nums);
        boolean used[]=new boolean[nums.length];
        backtrack(r,new ArrayList<>(),nums,used);
        return r;
    }
    public void backtrack(List<List<Integer>> l, List<Integer> c, int[] nums, boolean[] used)
    {
        if(c.size()==nums.length)
        {
            l.add(new ArrayList<>(c));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1])
            {
                continue;
            }
            used[i]=true;
            c.add(nums[i]);
            backtrack(l,c,nums,used);
            c.remove(c.size()-1);
            used[i]=false;
        }
    }
}