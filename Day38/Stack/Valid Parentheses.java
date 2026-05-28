import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Stack<Character> st = new Stack<>();

        String s = "{([])}";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            // opening brackets
            if(ch == '(' || ch == '[' || ch == '{')
            {
                st.push(ch);
            }

            // closing brackets
            else
            {
                if(st.isEmpty())
                {
                    System.out.println("invalid");
                    return;
                }

                if((ch == ')' && st.peek() == '(') ||
                   (ch == '}' && st.peek() == '{') ||
                   (ch == ']' && st.peek() == '['))
                {
                    st.pop();
                }
                else
                {
                    System.out.println("invalid");
                    return;
                }
            }
        }

        if(st.isEmpty())
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
