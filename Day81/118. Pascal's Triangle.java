class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        while(numRows>0)
        {
             list.add(new ArrayList(list1));
            List<Integer> list2=new ArrayList<>();
            for(int i=0;i<=list1.size();i++)
            {
                if(i==0 || i==list1.size())
                {
                     list2.add(1);
                }
                else
                {
                    list2.add(list1.get(i-1)+list1.get(i));
                }
            }
            numRows--;
            list1.clear();
            list1.addAll(list2);
        }
        return list;
    }
}
