class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[k];
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int i=0;
        for(Map.Entry<Integer,Integer> entry:list)
        {
            int num=entry.getKey();
            if(i==k){
            break;
            }
            arr[i++]=num;
        }
        return arr;
    }
}
