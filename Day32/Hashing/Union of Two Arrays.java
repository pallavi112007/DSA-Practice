import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int a[]={1, 2, 3, 2, 1};
	    int b[]={3, 2, 2, 3, 3, 2};
	    HashSet<Integer> set=new HashSet<>();
	    for(int i=0;i<a.length;i++)
	    {
	        set.add(a[i]);
	    }
	     for(int i=0;i<b.length;i++)
	    {
	        set.add(b[i]);
	    }
	    System.out.print(set);
	}
}
//output
[1, 2, 3]
