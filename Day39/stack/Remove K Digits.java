import java.util.*;

class Solution3 {
    public static void main(String[] args) {
        String s = "541892";
        int k = 2;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : st) {
            ans.append(ch);
        }

        while (ans.length() > 0 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        System.out.println(ans.length() == 0 ? "0" : ans.toString());
    }
}
