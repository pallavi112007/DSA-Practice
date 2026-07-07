import java.util.*;
class Solution{
    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        print(n);
        System.out.println();
    }
}
//output
Enter a number:10
1 2 3 4 5 6 7 8 9 10 
