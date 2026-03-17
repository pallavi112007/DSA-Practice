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
		    for(int j=1;j<=n;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}

	}
}
//output
    ****
   ****
  ****
 ****
****
