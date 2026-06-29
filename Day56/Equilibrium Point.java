class Solution {
    public static int findEquilibrium(int arr[]) {
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int left=0;
        for(int i=0;i<arr.length;i++)
        {
            sum-=arr[i];
            if(left==sum)
            {
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}
