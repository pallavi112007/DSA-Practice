class Solution {
    public String interpret(String command) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<command.length();i++)
        {
            if((command.charAt(i)>='a' && command.charAt(i)<='z') || (command.charAt(i)>='A' && command.charAt(i)<='Z'))
            {
                st.append(command.charAt(i));
            }
            else if(i<command.length() && command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                st.append('o');
            }
        }
        return st.toString();
    }
}
