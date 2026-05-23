import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        String a="";
        while(n>0)
        {
            a+=n%2;
            n=n/2;
        }
        StringBuilder sb=new StringBuilder(a);
        String b=sb.reverse().toString();
        System.out.print(b);
    }
}
//output
enter a number: 10
  1010
