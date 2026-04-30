class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int s=0;
        if(x<0)
        {
            return false;
        }
        while(t>0)
        {
            int r=t%10;
            s=(s*10)+r;
            t/=10;
        }
        if(s==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}