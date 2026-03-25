import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int[] a={10,20,30,40};
        int[] b={4,20,30,10};
        if(a.length!=b.length)
        {
            System.out.print("False");
            return;
        }
        else{
        int[] freq=new int[100];
        for(int i=0;i<a.length;i++)
        {
            freq[a[i]]++;
        }
        for(int i=0;i<b.length;i++)
        {
            freq[b[i]]--;
        }
        for(int i=0;i<100;i++)
        {
            if(freq[i]!=0)
            {
                System.out.print("False");
                return;
            }
        }
        System.out.print("True");
        }
        
    }
}
//output
False
