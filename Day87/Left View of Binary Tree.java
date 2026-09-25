/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            list.add(q.peek().data);
            for(int i=0;i<size;i++)
            {
                Node node=q.poll();
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
        }
        return list;
    }
}
