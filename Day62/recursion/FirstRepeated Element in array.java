import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        int arr[]={1,2,3,3,5};
        int i=0;
        System.out.print("The first repeated elements is: ");
        System.out.print(sum(i,arr,list));
    }
    public static int sum(int i,int arr[],List<Integer> list)
    {
        if(i==arr.length)
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
        return sum(i+1,arr,list);
    }
}
//output
The first repeated elements is: 3
