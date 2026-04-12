class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backtrack(l,new ArrayList<>(),nums,used);
        return l;
    }
    public void backtrack(List<List<Integer>> l,List<Integer> curr,int[] nums,boolean[] used)
    {
        if(curr.size()==nums.length)
        {
            l.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            used[i]=true;
            curr.add(nums[i]);
            backtrack(l,curr,nums,used);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
}