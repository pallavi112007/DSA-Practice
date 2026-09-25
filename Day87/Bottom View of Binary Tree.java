/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/
class Pair
{
    Node node;
    int pd;
    Pair(Node node,int pd)
    {
        this.node=node;
        this.pd=pd;
    }
}
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Queue<Pair> q=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        q.offer(new Pair(root,0));
        map.put(0,root.data);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            Node node=p.node;
            int pd=p.pd;
            map.put(pd,node.data);
            if(min>pd)
            {
                min=pd;
            }
            if(max<pd)
            {
                max=pd;
            }
            if(node.left!=null)
            {
                q.offer(new Pair(node.left,pd-1));
            }
            if(node.right!=null)
            {
                q.offer(new Pair(node.right,pd+1));
            }
        }
        for(int i=min;i<=max;i++)
        {
            list.add(map.get(i));
        }
        return list;
    }
}
