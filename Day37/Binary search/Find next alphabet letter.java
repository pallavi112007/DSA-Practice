// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s[]={'a','b','d','f','z'};
        char target='c';
        int left=0,right=s.length-1;
        int mid=left+(right-left)/2;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(s[mid]==target)
            {
                System.out.println(s[mid]);
                return;
            }
            else if(s[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        System.out.println(s[left % s.length]);
    }
}
//output
d
