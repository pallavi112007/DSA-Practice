import java.util.*;
class Solution{
    public static void rev(int n)
    {
        if(n<10)
        {
            System.out.print(n);
        }
        else
        {
            System.out.print(n%10);
            rev(n/10);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        rev(n);
    }
}
//output
Enter a number:1234567
7654321
