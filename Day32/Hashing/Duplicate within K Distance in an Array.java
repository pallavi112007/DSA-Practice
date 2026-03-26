import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int k=3;
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    HashSet<Integer> set=new HashSet<>();
	    for(int i=0;i<n;i++)
	    {
	        if(set.contains(arr[i]))
	        {
	            System.out.print("true");
	            return;
	        }
	        else
	        {
	            set.add(arr[i]);
	        }
	        if(i>=k)
	        {
	            set.remove(arr[i-k]);
	        }
	    }
	    System.out.print("flase");
	}
}
//input
6
1 2 3 1 4 5
//output
true
