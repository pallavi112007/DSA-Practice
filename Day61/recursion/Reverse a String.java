class Solution {
    public static String reverseString(String s) {
      StringBuilder m=new StringBuilder();
       int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            m.append(s.charAt(i));
        }
        return m.toString();
    }
}
