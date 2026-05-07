class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        if(strs==null||strs.length==0)
        {
            return s;
        }
        String f=strs[0];
        for(int i=0;i<f.length();i++)
        {
            char c=f.charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length()||strs[j].charAt(i)!=c)
                {
                    s=f.substring(0,i);
                    return s;
                }
            }
        }
        return f;
    }
}