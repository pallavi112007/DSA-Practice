class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        int m=arr.length;
        int n=(m*(m+1))/2;
        int ans[]=new int[n];
        int l=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                ans[l++]=sum;
            }
        }
        Arrays.sort(ans);
        return ans[ans.length-k];
    }
}
