/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
} */
class Pair{
    Node node;
    int pd;
    Pair(Node node,int pd)
    {
        this.node=node;
        this.pd=pd;
    }
}

class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        Queue<Pair> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if (root == null)
                return list;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        q.offer(new Pair(root,0));
        map.put(0,root.data);
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            Node node=p.node;
            int pd=p.pd;
            if(!map.containsKey(pd))
            {
                map.put(pd,node.data);
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
        for(int value:map.values())
        {
            list.add(value);
        }
        return list;
    }
}
