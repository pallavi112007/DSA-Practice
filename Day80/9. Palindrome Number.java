class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) { return false; }
        StringBuilder st=new StringBuilder();
        while(x>0)
        {
            int n=x%10;
            st.append(n);
            x=x/10;
        }
        int left=0;
        int right=st.length()-1;
        while(left<right)
        {
            if(st.charAt(left)!=st.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
