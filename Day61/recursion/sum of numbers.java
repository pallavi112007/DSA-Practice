import java.util.*;
class Solution{
    public static int print(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+print(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int result=print(n);
        System.out.println(result);
    }
}
//output
Enter a number:5
15
