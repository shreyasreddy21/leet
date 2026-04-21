class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }
    public void backtrack(List<String> l,String s,int open,int close,int n)
    {
        if(s.length()==2*n)
        {
            l.add(s);
            return;
        }
        if(open<n)
        {
            backtrack(l,s+"(",open+1,close,n);
        }
        if(close<open)
        {
            backtrack(l,s+")",open,close+1,n);
        }
    }
}