// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        int target=28;
        int left=0,right=arr.length-1;
        int mid=left+(right-left)/2;
        while(left<=right)
        {
            mid=left+(right-left)/2;
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
        int m=arr[left]-target;
        int n=target-arr[right];
        if(m>n)
        {
            System.out.println(arr[right]);
        }
        else
        {
            System.out.println(arr[left]);
        }
    }
}
//output
30
