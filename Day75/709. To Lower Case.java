class Solution {
    public String toLowerCase(String s) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                st.append(Character.toLowerCase(s.charAt(i)));
            }
            else
            {
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }
}
