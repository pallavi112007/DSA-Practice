import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        String s="abcbaa";
        int k=3;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                HashSet<Character> list=new HashSet<>();
                for(int m=i;m<=j;m++)
                {
                    list.add(s.charAt(m));
                }
                if(list.size()==k)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
