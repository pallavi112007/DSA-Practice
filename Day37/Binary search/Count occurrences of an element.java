
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,20,20,20,20,20};
        int left=0,right=arr.length-1;
        int target=20;
        int ans=0;
        int lastoccu=0;
        int firstoccu=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                firstoccu=mid;
                right=mid-1;
            }
            else if(target>arr[mid])
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        left = 0;
        right = arr.length - 1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                lastoccu=mid;
                left=mid+1;
            }
            else if(target>arr[mid])
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        int count = lastoccu - firstoccu+1;
        System.out.println("no.of time occurs: "+count);
    }
}
//output
no.of time occurs: 6
