class Solution {
    public ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<l.length;i++)
        {
            for(int j=l[i];j<=r[i];j++)
            {
                list.add(j);
            }
        }
        List<Integer> list1=new ArrayList<>();
        for(int k=0;k<rank.length;k++)
        {
            list1.add(list.get(rank[k]-1));
        }
        return (ArrayList<Integer>) list1;
    }
}
