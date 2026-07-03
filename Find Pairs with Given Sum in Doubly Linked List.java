/*
class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
*/

class Solution {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        List<List<Integer>> list=new LinkedList<>();
         if (head == null) {
            return list;
        }
        ListNode left=head;
        ListNode right=head;
        while(right.next!=null)
        {
            right=right.next;
        }
        while(left!=right && right.next!=left)
        {
            if(left.val+right.val==target)
            {
                list.add(Arrays.asList(left.val,right.val));
                left=left.next;
                right=right.prev;
            }
            else if(left.val+right.val>target)
            {
                right=right.prev;
            }
            else
            {
                left=left.next;
            }
        }
        return list;
    }
}
