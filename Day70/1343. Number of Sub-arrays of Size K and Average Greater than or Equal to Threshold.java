class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int max=sum;
        if(max/k>=threshold)
        {
            count++;
        }
        for(int i=k;i<arr.length;i++)
        {
            sum=sum-arr[i-k]+arr[i];
            max=sum;
            if(max/k>=threshold)
            {
                count++;
            }
        }
        return count;
    }
}
