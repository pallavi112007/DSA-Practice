import java.util.*;

class Solution {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};

        TreeSet<Integer> set = new TreeSet<>();

        for(int x : arr1) {
            set.add(x);
        }

        for(int x : arr2) {
            set.add(x);
        }

        System.out.println(set);
    }
}
