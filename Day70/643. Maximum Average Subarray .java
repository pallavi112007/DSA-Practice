class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long max;
        if(nums.length==1)
        {
            max=nums[0];
            return max;
        }
        long sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        max=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return (double)max/k;
    }
}
