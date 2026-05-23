//find frist one place in binary of number
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int position=0;
        while((n&1)==0)
        {
            n=n>>1;
            position++;
        }
        System.out.print(position);
    }
}
//output
Enter a number: 10
1
