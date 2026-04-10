class Solution {
    public int reverse(int x) {
        int y=x;
        int s=0;
        while(y!=0)
        {
            int r=y%10;
            if(s>Integer.MAX_VALUE/10||(r==Integer.MAX_VALUE/10)&&r>7)
            {
                return 0;
            }
            if(s<Integer.MIN_VALUE/10||(r==Integer.MIN_VALUE/10)&&r<-8)
            {
                return 0;
            }
            s=s*10+r;
            y/=10;
        }
        return s;
    }
}