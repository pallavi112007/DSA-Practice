class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int j=0;
        int k=n;
        for(int i=0;i<nums.length;i+=2)
        {
            arr[i]=nums[j];
            arr[i+1]=nums[k];
            j++;
            k++;
        }
        return arr;
    }
}
