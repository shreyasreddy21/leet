class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char c:tasks)
        {
            freq[c-'A']++;
        }
        int m=0;
        for(int i:freq)
        {
            m=Math.max(m,i);
        }
        int c=0;
        for(int i:freq)
        {
            if(i==m)
            {
                c++;
            }
        }
        int x=(m-1)*(n+1)+c;
        return Math.max(tasks.length,x);
    }
}