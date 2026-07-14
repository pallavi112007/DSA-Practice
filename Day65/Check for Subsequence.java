class Solution {
    public boolean isSubSeq(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int j=0;
        for(int i=0;i<s2.length();i++)
        {
            if(j<s1.length() && s2.charAt(i)==s1.charAt(j))
            {
                j++;
            }
        }
        if(j==s1.length())
        {
            return true;
        }
        return false;
    }
};
