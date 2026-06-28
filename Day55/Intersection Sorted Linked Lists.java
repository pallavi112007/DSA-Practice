/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        HashSet<Integer> set=new HashSet<>();
        Node curr=head1;
        while(curr!=null)
        {
            set.add(curr.data);
            curr=curr.next;
        }
        Node dummy=new Node(-1);
        Node tail=dummy;
        Node curr1=head2;
        while(curr1!=null)
        {
            if(set.contains(curr1.data))
            {
                tail.next=new Node(curr1.data);
                tail=tail.next;
            }
            curr1=curr1.next;
        }
        return dummy.next;
    }
}
