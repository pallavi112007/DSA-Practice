class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int count=0;
        int sum=0;
        int left=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
        }
        max=sum;
        int right=cardPoints.length-1;
        for(left=k-1;left>=0;left--)
        {
            sum-=cardPoints[left];
            sum+=cardPoints[right];
            right--;
            max=Math.max(max,sum);
        }
        return max;
    }
}
