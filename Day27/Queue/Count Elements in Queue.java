import java.util.*;
import java.lang.*;
import java.io.*;

class QueueUsingArray
{
        int rear,front;
        int arr[];
        int capacity;
    QueueUsingArray(int size)
    {
        capacity=size;
        arr=new int[size];
        rear=-1;front=0;
    }
    void enqueue(int data){
        if(rear==capacity-1)
        {
            System.out.print("Queue is fulled bro");
            return;
        }
        arr[++rear]=data;
    }
    int dequeue()
    {
        if(front>rear)
        {
            System.out.print("Queue is Empty");
            return -1;
        }
        return arr[front++];
    }
    int peek()
    {
        if(front>rear)
        {
            System.out.print("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    int count=0;
    void display()
    {
        if(front>rear)
        {
            System.out.print("Queue is empty");
        }
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    int size()
    {
        return (rear-front+1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    QueueUsingArray q=new QueueUsingArray(5);
	    q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(7);
	    q.enqueue(6);
	    q.display();
	    System.out.println("number of elements in queue: "+q.size());
	}
}
//output
1 2 3 7 6 
number of elements in queue: 5
