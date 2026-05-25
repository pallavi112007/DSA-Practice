import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={70,60,40,30,5,10,20};
        int target=10;
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
                return;
            }
            if(arr[mid]>=arr[left])
            {
                if(target<arr[mid] && target>=arr[left])
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(arr[mid]>target && target<=arr[right])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
    }
}
//output
5
