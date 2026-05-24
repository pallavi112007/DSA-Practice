
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        int target=5;
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                System.out.println(arr[mid]);
                return;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        if(right>=0)
        {
            System.out.println("nearst small value of target is: "+arr[right]);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
//output
-1
