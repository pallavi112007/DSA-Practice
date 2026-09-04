class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                arr[0]=mid;
                right=mid-1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        int low=0;
        int hight=nums.length-1;
        while(low<=hight)
        {
            int mid=low+(hight-low)/2;
            if(mid<nums.length && nums[mid]==target)
            {
                arr[1]=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                hight=mid-1;
            }
        }
        return arr;
    }
}
