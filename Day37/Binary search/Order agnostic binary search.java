import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};

        int target = 40;

        int left = 0;
        int right = arr.length - 1;

        boolean isAscending;
        // Check order
        if(arr[left] < arr[right])
        {
            isAscending = true;
        }
        else
        {
            isAscending = false;
        }

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target)
            {
                System.out.println("Element found at index: " + mid);
                return;
            }
            // Ascending Binary Search
            if(isAscending)
            {
                if(target > arr[mid])
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
            // Descending Binary Search
            else
            {
                if(target > arr[mid])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
        }
        System.out.println("Element not found");
    }
}
//output
Element found at index: 3
