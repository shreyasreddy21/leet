class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j)
    {
        int m=grid.length;
        int n=grid[0].length;
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==0)
        {
            return 0;
        }
        grid[i][j]=0;
        int c=1;
        c+=dfs(grid,i+1,j);
        c+=dfs(grid,i-1,j);
        c+=dfs(grid,i,j+1);
        c+=dfs(grid,i,j-1);
        return c;
    }
}