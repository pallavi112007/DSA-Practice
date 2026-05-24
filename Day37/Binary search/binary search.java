import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,25,28,35,40,50};
        int left=0,right=arr.length-1;
        int target=35;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
                return;
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
        System.out.print("Element not found");
    }
}
//output
4
