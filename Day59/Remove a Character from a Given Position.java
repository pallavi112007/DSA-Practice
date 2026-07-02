class Solution {
    public String removeCharacter(String s, int pos) {
        // code here
        StringBuilder sb=new StringBuilder(s);
        sb.deleteCharAt(pos);
        return sb.toString();
    }
}
