/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        Node slow=head;
        Node fast=head;
        int count=1;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                fast=fast.next;
                while(fast!=slow)
                {
                    count++;
                    fast=fast.next;
                }
                return count;
            }
        }
        return 0;
        // code here
        
    }
}
