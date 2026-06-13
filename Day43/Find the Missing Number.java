import java.util.*;

class Solution {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8};

        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println(expectedSum - sum);
    }
}
