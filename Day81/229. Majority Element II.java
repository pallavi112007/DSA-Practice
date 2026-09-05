class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int value:map.keySet())
        {
            if((map.get(value))>n)
            {
                list.add(value);
            }
        }
        return list;
    }
}
