class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return (pal(s,left+1,right)||pal(s,left,right-1));
            }
            left++;
            right--;
        }
        return true;
    }
    private static boolean pal(String s,int l,int h)
    {
        while(l<h)
        {
            if(s.charAt(l)!=s.charAt(h))
            {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}