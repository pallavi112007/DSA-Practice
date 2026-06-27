import java.util.*;

class Solution {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int ind[] = {3, 2, 0, 1};

        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[ind[i]] = arr[i];
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
