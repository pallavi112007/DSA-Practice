import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int[] a={10,20,30,40};
        int[] b={5,7,9,6};
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(b[i]==a[j])
                {
                    System.out.print("false");
                    return;
                }
            }
        }
        System.out.print("True");
    }
}
//output
True
