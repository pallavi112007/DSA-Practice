import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s=sc.next();
        int a=0;
         int power = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
             int digit = s.charAt(i) - '0';
            a+=digit*(int)Math.pow(2,power);
            power++;
        }
        System.out.print(a);
    }
}
//output
Enter number: 1101
  13
