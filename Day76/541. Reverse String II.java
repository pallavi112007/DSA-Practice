class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder st=new StringBuilder(s);
        for(int start=0;start<st.length();start+=2*k)
        {
            int left=start;
            int right=Math.min(start+k-1,st.length()-1);
            while(left<right)
            {
                char temp=st.charAt(left);
                st.setCharAt(left,st.charAt(right));
                st.setCharAt(right,temp);
                left++;
                right--;
            }
        }
        return st.toString();
    }
}
