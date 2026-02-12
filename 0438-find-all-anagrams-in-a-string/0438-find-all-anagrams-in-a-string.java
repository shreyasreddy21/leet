class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int a[]=new int[256];
        int b[]=new int[256];
        List<Integer> ans=new ArrayList<>();
        for(char c: p.toCharArray())
        {
            a[c-'a']++;
        }
        int k=p.length();
        for(int i=0;i<s.length();i++)
        {
            b[s.charAt(i)-'a']++;
            if(i>=k)
            {
                b[s.charAt(i-k)-'a']--;
            }
            if(matches(a,b))
            {
                ans.add(i-k+1);
            }
        }
        return ans;
    }
    private static boolean matches(int[] a,int[] b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
    }
}