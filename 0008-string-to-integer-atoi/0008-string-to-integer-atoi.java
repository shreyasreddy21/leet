class Solution {
    public int myAtoi(String s) {
        // int t=0;
        // int t1=0;
        // int t2=0;
        // int t3=0;
        // String x="";
        // String abc="aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)==' ')
        //     {
        //         if(t1==0)
        //         {
        //             continue;
        //         }
        //         else
        //         {
        //             break;
        //         }
        //     }
        //     else if(s.charAt(i)=='-')
        //     {
        //         if(t==0)
        //         {
        //             t=0;
        //             t=1;
        //             continue;
        //         }
        //         else
        //         {
        //             break;
        //         }
        //     }
        //     else if(s.charAt(i)=='+')
        //     {
        //         if(t2==0)
        //         {
        //             t=0;
        //             t2=1;
        //             continue;
        //         }
        //         else
        //             break;
        //     }
        //     else if(abc.indexOf(s.charAt(i))!=-1)
        //     {
        //         break;
        //     }
        //     else
        //     {
        //         x+=s.charAt(i);
        //     }
        // }
        // //x=new StringBuilder(x).reverse().toString();
        // int n=Integer.parseInt(x);
        // if(t==0)
        // {
        //     return n;
        // }
        // else
        // {
        //     return -n;
        // }
        int i=0;
        int n=s.length();
        while(i<n&&s.charAt(i)==' ')
        {
            i++;
        }
        int si=1;
        if(i<n&&(s.charAt(i)=='-'||s.charAt(i)=='+'))
        {
            if(s.charAt(i)=='-')
            {
                si=-1;
            }
            i++;
        }
        int r=0;
        while(i<n&&Character.isDigit(s.charAt(i)))
        {
            int x=s.charAt(i)-'0';
            if(r>Integer.MAX_VALUE/10||(r == Integer.MAX_VALUE / 10 && x > 7))
            {
                return si==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            r=r*10+x;
            i++;
        }
        return r*si;
    }
}