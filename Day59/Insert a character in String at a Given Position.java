public class Solution {
    public static void main(String[] args) {

        String s = "Pallavi";
        int pos = 3;
        char ch='s';

        StringBuilder sb = new StringBuilder(s);
        sb.insert(pos,ch);

        System.out.println(sb.toString());
    }
}
