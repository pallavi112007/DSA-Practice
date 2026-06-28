/*

class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

}
*/
class Solution {
    public Node makeUnion(Node head1, Node head2) {
        Node dummy=new Node(-1);
        Node tail=dummy;
        HashSet<Integer> set=new HashSet<>();
        Node curr=head1;
        while(curr!=null)
        {
            if(!set.contains(curr.data)){
            tail.next=new Node(curr.data);
            tail=tail.next;
            set.add(curr.data);
            curr=curr.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        Node curr1=head2;
        while(curr1!=null)
        {
            if(!set.contains(curr1.data))
            {
                tail.next=new Node(curr1.data);
                set.add(curr1.data);
                curr1=curr1.next;
                tail=tail.next;
            }
            else
            {
                 curr1=curr1.next;
            }
        }
        return dummy.next;
    }
}
