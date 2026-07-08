import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int min=Integer.MAX_VALUE;
        int arr[]={10,30,25,5,60};
        int i=0;
        System.out.print(minnum(i,arr,min));
    }
    public static int minnum(int i,int arr[],int min)
    {
        if(i==arr.length)
        {
            return min;
        }
        if(arr[i]<min)
        {
            min=arr[i];
        }
        return minnum(i+1,arr,min);
    }
}
