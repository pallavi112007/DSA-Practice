import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int summ=0;
        int arr[]={1,2,3,4,5};
        int i=0;
        System.out.print(sum(i,arr,summ));
    }
    public static int sum(int i,int arr[],int summ)
    {
        if(i==arr.length)
        {
            return summ;
        }
        else if(i<arr.length)
        {
            summ+=arr[i];
        }
        return sum(i+1,arr,summ);
    }
}
//output
15
