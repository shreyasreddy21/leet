class Solution {
    public String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        int res[]=new int[n1+n2];
        for(int i=n1-1;i>=0;i--)
        {
            for(int j=n2-1;j>=0;j--)
            {
                int m=(num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int s=m+res[i+j+1];
                res[i+j+1]=s%10;
                res[i+j]+=s/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int n:res)
        {
            if(!(sb.length()==0&&n==0))
            {
                sb.append(n);
            }
        }
        return sb.length()==0?"0":sb.toString();
    }
}