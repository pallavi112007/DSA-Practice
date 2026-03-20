import java.util.*;
class Numbers
{
    int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args)
    {
        Numbers obj = new Numbers();
        int result = obj.sum(5);
        System.out.println(result);
    }
}
//output
15
