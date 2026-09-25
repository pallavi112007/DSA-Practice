/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static void dfs(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> arr)
{
    if(root==null)
    {
        return;
    }
    arr.add(root.data);
    if(root.left==null && root.right==null)
    {
        ans.add(new ArrayList<>(arr));
    }
    else
    {
        dfs(root.left,ans,arr);
        dfs(root.right,ans,arr);
    }
    arr.remove(arr.size()-1);
}
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(root,ans,arr);
        return ans;
    }
}
