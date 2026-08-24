import java.util.*;
class Solution{
    public static void main(String[] args)
    {
        String s="i am PaLLavi";
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                ch=(char)(ch-32);
            }
            st.append(ch);
            
        }
            System.out.print(st);
    }
}
