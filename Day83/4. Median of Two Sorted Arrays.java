class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        List<Integer> list=new ArrayList<>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                list.add(nums1[i]);
                i++;
            }
            else
            {
                list.add(nums2[j]);
                j++;
            }
        }
        for(int k=i;k<nums1.length;k++)
        {
            list.add(nums1[k]);
        }
        for(int  k=j;k<nums2.length;k++)
        {
            list.add(nums2[k]);
        }
        int n=list.size()/2;
        if(list.size()%2==0)
        {
            double p=(list.get(n)+list.get(n-1))/2.0;
            return p;
        }
        return (double)list.get(n);
    }
}
