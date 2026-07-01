class Solution {
    ArrayList<Integer> findSurpasser(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        // code here
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    count++;
                }
            }
            ans.add(count);
            count=0;
        }
        return ans;
    }
}
