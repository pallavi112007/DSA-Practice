/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        Node prev=null;
        Node curr=head;
        int count=1;
        while(curr!=null)
        {
            if(count%k==0)
            {
                prev.next=curr.next;
                curr=curr.next;
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }
            count++;
        }
        return head;
    }
}
