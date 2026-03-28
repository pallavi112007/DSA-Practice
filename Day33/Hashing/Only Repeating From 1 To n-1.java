import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        HashSet < Integer > set = new HashSet < > ();
        int arr[] = {1,3,2,3,4};
        for (int i = 0; i < arr.length; i++)
        {
            if (set.contains(arr[i]))
            {
                System.out.print(arr[i]);
                return;
            }
            set.add(arr[i]);
        }
    }
}
//output
3
