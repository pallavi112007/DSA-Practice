class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int k=nums.length-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int leftt=nums[left]*nums[left];
            int rightt=nums[right]*nums[right];
            if(leftt<rightt)
            {
                arr[k--]=rightt;
                right--;
            }
            else
            {
                arr[k--]=leftt;
                left++;
            }
        }
        return arr;
    }
}
