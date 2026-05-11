class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Map<Integer,Integer[]> m=new HashMap();
        // PriorityQueue<Integer> q=new PriorityQueue<>();
        // List<Integer[]> l=new ArrayList<>();
        // for(int[] a:points)
        // {
        //     double n=Math.pow((Math.pow(a[0],2)+Math.pow(a[1],2)),0.5);
        //     q.offer(n);
        //     m.put(n,a);
        // }
        // while(k>0)
        // {
        //     l.add(m.get(q.poll()));
        // }
        // return l;
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->((a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1])));
        for(int[] a:points)
        {
            q.offer(a);
        }
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++)
        {
            res[i]=q.poll();
        }
        return res;
    }
}