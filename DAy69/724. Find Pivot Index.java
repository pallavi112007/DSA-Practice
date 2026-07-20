class Solution {
    public int pivotIndex(int[] nums) {
        int right=0;
        for(int i=0;i<nums.length;i++)
        {
            right+=nums[i];
        }
        int sum=right;
        int presum=0;
        for(int j=0;j<nums.length;j++)
        {

             sum=right-presum-nums[j];
            if(presum==sum)
            {
                return j;
            }
            presum+=nums[j];
        }
        return -1;
    }
}
