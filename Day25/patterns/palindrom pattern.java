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
		    //to print the spaces 
		    for(int j=1;j<=space;j++)
		    {
		        System.out.print(" ");
		    }
		    //to print the starts
		    int num=1;
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print(j);
		    }
		    for(int j=2;j<=i;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}

	}
}
//output
   1
  212
 32123
4321234
