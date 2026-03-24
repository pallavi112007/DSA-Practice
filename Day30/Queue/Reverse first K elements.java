import java.util.*;
class Main{
    public static void main(String[] args)
    {
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    int k=3;
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<k;i++)
    {
        st.push(q.remove());
    }
    while(!st.isEmpty())
    {
        q.add(st.pop());
    }
    for(int i=0;i<q.size()-k;i++)
    {
        q.add(q.remove());
    }
    System.out.print(q);
    }
}
//output
[3, 2, 1, 4, 5]
