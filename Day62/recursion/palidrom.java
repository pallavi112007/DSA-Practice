// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Solution
{
    public static boolean ispali(int i,int j,String s)
{
    if(i>=j)
    {
        return true;
    }
    else if(s.charAt(i)!=s.charAt(j))
    {
        return false;
    }
    return ispali(i+1,j-1,s);
}
    public static void main(String[] args)
    {
        String s="abbba";
        int i=0;
        int j=s.length()-1;
        System.out.println(ispali(i,j,s));
    }
}
