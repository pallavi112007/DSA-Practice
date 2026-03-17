import java.util.*;
import java.lang.*;
import java.io.*;

class QueueUsingArray
{
    int capacity;
    int[] arr;
    int rear,front;
    QueueUsingArray(int size){
        capacity=size;
        front=0;
        rear=-1;
        arr=new int[capacity];
    }
    void enqueue(int data)
    {
        if(rear==capacity-1)
        {
            System.out.print("queue is full");
            return;
        }
        arr[++rear]=data;
    }
    int dequeue()
    {
        if(front>rear)
        {
            System.out.print("Queue is empty ");
            return -1;
        }
        return arr[front++];
    }
    int peek()
    {
        if(front>rear)
        {
            System.out.print("Queue is empty ");
            return -1;
        }
        return arr[front];
    }
    void display()
    {
        if(front>rear)
        {
            System.out.print("Queue is empty ");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void reverse()
    {
        Stack<Integer> stack=new Stack<>();
        if(front>rear)
        {
            System.out.print("Queue is empty ");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            stack.push(arr[i]);
        }
        int i=front;
        while(!stack.isEmpty())
        {
            arr[i++]=stack.pop();
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    QueueUsingArray q=new QueueUsingArray(5);
	    q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(4);
	    q.enqueue(5);
	    q.reverse();
	    q.display();
		// your code goes here

	}
}
//output
5 4 3 2 1
