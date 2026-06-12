class Solution {
    public String largestOddNumber(String num) {
        StringBuilder ans = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            ans.append(num.charAt(i));
        }

        int n = -1;
        int l = 0;

        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) != '0') {
                l = i;
                break;
            }
        }

        for (int i = ans.length() - 1; i >= l; i--) {
            int digit = ans.charAt(i) - '0';

            if (digit % 2 != 0) {
                n = i;
                break;
            }
        }

        for (int i = l; i <= n; i++) {
            res.append(ans.charAt(i));
        }

        return res.toString();
    }
}
