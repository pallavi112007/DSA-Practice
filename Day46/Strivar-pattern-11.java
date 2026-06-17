import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            int start=(i%2==0)?1:0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}
//output
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
