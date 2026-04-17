class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:nums)
        {
            m.put(n,m.getOrDefault(n,0)+1);
        }
        List<Integer>[] l=new List[nums.length+1];
        for(int m1:m.keySet())
        {
            int f=m.get(m1);
            if(l[f]==null)
            {
                l[f]=new ArrayList<>();
            }
            l[f].add(m1);
        }
        int idx=0;
        for(int i=l.length-1;i>=0&&idx<k;i--)
        {
            if(l[i]!=null)
            {
                for(int x:l[i])
                {
                    res[idx++]=x;
                    if(idx==k)
                    {
                        break;
                    }
                }
            }
        }
        return res;
    }
}