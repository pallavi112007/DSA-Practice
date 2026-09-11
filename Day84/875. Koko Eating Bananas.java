class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int max=0;
        int k=0;
        for(int j=0;j<piles.length;j++)
        {
            max=Math.max(max,piles[j]);
        }
        while(i<=max)
        {
            int n=0;
            int mid=i+(max-i)/2;
            for(int j=0;j<piles.length;j++)
            {
                n+=Math.ceil((double)piles[j]/mid);
            }
            if(n<=h)
            {
                k=mid;
                max=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return k;
    }
}
