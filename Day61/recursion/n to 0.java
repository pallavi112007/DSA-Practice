import java.util.*;
class Solution{
    public static void print(int n)
    {
        if(n==-1)
        {
            return;
        }
         System.out.print(n+" ");
        print(n-1);
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
10 9 8 7 6 5 4 3 2 1 0 
