import java.util.*;
class Solution{
    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("Hello, i am learning recursion");
        print(n-1);
    }
    public static void main(String[] args)
    {
        print(5);
    }
}
//output
Hello, i am learning recursion
Hello, i am learning recursion
Hello, i am learning recursion
Hello, i am learning recursion
Hello, i am learning recursion
