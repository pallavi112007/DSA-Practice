/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy=new Node(-1);
        Node tail=dummy;
        Node curr=head1;
        Node curr1=head2;
        while(curr!=null && curr1!=null)
        {
            if(curr.data>curr1.data)
            {
                tail.next=new Node(curr1.data);
                tail=tail.next;
                curr1=curr1.next;
            }
            else
            {
                tail.next=new Node(curr.data);
                tail=tail.next;
                curr=curr.next;
            }
        }
        while(curr!=null)
        {
            tail.next=new Node(curr.data);
            tail=tail.next;
            curr=curr.next;
        }
        while(curr1!=null)
        {
            tail.next=new Node(curr1.data);
            tail=tail.next;
            curr1=curr1.next;
        }
        return dummy.next;
    }
}
