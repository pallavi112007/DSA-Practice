class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)k*m>bloomDay.length)
        {
            return -1;
        }
        int left=1;
        int right=1000000000;
        int min=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int count=0;
            int count1=0;
            for(int i=0;i<bloomDay.length;i++)
            {
                if(bloomDay[i]<=mid)
                {
                    count++;
                }
                else
                {
                    count=0;
                }
                if(count==k)
                {
                    count1++;
                    count=0;
                }
            }
            if(count1>=m)
            {
                min=mid;
                count1=0;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return min;
    }
}
