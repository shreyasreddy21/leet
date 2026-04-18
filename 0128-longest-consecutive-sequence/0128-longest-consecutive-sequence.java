class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int m=0;
        for(int n:nums)
        {
            s.add(n);
        }
        for(int n:s)
        {
            if(!s.contains(n-1))
            {
                int n1=n;
                int c=1;
                while(s.contains(n1+1))
                {
                    n1+=1;
                    c+=1;
                }
                m=Math.max(m,c);
            }
        }
        return m;
    }
}