import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int a[]={1, 5, 7, -1, 5};
	    int target = 6;
	    int count=0;
	    HashSet<Integer> set=new HashSet<>();
	    for(int i=0;i<a.length-1;i++)
	    {
	        int found=target-a[i];
            if(set.contains(found))
            {
                System.out.print("yes");
                return;
            }
            else
            {
                set.add(a[i]);
            }
	    }
	    System.out.print("No");
	}
}
//output
yes
