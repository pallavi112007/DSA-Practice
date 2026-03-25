class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long total=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                total+=grid[i][j];
            }
        }
        if(total%2!=0)
        {
            return false;
        }
        long half=total/2;
        long sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=grid[i][j];
            }
            if(sum==half) return true;
        }
        sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum+=grid[j][i];
            }
            if(sum==half) return true;
        }
        return false;
        
    }
}
