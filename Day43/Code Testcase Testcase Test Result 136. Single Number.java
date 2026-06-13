class Solution {
    public int singleNumber(int[] nums) {
        int arr[]=new int[nums.length];
        ArrayList<Integer> set=new ArrayList();
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            {
                set.remove(Integer.valueOf(nums[i]));
            }
        }
        return set.get(0);
        
    }
}
