class Solution {
    public String countAndSay(int n) {
        int k=1;
        StringBuilder st=new StringBuilder("1");
        while(k<n)
        {
            StringBuilder stt=new StringBuilder();
            int j=0;
            int i=0;
            while(i<st.length())
            {
                int count=0;
                while(i<st.length() && j<st.length() && st.charAt(i)==st.charAt(j))
                {
                    j++;
                    count++;
                }
                stt.append(count);
                stt.append(st.charAt(i));
                i=j;
            }
            st.setLength(0);
            st.append(stt);
            k++;
        }
        return st.toString();
    }
}
