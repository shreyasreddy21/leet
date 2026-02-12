class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int s=0,c=0;
        h.put(0,1);
        for(int x:nums)
        {
            s+=x;
            if(h.containsKey(s-k))
            {
                c+=h.get(s-k);
            }
            h.put(s,h.getOrDefault(s,0)+1);

        }
        return c;
    }
}