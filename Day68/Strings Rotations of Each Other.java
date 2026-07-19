class Solution {
    public boolean areRotations(String s1, String s2) {
        String s3=s1+s1;
        return s3.indexOf(s2) != -1;
    }
}
