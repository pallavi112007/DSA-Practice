class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int left=max;
        int right=sum;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int day=0;
            int count=0;
            for(int i=0;i<weights.length;i++)
            {
                if(count+weights[i]<=mid)
                {
                    count+=weights[i];
                }
                else
                {
                    day++;
                    count=0;
                    count+=weights[i];
                }
            }
            if(day<days)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
}
