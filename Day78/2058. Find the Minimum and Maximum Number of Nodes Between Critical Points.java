/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       ArrayList<Integer> list = new ArrayList<>();
       int arr[]=new int[2];
        ListNode temp=head;
        int pos=0;
        while(temp.next!=null && temp.next.next!=null)
        {
            if((temp.val > temp.next.val && temp.next.next.val > temp.next.val) || (temp.val < temp.next.val && temp.next.next.val < temp.next.val))
            {
                list.add(pos);
            }
            temp=temp.next;
            pos++;
        }
        if(list.size()<2)
        {
            return new int[]{-1,-1};
        }
        else{
            int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++)
        {
            min=Math.min(min,list.get(i)-list.get(i-1));
        }
        arr[0]=min;
        arr[1]=(list.get(list.size()-1))-list.get(0);
        return arr;
        }
    }
}
