import java.util.*;

class Solution {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        System.out.println(result);
    }
}
//output
[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]
