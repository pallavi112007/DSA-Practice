/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        boolean leftToright=true;
        Stack<TreeNode> curr=new Stack<>();
        Stack<TreeNode> next=new Stack<>();
        curr.push(root);
        while(!curr.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            while(!curr.isEmpty())
            {
                TreeNode node=curr.pop();
                level.add(node.val);
                if(leftToright)
                {
                    if(node.left!=null)
                    {
                        next.push(node.left);
                    }
                    if(node.right!=null)
                    {
                        next.push(node.right);
                    }
                }
                else
                {
                    if(node.right!=null)
                    {
                        next.push(node.right);
                    }
                    if(node.left!=null)
                    {
                        next.push(node.left);
                    }
                }
            }
            leftToright=!leftToright;
            ans.add(level);
            Stack<TreeNode> temp=curr;
            curr=next;
            next=temp;
        }
        return ans;
    }
}
