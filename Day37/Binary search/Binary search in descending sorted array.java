import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};
        int target = 45;
        int left = 0;
        int right = arr.length - 1;
         int mid = left + (right - left) / 2;
        while(left < right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
//output
[50, 40, 30, 20, 10]
