import java.util.*;

class Solution {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
//output
[1,2,3,6]
