import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int i=arr.length;
        System.out.print("the array is sorted?: ");
        System.out.print(issorted(i,arr));
    }
    public static boolean issorted(int i,int arr[])
    {
        if(i==1)
        {
            return true;
        }
        else if(arr[i-1]<arr[i-2])
        {
            return false;
        }
        return issorted(i-1,arr);
    }
}
//output
the array is sorted?: true
