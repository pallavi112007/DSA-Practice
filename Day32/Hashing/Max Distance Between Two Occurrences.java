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
	    HashMap<Integer,Integer> mp=new HashMap<>();
	    int max=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(mp.containsKey(arr[i]))
	        {
	            int diff=(i-mp.get(arr[i]));//distance = current index − first index
	            max=Math.max(max,diff);
	            
	        }
	        else
	        {
	            mp.put(arr[i],i);
	        }
	    }
	    System.out.print(max);

	}
}
//input
12
3 2 1 2 1 4 5 8 6 7 4 2
//output
10
