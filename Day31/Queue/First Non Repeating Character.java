import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        String s="aabc";
        Queue<Character> q=new LinkedList<>();
        int[] freq=new int[26];
        int i;
        for(i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            boolean found=false;
            for(int j=0;j<=i;j++)
            {
                if(freq[s.charAt(j)-'a']==1)
                {
                    q.add(s.charAt(j));
                    found=true;
                    break;
                }
            }
            if(found==false)
            {
                q.add('#');
            }
        }
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+" ");
        }
	}
}
//output
a # b c
