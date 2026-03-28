import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        HashSet < Integer > set = new HashSet < > ();
        int arr[] = {1,3,2,3,4};
        int low=4;
        int high=6;
        for (int i = 0; i < arr.length; i++)
        {
            set.add(arr[i]);
        }
        for (int i = low; i <= high; i++)
        {
            if (!set.contains(i))
            {
               System.out.print(i+" ");
            }
        }
    }
}
//output
5 6 
