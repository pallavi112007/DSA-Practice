class Solution {

    public List<Integer> findSplit(int[] arr) {
        List<Integer> list=new ArrayList<>();
        if(arr.length<3)
        {
            list.add(-1);
            list.add(-1);
            return list;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        if(sum%3!=0)
        {
            list.add(-1);
            list.add(-1);
            return list;
        }
        else
        {
            int sum1=0;
            int j=-1;
            for(int i=0;i<arr.length-2;i++)
            {
                sum1+=arr[i];
                if(sum1==sum/3)
                {
                    j=i;
                    list.add(i);
                    break;
                }
            }
            if(j==-1)
            {
                list.clear();
                list.add(-1);
                list.add(-1);
                return list;
            }
            int k=-1;
            int sum2=0;
            for(int i=j+1;i<arr.length-1;i++)
            {
                sum2+=arr[i];
                if(sum2==sum/3)
                {
                    k=i;
                    list.add(i);
                    break;
                }
            }
            if(k==-1)
            {
                list.clear();
                list.add(-1);
                list.add(-1);
                return list;
            }
            int sum3=0;
            int t=0;
            for(int i=k+1;i<arr.length;i++)
            {
                t++;
                sum3+=arr[i];
                if(sum3==sum/3)
                {
                    t=i;
                    break;
                }
            }
            if(t==-1)
                {
                    list.clear();
                    list.add(-1);
                    list.add(-1);
                    return list;
                }
        }
        return list;
    }
}
