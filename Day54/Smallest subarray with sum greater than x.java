class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int start=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
             sum+=arr[i];
            while(sum>x)
            {
                min=Math.min(min,i-start+1);
                sum-=arr[start];
                start++;
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return 0;
        }
        return min;
    }
}
