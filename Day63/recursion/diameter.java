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
    int diameter=0;
    public int height(TreeNode curr)
    {
        if(curr==null)
        {
            return -1;
        }
        int l=height(curr.left);
        int r=height(curr.right);
        diameter=Math.max(diameter,l+r+2);
        return 1+Math.max(r,l);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
}
