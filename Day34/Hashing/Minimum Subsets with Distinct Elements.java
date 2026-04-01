import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int arr[]={1,2,3,1,2,3,2};
	    HashMap<Integer,Integer> map=new HashMap<>();
	    for(int num:arr)
	    {
	        map.put(num,map.getOrDefault(num,0)+1);
	    }
	    int maxFreq=0;
	    for(int freq:map.values())
	    {
	        maxFreq=Math.max(maxFreq,freq);
	    }
	    System.out.println(maxFreq);
	}
}
//output
3
