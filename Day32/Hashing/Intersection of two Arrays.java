import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int a[]={1, 2, 1, 3, 1};
	    int b[]={3, 1, 3, 4, 1};
	    HashSet<Integer> set=new HashSet<>();
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=0;j<b.length;j++)
	        {
	            if(a[i]==b[j])
	            {
	                set.add(a[i]);
	            }
	       }
	    }
	    System.out.print(set);
	}
}
//output
[1, 3]
