// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                StringBuilder m=new StringBuilder();
                for(int k=i;k<=j;k++)
                {
                    m.append(s.charAt(k));
                }
                System.out.print(m.toString()+" ");
            }
        }
    }
}
//output
Enter a string: abc
a ab abc b bc c 
