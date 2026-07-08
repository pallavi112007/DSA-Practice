import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        int arr[]={1,3,3,4,2,2,5,4};
        int i=arr.length-1;
        System.out.print("The last repeated elements is: ");
        System.out.print(last(i,arr,list));
    }
    public static int last(int i,int arr[],List<Integer> list)
    {
        if(i<0)
        {
            return -1;
        }
        else if(list.contains(arr[i]))
        {
            return arr[i];
        }
        else
        {
            list.add(arr[i]);
        }
        return last(i-1,arr,list);
    }
}
//output
The last repeated elements is: 2
