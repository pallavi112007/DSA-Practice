class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')' && !st.isEmpty() && st.peek()=='(')
            {
                count--;
                st.pop();
            }
            else
            {
                count++;
                st.push(s.charAt(i));
            }
        }
        return count;
    }
}
