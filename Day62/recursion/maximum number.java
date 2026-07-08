// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Solution
{
    public static int maxnum(int i,int arr[],int max)
{
    if(i==arr.length)
    {
        return max;
    }
    else if(arr[i]>max)
    {
       max=arr[i];
    }
    return maxnum(i+1,arr,max);
}
    public static void main(String[] args)
    {
        int max=0;
        int arr[]={10,20,30,40,45,35,50,60,13};
        int i=0;
        System.out.println(maxnum(i,arr,max));
    }
}
//output
60
