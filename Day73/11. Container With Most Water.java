class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int maxwater=Integer.MIN_VALUE;
        int right=height.length-1;
        while(left<right)
        {
            int n=right-left;
            int min=Math.min(height[right],height[left]);
            maxwater=Math.max(maxwater,n*min);
            if(height[right]<height[left])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return maxwater;
    }
}
