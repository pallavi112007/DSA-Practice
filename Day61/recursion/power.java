import java.util.*;
class Solution{
    public static int power(int n,int m)
    {
        if(m==1)
        {
            return 1;
        }
        return n*power(n,m-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Enter a number:");
        int m=sc.nextInt();
        int result=power(n,m);
        System.out.println(result);
    }
}
//output
Enter a number:2
Enter a number:5
16
