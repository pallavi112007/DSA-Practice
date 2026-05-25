import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int arr[]={70,80,0,1,2,3};
        int left=0;
        int right=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>=arr[left])
            {
                ans=Math.min(ans,arr[left]);
                left=mid+1;
            }
            else
            {
                ans=Math.min(ans,arr[mid]);
                right=mid-1;
            }
        }
        System.out.println(ans);
    }
}
//output
0
