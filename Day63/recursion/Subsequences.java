import java.util.*;

class Solution {

    public static void subseq(int i, String s, String a) {

        if (i == s.length()) {
            System.out.println(a);
            return;
        }

        subseq(i + 1, s, a + s.charAt(i));

        subseq(i + 1, s, a);
    }

    public static void main(String[] args) {

        String s = "pal";

        subseq(0, s, "");
    }
}
//output
pal
pa
pl
p
al
a
l
