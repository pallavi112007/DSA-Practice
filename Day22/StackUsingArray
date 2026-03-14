import java.util.*;
class StackUsingArray
{
    int[] arr;
    int top;
    int capacity;
    StackUsingArray(int size)
    {
        top=-1;
        capacity=size;
        arr=new int[capacity];
    }
    public void push(int data)
    {
        if(top==capacity-1)
        {
            System.out.println("stack is Filled already bro\n");
            return;
        }
        arr[++top]=data;
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.print("stack is empty bro ");
            return -1;
        }
        return arr[top--];
    }
    public int top()
    {
        if(top==-1)
        {
            System.out.print("stack is empty");
            return -1;
        }
        return arr[top];
    }
    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        StackUsingArray stack=new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("top element is: "+stack.top());
        stack.display();
        System.out.println();
        System.out.println("popped element is: "+stack.pop());
        System.out.println("top element is: "+stack.top());
        stack.display();
    }
}
