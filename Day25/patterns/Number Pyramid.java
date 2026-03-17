import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n=4;
		for(int i=0;i<=n;i++)
		{
		    int space=n-i;
		    for(int j=1;j<=space;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}

	}
}
//output
   1 
  2 2 
 3 3 3 
4 4 4 4 
